package com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.determine;

import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.model.Option;

import java.util.Collection;

/** Created by Konstantin Lugowoy on 11.04.2017. */

public interface DeterminableOfVotingWinners<T extends Collection, V> extends Determinable {

    T determine(V v);

}
