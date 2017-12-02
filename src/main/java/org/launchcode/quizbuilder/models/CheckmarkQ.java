package org.launchcode.quizbuilder.models;

import java.util.ArrayList;

public class CheckmarkQ extends Question {

    private ArrayList<String> answers;

    public CheckmarkQ(String questionText, boolean isCorrect, ArrayList<String> answers) {
        super(questionText, isCorrect);
        this.answers = answers;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }
}
