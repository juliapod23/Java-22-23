package U6_Arrays.TriviaQuestions;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class TriviaDriver {
    public static void main(String[] args) throws FileNotFoundException{

        TriviaGame myGame = new TriviaGame("TriviaQuestions.txt");
        myGame.loadQuestions();
        myGame.beginGame();
        
        // Continues to ask the user if they qould like to keep playing until all
        // questions have been asked
        while(keepPlaying){
            myGame.nextQuestion();
            myGame.setDoneQuestions(myGame.getDoneQuestions() + 1);
            if(myGame.getDoneQuestions() == myGame.getNumQuestions()){
                keepPlaying = true;
            } else{
                ifnextQuestion();
            }
        }

        System.out.println("And that's game! Here's how you did:");
        myGame.displayStats();

    }

    public static boolean keepPlaying = true;
    /**
     * Asks the user if they would like to keep playing and updates the keepPlaying boolean
     */
    public static void ifnextQuestion(){
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to answer another question?");
        String answer = input.nextLine();

        if(answer.equalsIgnoreCase("Yes")){
            keepPlaying = true;
        } else{
            keepPlaying = false;
        }
    }


}
