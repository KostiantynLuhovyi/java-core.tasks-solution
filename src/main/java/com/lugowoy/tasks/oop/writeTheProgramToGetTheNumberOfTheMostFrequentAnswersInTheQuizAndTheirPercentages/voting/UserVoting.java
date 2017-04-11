package com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.voting;

import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.model.Option;
import com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.model.Quiz;
import com.lugowoy.util.reading.ReadingData;

/** Created by Konstantin Lugowoy on 07.04.2017. */

public class UserVoting<T extends Enum> extends Voting<T> {

    private ReadingData<String> readingData;

    public UserVoting(ReadingData<String> readingData) {
        this.readingData = readingData;
    }

    public void vote(Quiz quiz) {
        String resultInputData;
        while (true) {
            outputOptionsForVoting(quiz);
            System.out.println("To end the voting, enter 'stop'.");
            resultInputData = this.readingData.read();
            if (!resultInputData.equalsIgnoreCase("stop")) {
                try {
                    accrualOfVotesForParticularOption(quiz, resultInputData);
                } catch (IllegalArgumentException ex) {
                    System.out.println("Incorrect input value. Re-enter : ");
                    System.out.println();
                }
            } else {
                break;
            }
        }
    }

    public void vote(Quiz quiz, int quantityVote) {
        String resultInputData;
        for (int i = 0; i < quantityVote; i++) {
            while (true) {
                try {
                    outputOptionsForVoting(quiz);
                    resultInputData = this.readingData.read();
                    accrualOfVotesForParticularOption(quiz, resultInputData);
                    break;
                } catch (IllegalArgumentException ex) {
                    System.out.println("Incorrect input value. Re-enter : ");
                    System.out.println();
                }
            }
        }
    }

    private void accrualOfVotesForParticularOption(Quiz quiz, String resultInputData) throws IllegalArgumentException {
        if (resultInputData.matches("\\d+?")) {
            int value = Integer.parseInt(resultInputData);
            if ((value >= 0) && (value < quiz.getOptionList().size())) {
                Option option = quiz.getOptionList().get(value);
                quiz.getOptionList().get(value).setCountChoice(option.getCountChoice() + 1);
            } else {
                throw new IncorrectInputValueOfOption();
            }
        } else {
            throw new IncorrectInputValueOfOption();
        }
    }

    private static void outputOptionsForVoting(Quiz quiz) {
        System.out.println("Enter the number of your choice : ");
        for (int i = 0; i < quiz.getOptionList().size(); i++) {
            System.out.printf("Choose %d - %s ;%n", i, quiz.getOptionList().get(i).getValueForOption().name());
        }
    }

}
