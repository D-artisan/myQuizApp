package com.example.danny.myquizapp;

public class Questions {

    public String mQuestions[] = {
            "What is the capital City of Ghana",
            "Who was the first President of Ghana",
            "In which year did Ghana attain independence",
            "Which country happens to be the Colonial Masters of Ghana",
            "Ghana was originally knowns as the ______________"
    };


    private String mChoice[][] = {
            {"Kumasi", "Sunyani", "Greater Accra"},
            {"Dr. Limann", "Dr. Kwame Nkrumah", "Nana Akuffo-Addo"},
            {"1909", "1958", "1957", "2001"},
            {"Spain", "Great Britain", "Peru"},
            {"Silver Coast", "Bronze Coast", "Gold Coast"}

    };

    private String mCorrectAnswer[] = {"Greater Accra", "Dr. Kwame Nkrumah", "1957", "Great Britain", "Gold Coast"};


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

    /**
     * @param a
     * @return get fourth option or choice in an array from the answerChoices array
     */

    public String getChoice4(int a) {
        String choice = mChoice[a][3];
        return choice;
    }

    /**
     * @param a
     * @return get fifth option or choice in an array from the answerChoices array
     */

    public String getChoice5(int a) {
        String choice = mChoice[a][4];
        return choice;
    }


    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswer[a];
        return answer;

    }
}