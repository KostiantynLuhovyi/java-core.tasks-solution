package com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.factory;

import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.model.Quiz;

/** Created by Konstantin Lugowoy on 07.04.2017. */

public class QuizFactory extends ModelFactory<Quiz> {

    @Override
    public Quiz createModel() {
        return new Quiz();
    }

}
