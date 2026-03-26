(ns functions.operations)

(defn add [a b] (+ a b))
(defn sub [a b] (- a b))
(defn mul [a b] (* a b))
(defn div [a b] (/ a b))

(def ops
  {:add +
   :sub -
   :mul *
   :div /})

(defn calc [op a b]
  ((ops op) a b))

(comment
  ;; calc에 넣는 op가 ops의 키워드, op를 쓰려면 ':'를 붙여야함 
)

(calc :add 1 2)
(calc :sub 10 3)
(calc :mul 4 5)
(calc :div 20 4)
