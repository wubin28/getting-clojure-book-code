;---
; Excerpted from "Getting Clojure",
; published by The Pragmatic Bookshelf.
; Copyrights apply to this code. It may not be used to create training material,
; courses, books, articles, and the like. Contact us if you are in doubt.
; We make no guarantees that this code is fit for any purpose.
; Visit http://www.pragmaticprogrammer.com/titles/roclojure for more book information.
;---
(ns ring-example.core-test
  (:require [clojure.test :refer :all]
            [ring-example.core :refer :all]))

(deftest a-test
  (testing "Make sure core loads"
    (is (= 1 1))))
