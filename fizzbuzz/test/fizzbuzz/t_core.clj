(ns fizzbuzz.t-core
    (:use midje.sweet)
    (:use [fizzbuzz.core]))

(facts "about `fizzbuzz`"
       (fact "it should return position for normal numbers"
             (fizzbuzz 1) => 1
             (fizzbuzz 2) => 2
             )
       (fact "it should return 'fizz' for multiples of 3"
             (fizzbuzz 3) => "fizz"
             (fizzbuzz 6) => "fizz"
             (fizzbuzz 9) => "fizz"
             (fizzbuzz 27) => "fizz"
             )
       (fact "it should return 'buzz' for multiples of 5"
             (fizzbuzz 5) => "buzz"
             (fizzbuzz 10) => "buzz"
             )
       (fact "it should return 'fizzbuzz' for multiples of 15"
             (fizzbuzz 15) => "fizzbuzz"
             (fizzbuzz 30) => "fizzbuzz")
       )

