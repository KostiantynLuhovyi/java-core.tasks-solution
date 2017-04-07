package com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages;

import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.factory.Factory;
import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.factory.QuizFactory;
import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.model.Quiz;
import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.voting.RandomVoting;
import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.voting.Voting;

/** Created by Konstantin Lugowoy on 07.04.2017. */

public class Main {

    private static final Factory<Quiz> QUIZ_FACTORY = new QuizFactory()::createModel;

    public static void main(String[] args) {

        Quiz quiz = QUIZ_FACTORY.create();

        System.out.println(quiz);

        RandomVoting.setQuantityVote(10);
        Voting voting = RandomVoting::votingRandom;
        voting.voting(quiz);

        System.out.println(quiz);

    }

    private static void chooseTheTypeOfVoting() {


    }



}
