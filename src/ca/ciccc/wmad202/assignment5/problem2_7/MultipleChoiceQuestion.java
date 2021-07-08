package ca.ciccc.wmad202.assignment5.problem2_7;

public class MultipleChoiceQuestion {
    private String[] choices;
    private int correctAnswerIndex;
    private int studentAnswer;
    private String[] question;

    public MultipleChoiceQuestion(String[] choices, int correctAnswerIndex, int studentAnswer){
        this.choices = choices;
        this.correctAnswerIndex = correctAnswerIndex;
        this.studentAnswer = studentAnswer;
        makeQuestionList();
    }

    public void makeQuestionList(){
        question = new String[6];
        for(int i = 0; i < this.choices.length; i++){
            question[i] = choices[i];
        }
        question[4] = String.valueOf(this.correctAnswerIndex);
        question[5] = String.valueOf(this.studentAnswer);
    }

    public String[] getChoices() {
        return choices;
    }

    public String[] getQuestion() {
        return question;
    }

    public void questionReader(){
        String[] choices = getChoices();
        String[] question = getQuestion();

        if(question[4].equals(question[5])){
            System.out.println("You're correct!!");
        }
        else {
            System.out.println("You're wrong...");
        }
    }
}
