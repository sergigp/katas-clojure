(ns rna_transcription)

(defn rna-complement [nucleotide]
  (cond
   (= nucleotide \G) \C
   (= nucleotide \C) \G
   (= nucleotide \T) \A
   (= nucleotide \A) \U
   :else (throw (new AssertionError))))

(defn to-rna [dna]
  (apply str (map rna-complement (seq dna))))
