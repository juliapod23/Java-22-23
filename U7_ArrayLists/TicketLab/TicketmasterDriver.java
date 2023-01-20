package U7_ArrayLists.TicketLab;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TicketmasterDriver {
    public static void main(String[] args) throws FileNotFoundException {

        //Scanner in = new Scanner(System.in);
        //boolean tryAgain = true;
        //while(tryAgain){
        //    try{
        //        System.out.println("Please enter an int: ");
        //        int num = in.nextInt();
        //        System.out.println("You entered: " + num);
        //        tryAgain = false;   //ends error checking while loop
        //    } catch(Exception e){
        //        System.out.println("Invalid entry");
        //        in.nextLine();  //dummy read to clear bad data out
        //    }
        //will keep asking user for a num til a valid entry is entered}


        Ticketmaster test = new Ticketmaster("showData.txt");
        test.readShows();
        System.out.println(test.toString());
    }
}
