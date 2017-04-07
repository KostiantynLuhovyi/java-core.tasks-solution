package com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.voting;

import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.model.Option;
import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.model.Quiz;
import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.model.ValueForOption;

import java.util.Random;

/** Created by Konstantin Lugowoy on 07.04.2017. */

public class RandomVoting {

    private static int quantityVote;

    public static void votingRandom(Quiz quiz) {
        for (int i = 0; i < quantityVote; i++) {
            Option option = quiz.getOptionList().get(generateIndexOfRandomChoiceOfOption());
            option.setCountChoice(option.getCountChoice() + 1);
        }
    }

    public static void setQuantityVote(int quantityVote) {
        RandomVoting.quantityVote = quantityVote;
    }

    private static int generateIndexOfRandomChoiceOfOption() {
        return new Random().nextInt(ValueForOption.QUANTITY_VALUE_FOR_OPTION + 1);
    }
}
