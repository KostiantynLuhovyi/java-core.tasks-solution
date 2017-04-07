package com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.model;

import java.util.List;

/** Created by Konstantin Lugowoy on 06.04.2017. */

public class Quiz {

    private List<Option> optionList;

    public Quiz() {
    }

    public Quiz(List<Option> optionList) {
        this.optionList = optionList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Quiz)) return false;

        Quiz quiz = (Quiz) o;

        return optionList != null ? optionList.equals(quiz.optionList) : quiz.optionList == null;
    }

    @Override
    public int hashCode() {
        return optionList != null ? optionList.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Quiz[" +
                "optionList=" + optionList +
                ']';
    }

    public List<Option> getOptionList() {
        return optionList;
    }

    public void setOptionList(List<Option> optionList) {
        this.optionList = optionList;
    }
}
