package com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.determine;

import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.model.Option;
import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.model.Quiz;

import java.math.BigDecimal;

/** Created by Konstantin Lugowoy on 11.04.2017. */

public class DeterminantPercentageOfAllVotingOptions extends Determinant implements DeterminablePercentageOfAllVotingOptions<Quiz> {

    @Override
    public void determinePercentageOfAllVotingOptions(Quiz quiz) {
        for (Option option : quiz.getOptionList()) {
            if (option.getCountChoice() != 0) {
                option.setPercentageOfOption(
                        new BigDecimal(option.getCountChoice()).divide(new BigDecimal(Quiz.getNumberOfParticipantsInVoting()), 2, BigDecimal.ROUND_DOWN)
                                                               .multiply(new BigDecimal(100)).doubleValue());
            }
        }
    }
}
