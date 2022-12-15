package U6_Arrays.TriviaQuestions;

import java.util.Scanner;

public class TriviaDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = input.nextLine();
        input.nextLine();       //dummy read
        
        System.out.println("Hello " + userName + ", and welcome to Capital Trivia!\n" 
        + "Directions: You will be presented with 12 random questions about capitals of different countries!" +
        "Each question has a different point value based on difficulty. Type in the letter of the answer you believe" +
        " to be correct, and receive your score!");     //directions for game

        




    }

}
