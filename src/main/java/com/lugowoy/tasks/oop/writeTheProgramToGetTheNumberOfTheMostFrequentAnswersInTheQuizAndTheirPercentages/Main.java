package com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages;

import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.factory.Factory;
import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.factory.QuizFactory;
import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.filling.Fillable;
import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.filling.FillingQuiz;
import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.model.Quiz;
import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.model.ValueForOptionJapanSymbols;
import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.voting.RandomVoting;
import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.voting.Voting;
import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingUserInputData;
import com.lugowoy.util.reading.StoppingEnterValueException;

/** Created by Konstantin Lugowoy on 07.04.2017. */

public class Main {

    private static final Factory<Quiz> QUIZ_FACTORY = new QuizFactory()::createModel;

    public static void main(String[] args) throws StoppingEnterValueException {

        Quiz quiz = QUIZ_FACTORY.create();

        Fillable<ValueForOptionJapanSymbols> fillable = new FillingQuiz<>();
        fillable.fillOptionListForQuiz(quiz, ValueForOptionJapanSymbols.class);

        System.out.println(quiz);

        ReadingData<Integer> readingData = new ReadingData<>(new ReadingUserInputData()::readInt);

        System.out.println("");

    }

    private static void startVoting(Quiz quiz, Voting voting) {
        voting.voting(quiz);
    }



}
