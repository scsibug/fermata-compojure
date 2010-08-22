(defproject fermata "0.1.0-SNAPSHOT"
  :description "Fake MTA for application testing"
  :dependencies [[org.clojure/clojure "1.2.0-RC3"]
                 [org.clojure/clojure-contrib "1.2.0-RC3"]
                 [compojure "0.4.0"]
                 [ring/ring-jetty-adapter "0.2.3"]
                 [org.subethamail/subethasmtp "3.1.4"]]
  :main fermata.core)
