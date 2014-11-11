( ns berlinclock.core )
(use '[clojure.string :only (join split)])
;;; This is an incorrect implementation, such as might be written by
 ;;; someone who was used to a Lisp in which an empty list is equal to
 ;;; nil.
(declare first-lamp parse-int first-hour-line second-hour-line first-minute-line get-lights-off)

(def ^:private num-lights-hour 4)
(def ^:private num-lights-minute 11)

(defn show [time]
 	(let [[hours minutes seconds] (map parse-int (split time #":"))] 
	   	(join "\n"
		   [(first-lamp seconds)
		   (first-hour-line hours)
		   (second-hour-line hours)
		   "OOOOOOOOOOO"
		   "OOOO"])))



(defn- first-lamp [seconds]
	(if (even? seconds) "Y" "0"))

(defn- first-hour-line [hours] 
	(let [num-lights-on 
		(quot hours 5)]
		(apply str (concat (repeat num-lights-on "R") 
						   (repeat (get-lights-off num-lights-hour num-lights-on) "O")))))

(defn- second-hour-line [hours]
	(let [num-lights-on
		(rem hours 5)]
		(apply str (concat (repeat num-lights-on "R")
						   (repeat (get-lights-off num-lights-hour num-lights-on) "O")))))


(defn- get-lights-off [num-lights num-lights-on]
	(- num-lights num-lights-on))

(defn- parse-int [s]
   (Integer. (re-find  #"\d+" s )))