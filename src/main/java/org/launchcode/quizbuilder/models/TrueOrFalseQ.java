package org.launchcode.quizbuilder.models;

public class TrueOrFalseQ extends Question {

    private String answer;

    public TrueOrFalseQ(String questionText, boolean isCorrect, String answer) {
        super(questionText, isCorrect);
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
