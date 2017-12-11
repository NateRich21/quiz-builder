package org.launchcode.quizbuilder.models;

import com.sun.istack.internal.NotNull;
import javax.validation.constraints.Size;

public interface QuestionInterface {

    public void setQuestionText();
    public String getQuestionText();

    public void setIsCorrect();
    public String getIsCorrect();

}