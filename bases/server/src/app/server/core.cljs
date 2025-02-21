(ns app.server.core
  (:require [reitit.core :as r]
            [app.server.async :refer [js-await]]
            [app.server.cf :as cf :refer [defclass]]))

(def router
  (r/router
   ["/api"
    ["/todos" ::todos]]))

;; args:
;;  route: Reitit route data
;;  request: js/Request object https://developers.cloudflare.com/workers/runtime-apis/request/
;;  env: Environment object containing env vars and bindings to Cloudflare services https://developers.cloudflare.com/workers/configuration/environment-variables/
;;  ctx: The Context API provides methods to manage the lifecycle of your Worker https://developers.cloudflare.com/workers/runtime-apis/context/
(defmulti handle-route (fn [route request env ctx]
                         [(-> route :data :name) (keyword (.-method ^js request))]))

(defmethod handle-route [::todos :GET] [route request env ctx]
  (js-await [{:keys [success results]} {:success true :results {:hello :world}}]
            (if success
              (cf/response-edn results {:status 200})
              (cf/response-error))))

;; entry point
(def handler
  #js {:fetch (cf/with-handler router handle-route)})