package U7_ArrayLists.TicketLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class Ticketmaster {
    private ArrayList<Show> shows;
    private String filePath;

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
        }
    }

    public String toString(){
        String output = "";
        for(Show line : shows){
            output += line.toString() + "\n";
        }
        return output;
    }

    public ArrayList<Show> linearSearch(String city){
        ArrayList<Show> curItems = new ArrayList<Show>();

        for(int i = 0; i < shows.size(); i++){
            if(shows.get(i).getCity().equalsIgnoreCase(city)){
                curItems.add(shows.get(i));
            }
        }
        if(curItems.size()==0){
            System.out.println("There are no shows taking place in "+ city +".");
        }

        return curItems;
    }

    public void sortByAlpha(ArrayList<Show> shows){
        for(int i = 0; i < shows.size() - 1; i++){
            int minIndex = i;

            //look for smallest remaining index from index i onwards
            for(int j = i+1; j < shows.size(); j++){
                if(shows.get(j).equals(shows.get(minIndex))){
                    minIndex = j;
                }
            }

            //swap values at index i & index minIndex
            Integer temp = shows.get(i);
            shows.set(i, shows.get(minIndex));
            shows.set(minIndex,temp);
        }
    }
}
