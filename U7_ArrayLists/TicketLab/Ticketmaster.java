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

    /**
     * Scans the show data file and saves each token and creates a show object out of accumulated tokens.
     * Adds each show object to an ArrayList.
     * @throws FileNotFoundException
     */
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

    public void sortByPrice(){
        for(int i = 1; i < shows.size(); i++){
            Show valueToInsert = shows.get(i);
            int position = i;
            while(position > 0 && shows.get(position - 1).getPrice() > valueToInsert.getPrice()){
                shows.set(position,shows.get(position - 1));
                position--;
            }
            shows.set(position,valueToInsert);
        }

    }

    public void sortByReversePrice(){
        for(int i = 1; i < shows.size(); i++){
            Show valueToInsert = shows.get(i);
            int position = i;
            while(position > 0 && shows.get(position - 1).getPrice() < valueToInsert.getPrice()){
                shows.set(position,shows.get(position - 1));
                position--;
            }
            shows.set(position,valueToInsert);
        }

    }
}
