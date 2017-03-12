(in-ns 'runner.core)

(defn run
  "runs a test suite"
  [driver suite]
  (materialize-driver 3)
  (println "run"))
