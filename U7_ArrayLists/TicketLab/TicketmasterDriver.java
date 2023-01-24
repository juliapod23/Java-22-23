package U7_ArrayLists.TicketLab;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TicketmasterDriver {
    public static void main(String[] args) throws FileNotFoundException {
        Ticketmaster test = new Ticketmaster("showData.txt");
        System.out.println("\t\t\t\t\t**** Welcome to the TicketMaster Kiosk ****\nYou may search our shows by city as well as sort the shows by performer and ticket price!\n\t\t\tSelect the correct option corresponding with your choice:\n\n1. Search by City\n2. Sort by Performer(A-Z)\n3. Sort by Performer(Z-A)\n4. Sort by Price(Low-High)\n5. Sort by Price(High-Low)\n6. Quit;\n");
        test.readShows();
        System.out.println(test.toString());

        Scanner in = new Scanner(System.in);
        boolean tryAgain = true;
        while(tryAgain) {
             try{
                System.out.println("Please enter an int: ");
                int num = in.nextInt();
                in.nextLine();       // dummy read

                // we KNOW they didn't type in K
                 if (num == 1){ // search by city
                     System.out.println("You entered: " + num);
                     tryAgain = false;  //ends error checking while loop

                     System.out.println("What city would you like to search for?");
                     String city = in.nextLine();
                     in.nextLine();

                     test.linearSearch(city);

                 } else if (num == 2) { // sort by performer(a-z)
                     System.out.println("You entered: " + num);
                     tryAgain = false;   //ends error checking while loop

                     System.out.println("Performers A-Z:");

                 } else if (num == 3){ // sort by performer(z-a)
                     System.out.println("You entered: " + num);
                     tryAgain = false;   //ends error checking while loop

                     System.out.println("Performers Z-A:");

                 }else if (num == 4){ // sort by price(low-high)
                     System.out.println("You entered: " + num);
                     tryAgain = false;   //ends error checking while loop

                     System.out.println("Price Low - High:");

                 }else if (num == 5){ // sort by price(high-low)
                     System.out.println("You entered: " + num);
                     tryAgain = false;   //ends error checking while loop

                     System.out.println("Price High - Low:");

                 }else if (num == 6){ // quit
                     System.out.println("You entered: " + num);
                     System.out.println("Thank you for using Ticketmaster today!");

                     tryAgain = false;   //ends error checking while loop

                 }else{
                     // means they typed in a number, but it's an invalid number
                     System.out.println("Not a valid number. Please type in a number 1-6.");
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
