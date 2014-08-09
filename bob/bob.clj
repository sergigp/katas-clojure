(ns bob (:use [clojure.string]))

(defn question? [message]
  (= (last message) \?))

(defn contains-some-letter? [message]
  (not (empty? (re-seq #"[a-zA-Z]" message))))

(defn yelling? [message]
  (and (contains-some-letter? message) (= (upper-case message) message)))

(defn response-for [message]
  (cond
   (blank? message) "Fine. Be that way!"
   (yelling? message) "Woah, chill out!"
   (question? message) "Sure."
   :else "Whatever."))


