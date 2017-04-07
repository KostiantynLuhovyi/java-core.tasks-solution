package com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.factory;

import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.model.Option;
import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.model.Quiz;
import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.model.ValueForOption;

import java.util.ArrayList;
import java.util.List;

/** Created by Konstantin Lugowoy on 07.04.2017. */

public class QuizFactory extends ModelFactory<Quiz> {

    @Override
    public Quiz createModel() {
        Quiz quiz = new Quiz();
        fillOptionListForQuiz(quiz);
        return quiz;
    }

    private static void fillOptionListForQuiz(Quiz quiz) {
        Factory<Option> optionFactory = Option::new;
        List<Option> optionList = new ArrayList<>(0);

        for (int i = 0; i <= ValueForOption.QUANTITY_VALUE_FOR_OPTION; i++) {
            Option option = optionFactory.create();
            option.setValueForOption(ValueForOption.getValueForOption(i));

            optionList.add(option);
        }

        quiz.setOptionList(optionList);
    }


}
