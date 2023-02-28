package U9_Inheritance.Notes.Pack_9_3_9_4;

public class Shape {
    private String color;
    private int numSides;

    public Shape(){
        color = "No color";
        numSides = -1;
    }
    public Shape(String color, int numSides) {
        this.color = color;
        this.numSides = numSides;
    }

    public String toString(String color, int numSides){
        String output = "This shape is " + color + " and has " + numSides + " sides.";
        return output;
    }

}
