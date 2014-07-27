(ns recursion_practice.factorial)


(defn factorial [number]
  (if (= number 0)
    1
    (* number (factorial (dec number)))))
