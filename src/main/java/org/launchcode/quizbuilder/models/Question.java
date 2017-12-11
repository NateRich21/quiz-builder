package org.launchcode.quizbuilder.models;

import com.sun.istack.internal.NotNull;
import javax.validation.constraints.Size;

public abstract class Question implements QuestionInterface{

    @NotNull
    @Size(min=1, message = "Question field may not be left empty")
    private String questionText;
    private boolean isCorrect = false;

    public Question(String questionText, boolean isCorrect) {
        this.questionText = questionText;
        this.isCorrect = isCorrect;
    }

    @Override
    public void setQuestionText() {

    }

    @Override
    public String getQuestionText() {
        return null;
    }

    @Override
    public void setIsCorrect() {

    }

    @Override
    public String getIsCorrect() {
        return null;
    }
}
