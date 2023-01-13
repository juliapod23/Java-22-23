package U6_Arrays.TriviaQuestions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaGame {
    
    // Instance variables
    private Question[] generatedQuestions;
    private int correctAnswered;
    private int incorrectAnswered;
    private int pointsGained;
    private int accPoints;
    private int answerStreak;
    private String userName;
    private String filePath;
    private int numQuestions;
    private int doneQuestions;

    // Constructor
    public TriviaGame(String textFile) {
        this.generatedQuestions = new Question[0];
        this.correctAnswered = 0;
        this.incorrectAnswered = 0;
        this.pointsGained = 0;
        this.accPoints = 0;
        this.answerStreak = 0;
        this.userName = "";
        this.filePath = textFile;
        this.numQuestions = 0;
        this.doneQuestions = 0;
    }

    /**
     * Takes in the text file and populates the question array
     *
     * @throws FileNotFoundException Exception to avoid error
     */
    public void loadQuestions() throws FileNotFoundException {
        File myFile = new File(filePath);
        Scanner fileIn = new Scanner(myFile);

        // read in number of questions
        numQuestions = fileIn.nextInt();
        fileIn.nextLine();

        // array of question objects
        generatedQuestions = new Question[numQuestions];

        for (int j = 0; j < numQuestions; j++) {
            String question = fileIn.nextLine();
            String[] answerOptions = new String[4];
            for (int i = 0; i < 4; i++) {
                answerOptions[i] = fileIn.nextLine();
            }
            String correctAnswer = fileIn.nextLine();
            int pointValue = fileIn.nextInt();

            if (fileIn.hasNextLine()) {
                fileIn.nextLine(); // dummy read to clear newline after #
            }

            Question curQ = new Question(question, answerOptions, correctAnswer, pointValue);
            generatedQuestions[j] = curQ;

        }

        // at this point, we're done loading text file
        for (Question q : generatedQuestions) {
            System.out.println(q);
        }
    }

    /**
     * Asks the user for their name, and prints the directions
     */
    public void beginGame() {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        userName = input.nextLine();
        input.nextLine(); // dummy read

        System.out.println("Hello " + userName + ", and welcome to Capital Trivia!\n"
        + "Directions: You will be presented with 12 random questions about capitals of different countries!" +
        "Each question has a different point value based on difficulty. Type in the letter of the answer you believe"
        + " to be correct, and receive your score!"); // directions for game
    }

    /**
     * Displays the next question to the user and flags the question as being already asked so that
     * it doesn't show up again, and based on if the user answered correctly, updates the stats and 
     * displays them to the user
     */
    public void nextQuestion(){
        Scanner input = new Scanner(System.in);
        Question output = showQuestion();
        while(output.isAlreadyAsked()){
            output = showQuestion();
        }
        output.setAlreadyAsked(true);
        System.out.println(output);
        String userAnswer = input.nextLine();
        if(userAnswer.equalsIgnoreCase(output.getCorrectAnswer())){
            pointsGained += output.getPointValue();
            correctAnswered++;
            answerStreak++;
            doneQuestions++;
            System.out.println("Correct! Nice job!");
        } else{
            incorrectAnswered++;
            answerStreak = 0;
            doneQuestions++;
            System.out.println("Sorry, that's incorrect!");
        }
        System.out.println(displayStats());
    }

    /**
     * Generates a random number between 0 and 12, exclusive
     * @return The question at the randomly generated index
     */
    public Question showQuestion() {
        int randNum = (int) (Math.random() * numQuestions);
        return generatedQuestions[randNum];
    }

    /**
     * Formats game statistics into a string
     * @return The formatted string of results
     */
    public String displayStats() {
        String output = "\nTotal points earned: " + pointsGained + "\nQuestions answered correctly: " + correctAnswered
                + "\nAccuracy: ";
        double percentCorrect = (correctAnswered / (double)doneQuestions) * 100;
        output += percentCorrect + "%";
        return output;
    }
 
    // Getters and setters

    public Question[] getGeneratedQuestions() {
        return generatedQuestions;
    }

    public void setGeneratedQuestions(Question[] generatedQuestions) {
        this.generatedQuestions = generatedQuestions;
    }

    public int getCorrectAnswered() {
        return correctAnswered;
    }

    public void setCorrectAnswered(int correctAnswered) {
        this.correctAnswered = correctAnswered;
    }

    public int getIncorrectAnswered() {
        return incorrectAnswered;
    }

    public void setIncorrectAnswered(int incorrectAnswered) {
        this.incorrectAnswered = incorrectAnswered;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public int getNumQuestions() {
        return numQuestions;
    }

    public void setNumQuestions(int numQuestions) {
        this.numQuestions = numQuestions;
    }

    public int getDoneQuestions() {
        return doneQuestions;
    }

    public void setDoneQuestions(int doneQuestions) {
        this.doneQuestions = doneQuestions;
    }

}
