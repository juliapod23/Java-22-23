package U6_Arrays.TriviaQuestions;

public class Question {
    private String question;
    private String[] answers;
    private String correctAnswer;
    private int pointValue;
    private boolean alreadyAsked;

    public Question(String question, String[] answers, String correctAnswer, int pointValue) {
        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
        this.pointValue = pointValue;
        this.alreadyAsked = false;
    }
 
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getAnswers() {
        return answers;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public int getPointValue() {
        return pointValue;
    }

    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }

    public boolean isAlreadyAsked() {
        return alreadyAsked;
    }

    public void setAlreadyAsked(boolean alreadyAsked) {
        this.alreadyAsked = alreadyAsked;
    }

    /**
     * Formats a question
     * @return a formatted question
     */
    public String toString(){
        String output = question + "\n" + answers[0]+ "\n" + answers[1]+ "\n" + answers[2]+ "\n" + answers[3];
        return output;
    }
}
