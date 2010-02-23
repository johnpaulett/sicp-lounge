(defn ss [a b]
  (+ (* a a) (* b b)))

(defn ssmax [a b c]
  (let [sorted (reverse (sort [a b c]))]
    (ss (nth sorted 0) (nth sorted 1))))