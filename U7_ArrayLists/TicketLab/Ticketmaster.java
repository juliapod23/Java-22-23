package U7_ArrayLists.TicketLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class Ticketmaster {
    private ArrayList<Show> shows;
    private String filePath;

    public Ticketmaster(String filePath) {
        this.shows = new ArrayList<>();
        this.filePath = filePath;
    }

    /**
     * Scans the show data file and saves each token and creates a show object out of accumulated tokens.
     * Adds each show object to an ArrayList.
     * @throws FileNotFoundException If there is no file present, throw exception
     */
    public void readShows() throws FileNotFoundException {
        File myFile = new File(filePath);
        Scanner fileIn = new Scanner(myFile);

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

    /**
     * Formats each show object in the ArrayList
     * @return Formatted shows ArrayList
     */
    public String toString(){
        String output = "";
        for(Show line : shows){
            output += line.toString() + "\n";
        }
        return output;
    }

    /**
     * Searches linearly through the shows ArrayList to find shows that match with the user inputted city.
     * Adds matches to a new ArrayList.
     * @param city User inputted city
     * @return List of shows that occur in the user's preferred city
     */
    public ArrayList<Show> linearSearch(String city){
        ArrayList<Show> curItems = new ArrayList<>();

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

    /**
     * Using selection sort, sorts the ArrayList of shows alphabetically by comparing each show element's artist to the others.
     */
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

    /**
     * Using selection sort, sorts the ArrayList of shows reverse alphabetically by comparing each show element's artist to the others.
     */
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

    /**
     * Using insertion sort, sorts the ArrayList of shows from lowest to highest price by comparing each show element's price to the others.
     */
    public void sortByPrice(){
        for(int i = 1; i < shows.size(); i++){
            Show valueToInsert = shows.get(i);
            int position = i;
            while(position > 0 && shows.get(position - 1).getPrice() > valueToInsert.getPrice()){
                shows.set(position,shows.get(position - 1)); // Shift right
                position--;
            }
            shows.set(position,valueToInsert);
        }

    }

    /**
     * Using insertion sort, sorts the ArrayList of shows from highest to lowest price by comparing each show element's price to the others.
     */
    public void sortByReversePrice(){
        for(int i = 1; i < shows.size(); i++){
            Show valueToInsert = shows.get(i);
            int position = i;
            while(position > 0 && shows.get(position - 1).getPrice() < valueToInsert.getPrice()){
                shows.set(position,shows.get(position - 1)); // Shift right
                position--;
            }
            shows.set(position,valueToInsert);
        }

    }
}
