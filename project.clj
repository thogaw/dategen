(defproject dategen "0.1.0-SNAPSHOT"
  :description "Simple command line tool to generate dates"
  :url "https://gitlab.com/t.gawantka/dategen"
  :license {:name "MIT License"
            :url "https://spdx.org/licenses/MIT.html"}
  :dependencies [[org.clojure/clojure "1.10.3"]]
  :main ^:skip-aot dategen.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
