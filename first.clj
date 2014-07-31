; random utils just to use functions

(defn sum [l] (if (empty? l) 0 (+ (last l) (sum (drop-last l)))))
(print (sum (list 1 2 3)))

(defn fact[n] 
    (if (= n 1) 1 
        (* n (fact(- n 1)))))

(print (fact 3))

