package U2_UsingObjects;
import java.util.Scanner;
public class MathExampleWS5 {
    /*
     *  Julia Podstawka
     *  Moon Period 7
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Give a value for a variable x");
        int x1 = input.nextInt();
        System.out.println("Give a value for a variable y");
        int y1 = input.nextInt();
        System.out.println("Give another value for a variable x");
        int x2 = input.nextInt();
        System.out.println("Give another value for a variable y");
        int y2 = input.nextInt();

        double distance = Math.sqrt(Math.pow(x1-x2,2)+ Math.pow(y1 - y2,2));

        System.out.println("The distance between (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is " + distance);


        System.out.println("Give a max value");
        int max = input.nextInt();

        System.out.println("Give a min value");
        int min = input.nextInt();

        int range = (max - min) + 1;

        int rand = (int)(Math.random() * range) + min;

        System.out.println("Your random number on the interval is " + rand + ".");

        System.out.println("Give a random decimal number");
        double random = input.nextDouble();
        System.out.println(Math.abs(random));

        System.out.println("Give a random number");
        int rand2 = input.nextInt();
        System.out.println(Math.pow(rand2, 2));

        System.out.println(Math.min(6,10));
        System.out.println(Math.max(6,10));
    }
}
