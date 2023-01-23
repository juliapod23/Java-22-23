package U7_ArrayLists.TicketLab;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TicketmasterDriver {
    public static void main(String[] args) throws FileNotFoundException {
        Ticketmaster test = new Ticketmaster("showData.txt");
        test.readShows();
        System.out.println(test.toString());

        Scanner in = new Scanner(System.in);
        boolean tryAgain = true;
        while(tryAgain) {
             try{
                System.out.println("Please enter an int: ");
                int num = in.nextInt();

                // we KNOW they didn't type in K
                 if (num == 1){
                     System.out.println("You entered: " + num);
                     tryAgain = false;  //ends error checking while loop

                 } else if (num == 2) {
                     System.out.println("You entered: " + num);
                     tryAgain = false;   //ends error checking while loop

                 } else if (num == 3){
                     System.out.println("You entered: " + num);
                     tryAgain = false;   //ends error checking while loop

                 }else if (num == 4){
                     System.out.println("You entered: " + num);
                     tryAgain = false;   //ends error checking while loop

                 }else if (num == 5){
                     System.out.println("You entered: " + num);
                     tryAgain = false;   //ends error checking while loop

                 }else if (num == 6){
                     System.out.println("You entered: " + num);
                     tryAgain = false;   //ends error checking while loop

                 }else{
                     // means they typed in a number, but it's an invalid number
                     System.out.println("Not a valid number");
                 }
            } catch(Exception e){
                 // if they type in K
                System.out.println("You typed in a letter. Please type in a number 1-6.");
                in.nextLine();  //dummy read to clear bad data out
            }
            //will keep asking user for a num til a valid entry is entered
        }
    }
}
