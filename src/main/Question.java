package main;

import java.util.ArrayList;

public class Question {
    private String inquiry;

    public Question(String inquiry) {
        this.inquiry = inquiry;
    }

    public String getInquiry() {
        return inquiry;
    }

    public ArrayList<String> printAnswerOptions(ArrayList<String> answerOptions) {
        for(String answerOption : answerOptions){
            System.out.println(answerOption);
        }
        return answerOptions;
    }

}
