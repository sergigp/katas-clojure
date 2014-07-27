(ns recursion_practice.factorial_2)


(defn factorial_2 [number acc]
(if (= number 0)
  acc
  (factorial_2 (dec number) (* number acc))))
