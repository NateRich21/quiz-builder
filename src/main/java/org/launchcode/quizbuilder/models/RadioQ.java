package org.launchcode.quizbuilder.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;

public class RadioQ extends Question {

    @NotNull
    @Size(min=2)
    private ArrayList<String> choices;

    @NotNull
    @Size(min=2)
    private int numberOfChoices;

    @NotNull
    @Size(min=1)
    private String answer;

    public RadioQ(String questionText, String answer, boolean isCorrect,
                  ArrayList<String> choices) {
        super(questionText, isCorrect);
        this.choices = choices;
        this.answer = answer;
    }

    public int getNumberOfChoices() {
        return numberOfChoices;
    }

    public void setNumberOfChoices(int numberOfChoices) {
        this.numberOfChoices = numberOfChoices;
    }

    public ArrayList<String> getChoices() {
        return choices;
    }

    public void setChoices(ArrayList<String> choices) {
        this.choices = choices;
    }
}
