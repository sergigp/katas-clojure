(ns fizzbuzz.core)

(defn fizz? [position]
  (= 0 (mod position 3)))


(defn buzz? [position]
  (= 0 (mod position 5)))


(defn fizzbuzz? [position]
  (and (fizz? position) (buzz? position)))


(defn fizzbuzz [position]
  (cond
   (fizzbuzz? position) "fizzbuzz"
   (fizz? position) "fizz"
   (buzz? position) "buzz"
   :else position))
