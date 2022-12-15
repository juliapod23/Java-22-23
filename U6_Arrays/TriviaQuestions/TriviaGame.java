package U6_Arrays.TriviaQuestions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaGame {
    private Question[] generatedQuestions;
    private boolean isCorrect;
    private char correctAnswer;
    private int pointsGained;
    private int accPoints;
    private int answerStreak;

   // public TriviaGame(Question[] generatedQuestions) {
   //    this.generatedQuestions = new Question[12];
   //    for(int i = 0; i < 12; i++){
   //        this.generatedQuestions[i] = new Question(generatedQuestions[i].getQuestion(), generatedQuestions[i].getAnswers(),generatedQuestions[i].getCorrectAnswer(),generatedQuestions[i].getPointValue());
   //    }
   // }


    public void loadQuestions(String filePath) throws FileNotFoundException {
        File myFile = new File(filePath);
        Scanner fileIn = new Scanner(myFile);

        //read in number of questions
        int numQuestions = fileIn.nextInt();
        fileIn.nextLine();

        // array of question objects
        generatedQuestions = new Question[numQuestions];

        for(int j = 0;j < numQuestions; j++){
            String question = fileIn.nextLine();
            String[] answerOptions = new String[4];
            for(int i = 0; i < 4; i++){
                String answer = fileIn.nextLine();
                answerOptions[i] = answer;
            }
            String correctAnswer = fileIn.nextLine();
            int pointValue = fileIn.nextInt();

            if(fileIn.hasNextLine()){
                fileIn.nextLine();      //dummy read to clear newline after #
            }

            Question curQ = new Question(question, answerOptions, correctAnswer, pointValue);
            generatedQuestions[j] = curQ;

        }

        // at this point, we're done loading text file
        for(Question q : generatedQuestions){
            System.out.println(q);
        }
    }

    public Question[] getGeneratedQuestions() {
        return generatedQuestions;
    }

    public void setGeneratedQuestions(Question[] generatedQuestions) {
        this.generatedQuestions = generatedQuestions;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    public char getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(char correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public int getPointsGained() {
        return pointsGained;
    }

    public void setPointsGained(int pointsGained) {
        this.pointsGained = pointsGained;
    }

    public int getAccPoints() {
        return accPoints;
    }

    public void setAccPoints(int accPoints) {
        this.accPoints = accPoints;
    }

    public int getAnswerStreak() {
        return answerStreak;
    }

    public void setAnswerStreak(int answerStreak) {
        this.answerStreak = answerStreak;
    }


}
