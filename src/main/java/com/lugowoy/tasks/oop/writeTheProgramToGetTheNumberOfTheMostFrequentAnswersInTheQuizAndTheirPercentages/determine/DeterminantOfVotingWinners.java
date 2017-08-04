package com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.determine;

import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.model.Option;
import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.model.Quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/** Created by Konstantin Lugowoy on 10.04.2017. */

public class DeterminantOfVotingWinners extends Determinant implements DeterminableOfVotingWinners<Collection<Option>, Quiz> {

    @Override
    public Collection<Option> determine(Quiz quiz) {
        Collection<Option> collectionOptionOfVotingWinners = new ArrayList<>(0);

        Option optionMaxVote = Collections.max(quiz.getOptionList());
        collectionOptionOfVotingWinners.add(optionMaxVote);

        for (Option option : quiz.getOptionList()) {
            if (option.getCountChoice() == optionMaxVote.getCountChoice()) {
                if (!option.equals(optionMaxVote)) {
                    collectionOptionOfVotingWinners.add(option);
                }
            }
        }
        return collectionOptionOfVotingWinners;
    }

}
