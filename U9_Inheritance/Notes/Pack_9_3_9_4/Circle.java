package U9_Inheritance.Notes.Pack_9_3_9_4;

public class Circle extends Shape {
    private double radius;

    public Circle(){
        super();
        radius = 0;
    }

    public Circle(String color, int numSides, double r) {
        super(color,numSides);
        radius = r;
    }

    /*
     public String toString(String color, int numSides, double r){
        String output = super(toString(String color,int numSides)) +
     }
     */

}
