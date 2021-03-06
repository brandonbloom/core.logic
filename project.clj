(defproject core.logic "0.8.0-beta3-SNAPSHOT" 
  :description "A logic/relational programming library for Clojure"
  :extra-classpath-dirs ["checkouts/clojurescript/src/clj"
                         "checkouts/clojurescript/src/cljs"]
  :parent [org.clojure/pom.contrib "0.0.25"]
  :source-path "src/main/clojure"
  :test-path "src/test/clojure"
  :source-paths ["src/main/clojure"
                 "src/test/clojure"]
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.clojure/tools.macro "0.1.1"]
                 [com.datomic/datomic-free "0.8.3551" :scope "provided"]]
  :dev-dependencies [[lein-swank "1.4.4"]
                     [lein-cljsbuild "0.2.9"]]
  :cljsbuild {:builds {:test-simp {:source-path "src/test/cljs"
                                   :compiler {:optimizations :simple
                                              :pretty-print true
                                              :static-fns true
                                              :output-to "tests.js"}}
                       :test-adv {:source-path "src/test/cljs"
                                  :compiler {:optimizations :advanced
                                             :pretty-print true
                                             :output-to "tests.js"}}}})
