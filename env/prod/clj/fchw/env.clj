(ns fchw.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[fchw started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[fchw has shut down successfully]=-"))
   :middleware identity})
