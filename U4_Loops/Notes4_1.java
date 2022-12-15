package U4_Loops;
import java.util.Scanner;
public class Notes4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isDone = false;
        int score = 0;
        int numScores = 0;

        while(isDone == false){
            //prompt user if they have a new number for us
            System.out.println("Do you have a number to enter? (Y or N)");
            String reply = input.nextLine();

            if (reply.equalsIgnoreCase("Y")){
                // prompt user to enter the number
                System.out.println("Enter a number");
                int newScore = input.nextInt();
                input.nextLine();           // to clear the "enter" after the number
                //update some stats
                score += newScore;
                numScores++;
            }
            else{
                isDone = true;
            }
        }

        System.out.println("Sum of all numbers: " + score);
        double avg = (double)score / numScores;
        System.out.println(avg);

    }
}
