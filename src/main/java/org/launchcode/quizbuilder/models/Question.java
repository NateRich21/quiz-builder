package org.launchcode.quizbuilder.models;

import com.sun.istack.internal.NotNull;
import javax.validation.constraints.Size;

public abstract class Question {

    @NotNull
    @Size(min=1, message = "Question field may not be left empty")
    private String questionText;
    private boolean isCorrect = false;

    public Question(String questionText, boolean isCorrect) {
        this.questionText = questionText;
        this.isCorrect = isCorrect;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }


    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }
    }
}
