package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private int score = 0;
    private ArrayList<Question> quizQuestions;

    public Quiz(ArrayList<Question> quizQuestions){
        this.quizQuestions = quizQuestions;
    }

    public void printQuestionsAnswersandCollectUserInput(ArrayList<Question> quizQuestionArray,
                                                         ArrayList<String>multipleChoiceAnswers){
        System.out.println("Hello! Please answer the quiz questions.");

        for(Question quizQuestion : quizQuestionArray) {
            System.out.println(quizQuestion.getInquiry());

            if(quizQuestion instanceof MultipleChoice) {
                quizQuestion.printAnswerOptions(multipleChoiceAnswers);

                Scanner inputForMultipleChoice = new Scanner(System.in);
                System.out.println("Choose wisely: ");
                int userInputForMultipleChoice = inputForMultipleChoice.nextInt();
                ((MultipleChoice) quizQuestion).checkForCorrectMultipleChoiceAnswer(userInputForMultipleChoice);

            }else if(quizQuestion instanceof TrueOrFalse) {
                System.out.println("1 - True");
                System.out.println("2 - False");

                Scanner inputForTrueFalse = new Scanner(System.in);
                System.out.println("Choose wisely: ");
                int userInputForTrueFalse = inputForTrueFalse.nextInt();
                ((TrueOrFalse) quizQuestion).checkForCorrectTrueFalseAnswer(userInputForTrueFalse);

            }else if(quizQuestion instanceof Checkbox){

            }
        }
    }

    public void gradeQuiz(ArrayList<Question> quizQuestionArray) {
        for(Question question : quizQuestionArray) {
            if (question instanceof MultipleChoice) {
                this.score += ((MultipleChoice) question).getCorrectMultipleChoiceScore();
            }else if(question instanceof TrueOrFalse) {
                this.score += ((TrueOrFalse) question).getTrueFalseScore();
            }else if(question instanceof Checkbox) {
                this.score += ((Checkbox) question).getCheckBoxScore();
            }
        }
        System.out.println(this.score);
    }
}
