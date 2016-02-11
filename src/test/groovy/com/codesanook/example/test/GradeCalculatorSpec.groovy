package com.codesanook.example.test

import com.codesanook.example.GradeCalculator
import spock.lang.Specification
import spock.lang.Unroll

class GradeCalculatorSpec extends Specification {

    def "score 90 get grade A"() {

        given:
        def gradeCalculator = new GradeCalculator()
        def rawStore = 90

        when:
        def result = gradeCalculator.getGradeForScore(rawStore)

        then:
        result == "A"
    }

    @Unroll
    def "score #rawScore get grade #grade"() {

        given:
        def gradeCalculator = new GradeCalculator()

        when:
        def result = gradeCalculator.getGradeForScore(rawScore)

        then:

        result == grade

        where:
        rawScore | grade
        85       |  "A"
        70       |  "B"
        60       |  "C"
        50       |  "D"
        49       |  "F"
    }

}

