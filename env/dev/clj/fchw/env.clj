(ns fchw.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [fchw.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[fchw started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[fchw has shut down successfully]=-"))
   :middleware wrap-dev})
