(ns functions.nested-function)

;; 함수의 중첩 호출은 안쪽에서 부터 바깥쪽으로 이동한다
;; https://clojure.org/guides/learn/functions 


(comment
  ;; 1, 2, 3, 4 벡터에서 홀수만 뽑아서 1을 더한다.
  ;; 순서: filter odd? -> map inc
  
  (map inc (filter odd? [1 2 3 4]))
  )

(comment
  ;; (1+1) + (2*3)
  ;; 순서: inc -> * -> +

  (+ (inc 1) (* 2 3))
  )
