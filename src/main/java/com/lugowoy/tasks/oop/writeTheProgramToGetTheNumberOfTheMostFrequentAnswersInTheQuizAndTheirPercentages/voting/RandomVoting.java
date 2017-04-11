package com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.voting;

import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.model.Option;
import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.model.Quiz;

import java.util.Random;

/** Created by Konstantin Lugowoy on 07.04.2017. */

public class RandomVoting<T extends Enum> extends Voting<T> {

    public RandomVoting() {
    }

    public RandomVoting(int quantityVote) {
        super(quantityVote);
    }

    public RandomVoting(Class<T> valueForOption) {
        super(valueForOption);
    }

    public RandomVoting(int quantityVote, Class<T> valueForOption) {
        super(quantityVote, valueForOption);
    }

    public void vote(Quiz quiz) {
        for (int i = 0; i < this.getQuantityVote(); i++) {
            Option option = quiz.getOptionList().get(generateIndexOfRandomChoiceOfOption(this.getValueForOption()));
            option.setCountChoice(option.getCountChoice() + 1);
        }
    }

    private int generateIndexOfRandomChoiceOfOption(Class<T> valueEnumClass) {
        return new Random().nextInt(valueEnumClass.getEnumConstants().length);
    }

    @Override
    public int getQuantityVote() {
        return super.getQuantityVote();
    }

    @Override
    public void setQuantityVote(int quantityVote) {
        super.setQuantityVote(quantityVote);
    }

    @Override
    public Class<T> getValueForOption() {
        return super.getValueForOption();
    }

    @Override
    public void setValueForOption(Class<T> valueForOption) {
        super.setValueForOption(valueForOption);
    }

}
