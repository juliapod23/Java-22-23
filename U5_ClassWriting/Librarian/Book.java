/*
NAMES: JULIA PODSTAWKA, KASTHURI SIVA
TEACHER: MR. MOON
PERIOD: 7
CLASS DESCRIPTION: Creates a new book object that consists of a title, lexile rating, and an author
 */

package U5_ClassWriting.Librarian;

//Book instance variables
public class Book {
    private String title;
    private int lexile;
    private String author;
    private int page;

    //Constructor to create a book
    public Book(String title, String author, int lexile, int page) {
        this.title = title;
        this.lexile = lexile;
        this.author = author;
        this.page = page;
    }

    //get/set methods for a book
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLexile() {
        return lexile;
    }

    public void setLexile(int lexile) {
        this.lexile = lexile;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage(){
        return page;
    }

    public void setPage(int page){
        this.page =page;
    }

    /**
     * This method prints relevant information for each book
     * @return output which prints the info for each  book
     */
    public String toString(){
        String output = "";

        output += "Book Title: " + this.title + "\n";
        output += "Author: " + this.author + "\n";
        output += "Lexile: " + this.lexile + "\n";
        output += "Number of pages: " + this.page +"\n";

        return output;
    }
}
