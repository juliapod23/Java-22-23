package U2_UsingObjects;

public class WrapperExample {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x);

        // Create a wrapped integer
        Integer wrappedInt = new Integer(6);
        System.out.println(wrappedInt.intValue());

        // Create a wrapped integer using autoboxing
        Integer wrappedInt2 = 12;
        System.out.println(wrappedInt2);

        // Create a wrapped double
        Double wrappedDouble = 13.0;
        System.out.println(wrappedDouble);

        // Display the minimum and maximum value of integer
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
}
