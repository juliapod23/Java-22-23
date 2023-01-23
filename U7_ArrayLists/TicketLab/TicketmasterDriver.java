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
        //while(tryAgain) {
        //     try{
        //        System.out.println("Please enter an int: ");
        //        int num = in.nextInt();
        //        System.out.println("You entered: " + num);
        //        tryAgain = false;   //ends error checking while loop
        //    } catch(Exception e){
        //        System.out.println("Invalid entry");
        //        in.nextLine();  //dummy read to clear bad data out
        //    }
        //    //will keep asking user for a num til a valid entry is entered}
        //}
        int[] choices = new int[6];
        for(int i = 0; i < choices.length;i++){
            choices[i] = i+1;
        } // array representing possible options



        int validDigit;
        while(tryAgain){
            System.out.println("Please enter an int 1-6: ");
            String userSubmit = in.nextLine();
            try{
                validDigit = Integer.parseInt(userSubmit);
                if(ifValid){
                    System.out.println("You entered: " + num);
                    tryAgain = false;
                }
            } catch(InputMismatchException e){
                System.out.println("You have entered a letter. Please enter an integer.");
            }
            catch (arrayIndexOutOfBoundsException e){
                System.out.println("The number you entered is not a valid option. Please try again.");
            }
        }
    }
}
