;Funcion1
(defn funcionlineal [m x b]
  (+(* m x) b))
(funcionlineal 2 1 4)
;;-----------------------------------
;Funcion2
(defn pendienteFuncion [x1 x2 y1 y2]
  (cond
    (< (/ (- y2 y1)(- x2 x1)) 0) "La pendiente es decreciente"
    (= (/ (- y2 y1)(- x2 x1)) 0) "La pendiente es constante"
    (> (/ (- y2 y1)(- x2 x1)) 0) "La pendiente es creciente"))

(pendienteFuncion -2 0 -4 2)
;;-----------------------------------
;Funcion3
(defn Punto_Recta_Funcion [m b x y]
(cond
  (=(funcionlineal m b x) y) "El punto esta en la recta"
  :else "El punto NO esta en la recta"))

(Punto_Recta_Funcion 4 5 6 26)

;Funcion4
(defn funcion-interseccion [m x y]
(- y (* m x) ))
(funcion-interseccion 4 5 4)

;Funcion5
(defn funcion-m [x1 x2 y1 y2]
(/ (- y2 y1)(- x2 x1)))

(defn llamar-mb [x1 x2 y1 y2]
(def m (funcion-m x1 x2 y1 y2))
(def b (funcion-interseccion m x1 y1))
(str "m: " m " b: " b))
(llamar-mb -2 0 -4 2)



