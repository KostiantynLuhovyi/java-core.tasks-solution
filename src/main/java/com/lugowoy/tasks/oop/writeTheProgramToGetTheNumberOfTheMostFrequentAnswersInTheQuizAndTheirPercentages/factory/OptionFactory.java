package com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.factory;

import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.model.Option;

/** Created by Konstantin Lugowoy on 07.04.2017. */

public class OptionFactory extends ModelFactory<Option> {

    @Override
    public Option createModel() {
        return new Option();
    }
}
