(ns recursion_practice.t-factorial
  (:use midje.sweet)
  (:use [recursion_practice.factorial])
  (:use [recursion_practice.factorial_2]))

(facts "about `factorial`"
  (fact "it returns factorial of a number"
    (factorial 3) => 6
    (factorial 2) => 2
    (factorial 1) => 1
    (factorial 4) => 24
    (factorial 5) => 120))
