/*
NAMES: JULIA PODSTAWKA, KASTHURI SIVA
TEACHER: MR. MOON
PERIOD: 7
CLASS DESCRIPTION: Creates books, sections, and a library. Simulates a library search engine by taking the
user through different library sections, generates a random book for the user, and displays the average book
length.
 */

package U5_ClassWriting.Librarian;

import java.util.Scanner;

public class LibrarianTester {
    private static Object userinput;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Palatine Library Catalog
        Book b1 = new Book("The Little Prince","Antoine de Saint-Exupéry",710, 216); //kids
        Book b2 = new Book("Goodnight Moon","Margaret Wise Brown",360,18); //kids
        Book b3 = new Book("A Bad Case of Stripes", "David Shannon",610,32); //kids
        Book b4 = new Book ("Harry Potter and the Chamber of Secrets", "JK Rowling", 880, 223); //teen
        Book b5 = new Book ("Six of Crows", "Leigh Bardugo", 790,479); //teen
        Book b6 = new Book("The Fault in Our Stars","John Green", 850,313); //teen
        Book b7 = new Book ("War and Peace", "Leo Tolstoy", 1180,1225); //adult
        Book b8 = new Book("Les Miserables","Victor Hugo",1010,1462); //adult
        Book b9 = new Book("The Hunchback of Notre Dame","Victor Hugo", 1120,544); //adult

        //Generate 3 sections for the library
        Section adult = new Section("Adult",b7,b8,b9);
        Section teen = new Section("Teen",b4,b5,b6);
        Section kids = new Section("Kid",b1,b2,b3);

        System.out.println("Number of libraries in your area: " + Library.getNumLibraries());

        //Print your nearest library info
        Library l1 = new Library ("Palatine Library", "700 N North Ct, Palatine, IL" );
        System.out.println(l1);

        System.out.println("Number of libraries in your area: " + Library.getNumLibraries());

        //Prompt user to view a section then display the respective books
        boolean isDone = false;

        System.out.println("Which section would you like to view?\n (Please type in a number: 1,2,3)");
        int choice = input.nextInt();
        input.nextLine();   //dummy read for \n


        while (!isDone){

            System.out.println("Here are the books in this section: \n");
            //Initialize a section cause java wants us to
            Section g1 = new Section("Adults",b7,b8,b9);

            // Grab the appropriate section
            if (choice == 1) {
                g1 = new Section("Adults",b7,b8,b9);
                System.out.println(g1);
            }
            else if (choice == 2){
                g1 = new Section("Teens", b4, b5, b6);
                System.out.println(g1);
            }
            else if (choice == 3){
                g1 = new Section("Kids", b1, b2, b3);
                System.out.println(g1);
            }
            else{
                System.out.println("ERROR 404: SECTION NOT FOUND. PLEASE TRY AGAIN.");
            }
            // determine if user is done
            boolean goAgain = viewAnother(input);
            if (goAgain == false){
                break;
            }

            // if we get here, means they DID want to go again
            System.out.println(l1);
            //Prompt user for a new section to view
            System.out.println("Which section would you like to view?");
            choice = input.nextInt();
            input.nextLine();   //dummy read for \n

        }

        //Prompt user to get a random book from the library catalog
        Scanner submit = new Scanner(System.in);
        System.out.println("I'm feeling lucky (Yes or No)\n");

        String lucky = submit.nextLine();

        boolean isItDone = false;

        while(!isItDone){
            if(lucky.equalsIgnoreCase("yes")){
                //Prints randNum
                int randNum = (int) (Math.random() * 9) + 1;
                System.out.println("Your random number is: " + randNum + "\n");

                //Prints the book that is associated with the random number
                if(randNum == 1){
                    System.out.println(b1);
                }
                else if(randNum == 2){
                    System.out.println(b2);
                }
                else if(randNum == 3){
                    System.out.println(b3);
                }
                else if(randNum == 4){
                    System.out.println(b4);
                }
                else if(randNum == 5){
                    System.out.println(b5);
                }
                else if(randNum == 6){
                    System.out.println(b6);
                }
                else if(randNum == 7){
                    System.out.println(b7);
                }
                else if(randNum == 8){
                    System.out.println(b8);
                }
                else if(randNum == 9){
                    System.out.println(b9);
                }
                isItDone = true;
            } else{
                break;
            }
        }
        //Prints the average number of pages in a section
        roundPages(adult);
        roundPages(teen);
        roundPages(kids);

    }

    /**
     * Asks the user if they want to look at another section to determine if it is possible to break out of the loop
     * @param obj The text inputted by the user
     * @return returns a boolean based on whether the user would like to see another section or not, and based on the boolean it continues or breaks out of the loop
     */
    public static boolean viewAnother(Scanner obj){
        System.out.println("Would you like to view another section? (Yes or No)\n");
        String answer = obj.nextLine();

        if (answer.equalsIgnoreCase("Yes")){
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Takes the average number of pages of all the books in the section and rounds to the nearest whole number
     * @param s The specific section that is being passed to the method
     */
    public static void roundPages(Section s){
        double avgNumPages = s.getAvgNumPages();
        int newAvgNumPages = (int)Math.round(avgNumPages);
        System.out.println("The average number of pages per book in the " +s.getName() + " section is " + newAvgNumPages + " pages.");
    }
}


