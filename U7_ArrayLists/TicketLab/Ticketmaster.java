package U7_ArrayLists.TicketLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class Ticketmaster {
    private ArrayList<Show> shows;
    private String filePath;


    //add constructor later

    public Ticketmaster(String filePath) {
        this.shows = new ArrayList<Show>();
        this.filePath = filePath;
    }

    //method to read in show data will populate each element of shows array
    //while loop of adding toStringed shows to ticketmaster toString, which will print the collection of toStringed shows


    public void readShows() throws FileNotFoundException {
        File myFile = new File(filePath);
        Scanner fileIn = new Scanner(myFile);

        //array of show objects
        ArrayList<Show> showList = new ArrayList<Show>();
        while (fileIn.hasNext()) {

            String date = fileIn.next();
            double price = fileIn.nextDouble();
            int qty = fileIn.nextInt();
            String perfCity = fileIn.nextLine();

            int comma = perfCity.indexOf(",");
            String performer = perfCity.substring(1, comma);
            String city = perfCity.substring(comma+2);

            Show temp = new Show(date, price, qty, performer, city);
            shows.add(temp);

            if (fileIn.hasNextLine()) {
                fileIn.nextLine(); //dummy read
            }
        }
    }

    public ArrayList<Show> getShows() {
        return shows;
    }

    public String toString(){
        String output = "";
        for(Show line : shows){
            output += line.toString() + "\n";
        }
        return output;
    }

    public void startTicketMaster(){
        String output = "\t\t\t\t\t\t**** Welcome to the TicketMaster Kiosk ****\nYou may search our shows by city as well as sort the shows by performer and ticket price"+
                "\n\t\t\t\tSelect the correct option corresponding with your choice:"+
                "1. Search by City\n2. Sort by Performer(A-Z)\n3. Sort by Performer(Z-A)\n4. Sort by Price(Low-High)\n5. Sort by Price(High-Low)\n6. Quit";

    }

}
