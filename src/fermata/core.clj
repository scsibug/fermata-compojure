(ns fermata.core
  (:use compojure.core
        ring.adapter.jetty)
  (:require [compojure.route :as route])
  (:gen-class))

(defroutes example
  (GET "/" [] "<h1>Hello World Wide Web!</h1>")
  (route/not-found "Page not found"))

(defn -main [& args]
  (run-jetty example {:port 8080}))