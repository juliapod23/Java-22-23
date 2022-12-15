package U1_PrimitiveTypes;

public class Example_1_3 {
    public static void main(String[] args) {
        System.out.println("Hello World!");


        // You're throwing a pizza party! Create variables for the
        // number of guests, as well as the number of pizzas

        int guestCount = 5;
        int pizzaCount = 3;

        // 1. Use a system.out.print statement to display a summary of the party so far

        System.out.println("There are " + guestCount + " guests in attendance and " + pizzaCount + " pizzas on the table.");

        // 2. Two more guests just showed up and brought 4 more pizzas. Update all variables and display new info

        guestCount = guestCount + 2;
        pizzaCount = pizzaCount + 4;

        System.out.println("There are " + guestCount + " guests in attendance and " + pizzaCount + " pizzas on the table.");

        // 3. Display the ones digit of the given integer
        int num = 23;
        int onesDigit = num % 10;
        System.out.println(onesDigit);

        // 4. Display the tens digit of an integer
        int number = 450;
        int tensDigit = number / 10;
        tensDigit = tensDigit % 10;
        System.out.println(tensDigit);

    }
}
