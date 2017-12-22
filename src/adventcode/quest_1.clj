(ns adventcode.quest-1
  (:require [clojure.test :refer :all]
            [clojure.string :as str]
            [clojure.java.io :as io]))

(let [c->d (zipmap "0123456789" (range))]
  (defn str->digits
    [s]
    (map c->d s)))

(def input (-> "resources/day_01/input" io/file slurp))

(def data (-> input str/trim str->digits))



(defn count-numbers
  ""
  [list]
  (let [data (-> list str/trim str->digits)]
    data))



(deftest sum-seq
  (is (= 3 (count-numbers "1122")))
  (is (= 1 (count-numbers "1111")))
  (is (= 0 (count-numbers "1234")))
  (is (= 9 (count-numbers "91212129"))))
(reduce + (filter (fn [[a b]] (= a b)) (partition 2 1 (clojure.string/split (str 1134) #""))))
