package com.example.danny.myquizapp;

public class Questions {

    public String mQuestions[] = {
            "What is the capital City of Ghana?",
            "In which year did Ghana attain independence?",
            "Ghana was originally known as the ______________"
    };


    private String mChoice[][] = {
            { "Greater Accra","Kumasi","Sunyani"},
            {"1909","1957", "1958"},
            {"Silver Coast", "Bronze Coast", "Gold Coast"}

    };

    private String mCorrectAnswer[] = {"Greater Accra","1957", "Gold Coast"};


    /**
     * @param a
     * @return returns a question from the newQuestions array
     */
    public String getQuestions(int a) {
        String question = mQuestions[a];
        return question;
    }


    /**
     * @param a
     * @return get first option or choice in an array from the answerChoices array
     */
    public String getChoice1(int a) {
        String choice = mChoice[a][0];
        return choice;
    }

    /**
     * @param a
     * @return get second option or choice in an array from the answerChoices array
     */

    public String getChoice2(int a) {
        String choice = mChoice[a][1];
        return choice;
    }

    /**
     * @param a
     * @return get third option or choice in an array from the answerChoices array
     */

    public String getChoice3(int a) {
        String choice = mChoice[a][2];
        return choice;
    }


    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswer[a];
        return answer;

    }
}