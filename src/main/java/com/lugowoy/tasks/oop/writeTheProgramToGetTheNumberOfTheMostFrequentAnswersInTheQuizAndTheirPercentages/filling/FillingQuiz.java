package com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.filling;

import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.factory.Factory;
import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.factory.OptionFactory;
import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.model.Option;
import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.model.Quiz;

import java.util.ArrayList;
import java.util.List;

/** Created by Konstantin Lugowoy on 09.04.2017. */

public class FillingQuiz<T extends Enum> implements Fillable<T> {

    @Override
    public void fillOptionListForQuiz(Quiz quiz, Class<T> valueEnumClass) {
        Factory<Option> optionFactory = new OptionFactory()::createModel;
        List<Option> optionList = new ArrayList<>(0);

        for (Enum value : valueEnumClass.getEnumConstants()) {
            Option option = optionFactory.create();
            option.setValueForOption(value);

            optionList.add(option);
        }

        quiz.setOptionList(optionList);
    }
}
