(ns berlinclock.t-core
  (:use midje.sweet)
  (:use [berlinclock.core]))

(use '[clojure.string :only (join)])

(facts "about Berlin Clock"
       (facts "seconds lamp"
              (fact "It turns on for one second (Y)"
                    (show "00:00:00") => (join "\n"
                                               ["Y"
                                                "OOOO"
                                                "OOOO"
                                                "OOOOOOOOOOO"
                                                "OOOO"]))
              (fact "It turns on for one second (Y)"
                    (show "00:00:01") => (join "\n"
                                               ["0"
                                                "OOOO"
                                                "OOOO"
                                                "OOOOOOOOOOO"
                                                "OOOO"]))))
       (facts "hours lamps first row"
              (fact "it contains 4 lamps that represent 5 hours each when red (R)"
                    (show "05:00:00") => (join "\n"
                                               ["Y"
                                                "ROOO"
                                                "OOOO"
                                                "OOOOOOOOOOO"
                                                "OOOO"])
                    (show "10:00:00") => (join "\n"
                                               ["Y"
                                                "RROO"
                                                "OOOO"
                                                "OOOOOOOOOOO"
                                                "OOOO"])
                    (show "15:00:00") => (join "\n"
                                               ["Y"
                                                "RRRO"
                                                "OOOO"
                                                "OOOOOOOOOOO"
                                                "OOOO"])
))
       (facts "hours lamps second row"
              (fact "it contains 4 lamps that represent 1 hour each when red (R)"
                    (show "06:00:00") => (join "\n"
                                               ["Y"
                                                "ROOO"
                                                "ROOO"
                                                "OOOOOOOOOOO"
                                                "OOOO"])

                    (show "22:00:00") => (join "\n"
                                               ["Y"
                                                "RRRR"
                                                "RROO"
                                                "OOOOOOOOOOO"
                                                "OOOO"])

                    (show "14:00:00") => (join "\n"
                                               ["Y"
                                                "RROO"
                                                "RRRR"
                                                "OOOOOOOOOOO"
                                                "OOOO"])))
       (facts "minutes lamps first row"
              (fact "it contains 11 lamps that repesents 5 minute each,
                    every 3rd lamp is red but the rest are yellow"
                    (show "00:15:00") => (join "\n"
                                               ["Y"
                                                "OOOO"
                                                "OOOO"
                                                "YYROOOOOOOO"
                                                "OOOO"])

                    (show "00:50:00") => (join "\n"
                                               ["Y"
                                                "OOOO"
                                                "OOOO"
                                                "YYRYYRYYRYO"
                                                "OOOO"])))
;
;       (facts "minutes lamps second row"
;              (fact "it contains 4 yellow lamps that represents 1 minute each"
;                    (show "00:16:00") => (join "\n"
;                                               ["Y"
;                                                "OOOO"
;                                                "OOOO"
;                                                "YYROOOOOOOO"
;                                                "YOOO"])
;
;                    (show "00:18:00") => (join "\n"
;                                               ["Y"
;                                                "OOOO"
;                                                "OOOO"
;                                                "YYROOOOOOOO"
;                                                "YYYO"])
;
;                    (show "00:19:00") => (join "\n"
;                                               ["Y"
;                                                "OOOO"
;                                                "OOOO"
;                                                "YYROOOOOOOO"
;                                                "YYYY"]))
;       )
