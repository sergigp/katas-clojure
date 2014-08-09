(ns bob (:use [clojure.string]))

(defn is-question? [message]
  (= (last message) \?))

(defn contains-some-letter [message]
  (not (empty? (re-seq #"[a-zA-Z]" message))))

(defn is-yelling? [message]
  (and (contains-some-letter message) (= (upper-case message) message)))

(defn response-for [message]
  (cond
   (blank? message) "Fine. Be that way!"
   (is-yelling? message) "Woah, chill out!"
   (is-question? message) "Sure."
   :else "Whatever."))


