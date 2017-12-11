package org.launchcode.quizbuilder.models;

import com.sun.istack.internal.NotNull;
import javax.validation.constraints.Size;

public interface QuestionInterface {

    public void setQuestionText(String questionText);
    public String getQuestionText();

    public void setIsCorrect(boolean isCorrect);
    public boolean getIsCorrect();

}