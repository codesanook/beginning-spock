package com.codesanook.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GradeCalculator {

    private List<GradeRate> rates;
    private int currentIndex;

    public GradeCalculator() {
        rates = new ArrayList<>();
        rates.add(new GradeRate(85, "A"));
        rates.add(new GradeRate(70, "B"));
        rates.add(new GradeRate(60, "C"));
        rates.add(new GradeRate(50, "D"));
        rates.add(new GradeRate(0, "F"));


        Collections.sort(rates);
        resetIndex();
    }

    private void resetIndex() {
        currentIndex = rates.size() - 1;
    }

    public String getGradeForScore(double rawScore) {
        if (rawScore > 100 || rawScore < 0)
            throw new IllegalStateException("Score must be between 0 to 100");

        if (rawScore >= rates.get(currentIndex).getMinScore()) {
            String grade = rates.get(currentIndex).getGrade();
            resetIndex();
            return grade;
        }

        currentIndex--;
        return getGradeForScore(rawScore);
    }
}
