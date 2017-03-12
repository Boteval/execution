(ns runner.driver-protocol)

(defprotocol DriverInterface
  (init [this])
  (ping-target [this])
  (open-user-session [this user-id])
  (close-user-session [this session-id])
  (send-user-message [this session-id])
  (reset-user-profile [this user-id]))

(deftype Driver [target-def]
  DriverInterface
    (init [this]
      (let [{url :url} target-def]
        (println url))))

(defn materialize-driver [target-def]
  (def object1 (new Driver 3))
  (init object1)
)

