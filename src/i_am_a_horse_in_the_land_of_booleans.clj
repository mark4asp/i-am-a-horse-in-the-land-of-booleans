(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean
  "is x a boolean?"
  [x]
  (if x true
        false))

(defn abs
  "absolute value of x"
  [x]
  (if (< x 0)
    (- x)
    x))

(defn divides?
  "is n divisable by divisor?"
  [divisor n]
  (= (mod n divisor)
     0))

(defn fizzbuzz
  "fizzbuzz"
  [x]
  (cond (divides? 15 x) "gotcha!"
        (divides? 3 x)  "fizz"
        (divides? 5 x)  "buzz"
        :else           ""))

(defn teen?
  "is age a teen? (13-19)"
  [age]
  (and (>= age 13)
       (< age 20)))

(defn not-teen?
  "is age a not-teen? (< 13 or > 19)"
  [age]
  (or (< age 13)
      (> age 19)))

(defn generic-doublificate
  "generic-doublificate - funny"
  [x]
  (cond (number? x)      (* 2 x)
        (empty?  x)      nil
        (or (list? x)
            (vector? x)) (* 2 (count x))
        :else            true))

(defn leap-year?
  "is year a leap-year?"
  [year]
  (cond (divides? 400 year) true
        (divides? 100 year) false
        (divides? 4 year)   true
        :else               false))

; '_______'
