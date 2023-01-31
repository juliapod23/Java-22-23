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

        for (Show show : shows) {
            if (show.getCity().equalsIgnoreCase(city)) {
                curItems.add(show);
            }
        }
        if(curItems.size()==0){
            System.out.println("There are no shows taking place in "+ city +".");
        }

        return curItems;
    }

    public void sortByAlpha(){
        for(int i = 0; i < shows.size() - 1; i++){
            int minIndex = i;

            //look for smallest remaining index from index i onwards
            for(int j = i+1; j < shows.size(); j++){
                if(shows.get(j).getPerformer().compareTo(shows.get(minIndex).getPerformer()) < 0){
                    minIndex = j;
                }
            }

            //swap values at index i & index minIndex
            Show temp = shows.get(i);
            shows.set(i, shows.get(minIndex));
            shows.set(minIndex,temp);
        }
    }

    public void sortByReverseAlpha(){
        for(int i = 0; i < shows.size() - 1; i++){
            int minIndex = i;

            //look for largest remaining index from index i onwards
            for(int j = i+1; j < shows.size(); j++){
                if(shows.get(j).getPerformer().compareTo(shows.get(minIndex).getPerformer()) > 0){
                    minIndex = j;
                }
            }

            //swap values at index i & index minIndex
            Show temp = shows.get(i);
            shows.set(i, shows.get(minIndex));
            shows.set(minIndex,temp);
        }
    }

    public void sortByPrice(ArrayList<Show> shows){
/*        for(int i = 1; i < shows.size(); i++){
            Show currentValue = shows.get(i);

            double curPrice = shows.get(i - 1).getPrice();
            while(j >= 0 && shows.get(j) > currentValue){
                shows.get(j+1) = shows.get(j);
                j--;
            }
            shows.get(j+1) = currentValue;
        }

 */
    }
}
