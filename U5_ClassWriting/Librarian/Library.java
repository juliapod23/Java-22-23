/*
NAMES: JULIA PODSTAWKA, KASTHURI SIVA
TEACHER: MR. MOON
PERIOD: 7
CLASS DESCRIPTION: Creates a library object that contains three sections, a name, and an address
 */
package U5_ClassWriting.Librarian;

public class Library {
    private String libName;
    private String address;
    private Section adult;
    private Section teens;
    private Section kids;

    // keeps track of the number of libraries created/ in the area
    public static int numLibraries = 0;

    public static int getNumLibraries() {
        return numLibraries;
    }

    public Library(String libName, String address, Section adult, Section teens, Section kids) {
        numLibraries++;
        this.libName = libName;
        this.address = address;
        this.adult = adult;
        this.teens = teens;
        this.kids = kids;
    }
    //Default Constructor
    public Library (String libName, String address){
        numLibraries++;
        this.libName = libName;
        this.address = address;
    }
    //Constructor for each Section's books
    public Library (String libName, String address, Section adult){
        numLibraries++;
        this.libName = libName;
        this.address = address;
        this.adult = adult;
    }

    //Library get/set methods
    public String getLibName() {
        return libName;
    }

    public void setLibName(String libName) {
        this.libName = libName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Section getAdult() {
        return adult;
    }

    public void setAdult(Section adult) {
        this.adult = adult;
    }

    public Section getTeens() {
        return teens;
    }

    public void setTeens(Section teens) {
        this.teens = teens;
    }

    public Section getKids() {
        return kids;
    }

    public void setKids(Section kids) {
        this.kids = kids;
    }

    /**
     * Returns the location, address, and sections available in each library
     * @return information about a library
     */
    public String toString(){
        String output = "";
        output += "Your Current Library Location is:" + this.libName + "\n";
        output += "Address: " + this.address + "\n";
        output += "Sections Available:\n";
        output += "1. Adult\n2. Teens\n3. Kids\n";

        return output;
    }
}

