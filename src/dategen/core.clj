(ns dategen.core
  (:gen-class)
  (:require [clojure.string :as str])
  (:import [java.time LocalDate]
           [java.time.format DateTimeFormatter]))

(defn date-seq [start limit]
  (lazy-seq
   (when (> 1 (compare start limit))
     (cons start (date-seq (.plusDays start 1) limit)))))

(defn format-date [d]
  (let [formatter (DateTimeFormatter/ofPattern "dd.MM.yyyy")]
    (.format formatter d)))

(defn -main
  "Generate dates for given year."
  [& args]
  (let [year (Integer/parseInt (first args))
        start (LocalDate/of year 1 1)
        limit (LocalDate/of year 12 31)]
    (println (str/join "\n" (map format-date (date-seq start limit))))))
