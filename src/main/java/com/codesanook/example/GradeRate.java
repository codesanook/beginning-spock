package com.codesanook.example;


public class GradeRate implements Comparable<GradeRate> {

    private float minScore;
    private String grade;

    public GradeRate(float minScore, String grade) {
        this.minScore = minScore;
        this.grade = grade;
    }


    public float getMinScore() {
        return minScore;
    }

    public void setMinScore(float minScore) {
        this.minScore = minScore;
    }


    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public int compareTo(GradeRate other) {
        return Float.compare(this.getMinScore(), other.getMinScore());
    }


}



