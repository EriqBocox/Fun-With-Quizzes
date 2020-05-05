package main;

public class TrueOrFalse extends Question {
    private final int trueFalseCorrectAnswer;
    private int trueFalseScore = 0;

    public TrueOrFalse(String inquiry, int trueFalseCorrectAnswer) {
        super(inquiry);
        this.trueFalseCorrectAnswer = trueFalseCorrectAnswer;
    }

    public int getTrueFalseScore() {
        return trueFalseScore;
    }

    public int checkForCorrectTrueFalseAnswer(int userAnswer) {
        if(userAnswer == trueFalseCorrectAnswer){
            System.out.println("Correct!");
            this.trueFalseScore += 1;
        }else {
            System.out.println("Incorrect!");
        }
        return this.trueFalseScore;
    }
}
