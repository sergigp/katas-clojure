(ns recursion_practice.t-factorial_2
  (:use midje.sweet)
  (:use [recursion_practice.factorial_2]))

(facts "about `factorial`"
  (fact "it returns factorial of a number"
    (factorial_2 3 1) => 6
    (factorial_2 2 1) => 2
    (factorial_2 1 1) => 1
    (factorial_2 4 1) => 24
    (factorial_2 5 1) => 120))
