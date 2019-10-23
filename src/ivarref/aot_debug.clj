(ns ivarref.aot-debug)

(defmacro my-macro [& body]
  (do
    (println "making macro!")
    `(do
       (println "macro body!")
       ~@body)))

(defn foo
  "I don't do a whole lot."
  [x]
  (my-macro
    (println x "Hello, World!")))
