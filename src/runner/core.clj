(ns runner.core
  (:require [clojure.java.shell :as shell])
  (:require [clojure.string :as str]))

(defn startup []
  ; http://stackoverflow.com/a/29528037/1509695
  ; http://stackoverflow.com/questions/38934681/how-to-get-timestamp-neutral-git-hash-from-a-given-commit-hash
  ; http://dev.clojure.org/jira/browse/CLJ-124
  (let [{git-hash :out exit-code :exit} (shell/sh "git" "describe" "--always" "--dirty")]
    (if (= exit-code 0
      (println (str "Starting (self git hash is " (str/trimr git-hash) ")")))
      (println "cannot get self git hash"))))

(defn -main []
  (startup)
)
