(ns app.html.core
  (:require-macros [hiccups.core :as hiccups :refer [html]])
	(:require [hiccups.runtime :as hiccupsrt]
            [app.html.index :as index]
            #_[app.html.dashboard :as dashboard]))

;; Prepare the hicup to return it as html
(defn template [html-body title]
  [:html
   [:head
    [:title title]
    [:meta {:name "viewport" :content "width=device-width,initial-scale=1"}]
    [:link {:href "tailwind.min.css" :rel "stylesheet"}]
    [:script {:src "htmx.min.js"}]
    [:script {:src "hyperscript.min.js"}]]
   [:body (html html-body)]])

(defn ok [body]
  {:status 200
   :headers {"Content-Type" "text/html" "Content-Security-Policy" "img-src 'self'"}
   :body (-> body
             (html)
             (str))})

(defn respond [content title]
  (html (template content title)))

(defn respond-with-params [content value title]
  (ok (template (str (html (content value))) title)))

(defn index-page-handler [context]
  (respond index/index-page "Index"))

#_(defn dashboard-handler [context]
  (println "TEST: " (-> context :session))
  (let [session (-> context :session)]
    (if (empty? session)
      (response/redirect "/sign-in")
      (respond-with-params dashboard/content {:email (:email session) :created-at (:created-at session)} "Dashboard"))))

(def routes
  #{["/" :get index-page-handler :route-name ::index-page]
    #_["/dashboard"
     :get [(body-params/body-params) dashboard-handler]
     :route-name ::dashboard]})