(ns ^:no-doc datahike.constants)

(def ^:const e0 0)
(def ^:const tx0 0x20000000)
(def ^:const emax 0x7FFFFFFF)
(def ^:const txmax 0x7FFFFFFF)
(def ^:const db-cache-size 1000)
(def ^:const implicit-schema {:db/ident {:db/unique :db.unique/identity}})

