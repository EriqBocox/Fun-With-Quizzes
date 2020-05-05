package main;

import java.util.ArrayList;

public class MultipleChoice extends Question {
    private ArrayList<String> multipleChoiceAnswerOptions;
    private int correctMultipleChoiceAnswer;
    private int multipleChoiceScore = 0;

    public MultipleChoice(String inquiry, ArrayList<String> multipleChoiceAnswerOptions, int correctMultipleChoiceAnswer) {
        super(inquiry);
        this.multipleChoiceAnswerOptions = multipleChoiceAnswerOptions;
        this.correctMultipleChoiceAnswer = correctMultipleChoiceAnswer;
    }

    public int getCorrectMultipleChoiceScore() {
        return multipleChoiceScore;
    }

    public int checkForCorrectMultipleChoiceAnswer(int userAnswer) {
        if (userAnswer == correctMultipleChoiceAnswer) {
            System.out.println("Correct!");
            this.multipleChoiceScore += 1;
        }else {
            System.out.println("Incorrect!");
        }
        return this.multipleChoiceScore;
    }
}
