package U9_Inheritance.Notes.Pack_9_3_9_4;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle() {
        super();
        length = 0;
        width = 0;
    }

    public Rectangle(String color, int numSides, double l, double w) {
        super(color, numSides);
        length = l;
        width = w;
    }
}
