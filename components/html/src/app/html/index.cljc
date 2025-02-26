(ns app.html.index)

(defn index-page []
  [:div
   {:class "bg-white"}
   [:div
    {:class "relative isolate px-6 pt-14 lg:px-8"}
    [:div
     {:class
      "absolute inset-x-0 -top-40 -z-10 transform-gpu overflow-hidden blur-3xl sm:-top-80",
      :aria-hidden "true"}
     [:div
      {:class
       "relative left-[calc(50%-11rem)] aspect-1155/678 w-[36.125rem] -translate-x-1/2 rotate-[30deg] bg-linear-to-tr from-[#ff80b5] to-[#9089fc] opacity-30 sm:left-[calc(50%-30rem)] sm:w-[72.1875rem]",
       :style
       "clip-path: polygon(74.1% 44.1%, 100% 61.6%, 97.5% 26.9%, 85.5% 0.1%, 80.7% 2%, 72.5% 32.5%, 60.2% 62.4%, 52.4% 68.1%, 47.5% 58.3%, 45.2% 34.5%, 27.5% 76.7%, 0.1% 64.9%, 17.9% 100%, 27.6% 76.8%, 76.1% 97.7%, 74.1% 44.1%)"}]]
    [:div
     {:class "mx-auto max-w-2xl py-32 sm:py-48 lg:py-56"}
     [:div
      {:class "text-center"}
      [:h1
       {:class
        "text-5xl font-semibold tracking-tight text-balance text-gray-900 sm:text-7xl"}
       "Let&#39;s save some time and solve problems"]
      [:p
       {:class
        "mt-8 text-lg font-medium text-pretty text-gray-500 sm:text-xl/8"}
       "In order to get moving fast select what you need and we&#39;ll get in touch."]
      [:div
       {:class "mt-10"}
       [:fieldset
        {:aria-label "Choose a size", :class "mt-4"}
        [:div
         {:class "grid grid-cols-4 gap-4 sm:grid-cols-8 lg:grid-cols-4"}
         [:label
          {:class
           "group relative flex cursor-pointer items-center justify-center rounded-md border bg-white px-4 py-3 text-sm font-medium text-gray-900 uppercase shadow-xs hover:bg-gray-50 focus:outline-hidden sm:flex-1 sm:py-6"}
          [:input
           {:type "radio",
            :name "size-choice",
            :value "XL",
            :class "sr-only"}]
          [:span "PL"]
          [:span
           {:class "pointer-events-none absolute -inset-px rounded-md",
            :aria-hidden "true"}]]
         [:label
          {:class
           "group relative flex cursor-pointer items-center justify-center rounded-md border bg-white px-4 py-3 text-sm font-medium text-gray-900 uppercase shadow-xs hover:bg-gray-50 focus:outline-hidden sm:flex-1 sm:py-6"}
          [:input
           {:type "radio",
            :name "size-choice",
            :value "2XL",
            :class "sr-only"}]
          [:span "EL"]
          [:span
           {:class "pointer-events-none absolute -inset-px rounded-md",
            :aria-hidden "true"}]]]]]
      [:div
       [:label
        {:for "phone", :class "block text-sm/6 font-medium text-gray-900"}
        "Phone number"]
       [:div
        {:class "mt-2"}
        [:div
         {:class
          "flex items-center rounded-md bg-white pl-3 outline-1 -outline-offset-1 outline-gray-300 has-[input:focus-within]:outline-2 has-[input:focus-within]:-outline-offset-2 has-[input:focus-within]:outline-indigo-600"}
         [:div
          {:class
           "shrink-0 text-base text-gray-500 select-none sm:text-sm/6"}
          "+1"]
         [:input
          {:type "text",
           :name "phone",
           :id "phone",
           :class
           "block min-w-0 grow py-1.5 pr-3 pl-1 text-base text-gray-900 placeholder:text-gray-400 focus:outline-none sm:text-sm/6",
           :placeholder "000-0000-000"}]]]]
      [:div
       {:class "mt-10 flex items-center justify-center gap-x-6"}
       [:a
        {:href "#",
         :class
         "rounded-md bg-indigo-600 px-3.5 py-2.5 text-sm font-semibold text-white shadow-xs hover:bg-indigo-500 focus-visible:outline-2 focus-visible:outline-offset-2 focus-visible:outline-indigo-600"}
        "Get started"]
       [:a
        {:href "#", :class "text-sm/6 font-semibold text-gray-900"}
        "Learn more"
        [:span {:aria-hidden "true"} "→"]]]]]
    [:div
     {:class
      "absolute inset-x-0 top-[calc(100%-13rem)] -z-10 transform-gpu overflow-hidden blur-3xl sm:top-[calc(100%-30rem)]",
      :aria-hidden "true"}
     [:div
      {:class
       "relative left-[calc(50%+3rem)] aspect-1155/678 w-[36.125rem] -translate-x-1/2 bg-linear-to-tr from-[#ff80b5] to-[#9089fc] opacity-30 sm:left-[calc(50%+36rem)] sm:w-[72.1875rem]",
       :style
       "clip-path: polygon(74.1% 44.1%, 100% 61.6%, 97.5% 26.9%, 85.5% 0.1%, 80.7% 2%, 72.5% 32.5%, 60.2% 62.4%, 52.4% 68.1%, 47.5% 58.3%, 45.2% 34.5%, 27.5% 76.7%, 0.1% 64.9%, 17.9% 100%, 27.6% 76.8%, 76.1% 97.7%, 74.1% 44.1%)"}]]]])