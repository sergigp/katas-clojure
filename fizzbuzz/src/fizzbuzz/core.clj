(ns fizzbuzz.core)

(defn fizzbuzz [position]
  (if (fizzbuzz? position)
    "fizzbuzz"
    (if (buzz? position)
      "buzz"
      (if (fizz? position)
        "fizz" position))))


(defn fizz? [position]
  (= 0 (mod position 3)))


(defn buzz? [position]
  (= 0 (mod position 5)))


(defn fizzbuzz? [position]
  (and (fizz? position) (buzz? position)))
