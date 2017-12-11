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
    public void setQuestionText(String questionText) { this.questionText = questionText; }

    @Override
    public String getQuestionText() { return questionText; }

    @Override
    public void setIsCorrect(boolean isCorrect) { this.isCorrect = isCorrect; }

    @Override
    public boolean getIsCorrect() { return isCorrect; }

}
