/*
NAMES: JULIA PODSTAWKA, KASTHURI SIVA
TEACHER: MR. MOON
PERIOD: 7
CLASS DESCRIPTION: Creates a section object that consists of a name and three book objects created by the book class
 */

package U5_ClassWriting.Librarian;

//Section's instance variables
public class Section {
    private String name;
    private Book book1;
    private Book book2;
    private Book book3;

    //Constructor for a section
    public Section(String name, Book book1, Book book2, Book book3) {
        this.name = name;
        this.book1 = book1;
        this.book2 = book2;
        this.book3 = book3;
    }

    //Section get/set methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book getBook1() {
        return book1;
    }

    public void setBook1(Book book1) {
        this.book1 = book1;
    }

    public Book getBook2() {
        return book2;
    }

    public void setBook2(Book book2) {
        this.book2 = book2;
    }

    public Book getBook3() {
        return book3;
    }

    public void setBook3(Book book3) {
        this.book3 = book3;
    }

    /**
     *Finds the average number of pages per book for each of the three sections
     */
    public double getAvgNumPages(){
        double sum = book1.getPage() + book2.getPage() + book3.getPage();
        double avg = sum/3.0;
        return avg;
    }

    /**
     * Creates a toString method to display the books available for each section
     * @return the output as a String
     */
    public String toString(){
        String output = "";

        output += "Section: " + this.name + "\n";
        output += "Books Available for this Section: \n";
        output += book1 + "\n";
        output += book2 + "\n";
        output += book3 + "\n";

        return output;
    }

}
