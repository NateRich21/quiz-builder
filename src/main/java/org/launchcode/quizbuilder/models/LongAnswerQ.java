package org.launchcode.quizbuilder.models;

public class LongAnswerQ extends Question {

    private int[] pointValue;

    public LongAnswerQ(String questionText, boolean isCorrect, int[] pointValue) {
        super(questionText, isCorrect);
        this.pointValue = pointValue;
    }

    public int[] getPointValue() {
        return pointValue;
    }

    public void setPointValue(int[] pointValue) {
        this.pointValue = pointValue;
    }
}
