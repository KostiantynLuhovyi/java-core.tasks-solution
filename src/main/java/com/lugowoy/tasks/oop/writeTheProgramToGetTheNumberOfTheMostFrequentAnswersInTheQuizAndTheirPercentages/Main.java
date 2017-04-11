package com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages;

import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.determine.Determinant;
import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.determine.DeterminantOfVotingWinners;
import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.determine.DeterminantPercentageOfAllVotingOptions;
import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.factory.Factory;
import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.factory.QuizFactory;
import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.filling.Fillable;
import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.filling.FillingQuiz;
import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.model.Option;
import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.model.Quiz;
import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.model.ValueForOptionJapanSymbols;
import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.voting.RandomVoting;
import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.voting.UserVoting;
import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.voting.Voting;
import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingUserInputData;

/** Created by Konstantin Lugowoy on 07.04.2017. */

public class Main {

    private static final Factory<Quiz> QUIZ_FACTORY = new QuizFactory()::createModel;

    private static final ReadingUserInputData INPUT_DATA = new ReadingUserInputData();

    public static void main(String[] args) {

        Quiz quiz = QUIZ_FACTORY.create();

        Fillable<ValueForOptionJapanSymbols> fillable = new FillingQuiz<>();
        fillable.fillOptionListForQuiz(quiz, ValueForOptionJapanSymbols.class);

        System.out.println();
        System.out.println("A vote is taken.");
        System.out.println();

        int resultChoiceKnownWhetherTheNumberOfParticipantsInTheVote = choiceIsKnownWhetherTheNumberOfParticipantsInTheVote();

        Voting<ValueForOptionJapanSymbols> voting;
        if (resultChoiceKnownWhetherTheNumberOfParticipantsInTheVote == 1) {
            System.out.println("Meaningful vote.");
            voting = new UserVoting<>(new ReadingData<>(INPUT_DATA::readLine));
            voting.vote(quiz);
        } else if (resultChoiceKnownWhetherTheNumberOfParticipantsInTheVote == 2) {

            Quiz.setNumberOfParticipantsInVoting(inputAndGetQuantityParticipants());

            int resultChoiceVotingOption = choiceVotingOption();
            if (resultChoiceVotingOption == 1) {
                voting = new UserVoting<>(new ReadingData<>(INPUT_DATA::readLine));
                ((UserVoting) voting).vote(quiz, Quiz.getNumberOfParticipantsInVoting());
            } else if (resultChoiceVotingOption == 2) {
                voting = new RandomVoting<>(Quiz.getNumberOfParticipantsInVoting(), ValueForOptionJapanSymbols.class);
                voting.vote(quiz);
            }
        }

        Determinant determinant = new DeterminantOfVotingWinners();

        System.out.println();
        System.out.println("Options won the vote : ");
        for (Option option : ((DeterminantOfVotingWinners)determinant).determine(quiz)) {
            System.out.println(option);
        }
        System.out.println();

        determinant = new DeterminantPercentageOfAllVotingOptions();
        ((DeterminantPercentageOfAllVotingOptions)determinant).determinePercentageOfAllVotingOptions(quiz);

        System.out.println("Percentage of all voting options : ");

        for (Option option : quiz.getOptionList()) {
            System.out.println(option);
        }
        System.out.println();

    }

    private static int inputAndGetQuantityParticipants() {
        int resultQuantity = 0;
        System.out.println("Enter the number of voters : ");
        System.out.println("The quantity must not exceed 50 participants.");
        while (true) {
            int quantityParticipants = INPUT_DATA.readInt();
            if ((quantityParticipants > 0) && (quantityParticipants <= 50)) {
                resultQuantity = quantityParticipants;
                break;
            } else {
                System.out.println("Incorrect value of quantity a participants. Re-enter : ");
            }
        }
        return resultQuantity;
    }

    private static int choiceVotingOption() {
        System.out.println("You want to spend meaningful or random vote ?");
        int resultSelectionVotingOption = 0;
        while (true) {
            System.out.println("Make a choice : ");
            System.out.println("Meaningful vote - press '1' ;\n" +
                               "Random vote - press '2' .");
            resultSelectionVotingOption = INPUT_DATA.readInt();
            if ((resultSelectionVotingOption > 0) && (resultSelectionVotingOption < 3)) {
                break;
            } else {
                System.out.println("Incorrect choice. Repeat.");
                System.out.println();
            }
        }
        return resultSelectionVotingOption;
    }

    private static int choiceIsKnownWhetherTheNumberOfParticipantsInTheVote() {
        int resultChoiceQuantityOfVote = 0;
        System.out.println("You know the number of participants in vote : ");
        while (true) {
            System.out.println("No - press '1' ;\n" +
                               "Yes - press '2' .");
            resultChoiceQuantityOfVote = INPUT_DATA.readInt();
            if ((resultChoiceQuantityOfVote > 0) && (resultChoiceQuantityOfVote < 3)) {
                break;
            } else {
                System.out.println("Incorrect input number of participants in vote. Re-enter : ");
                System.out.println();
            }
        }
        return resultChoiceQuantityOfVote;
    }

}
