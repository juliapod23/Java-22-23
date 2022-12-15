package U1_PrimitiveTypes;

public class Notes_1_4_1_5 {
    public static void main(String[] args) {
        // 1. Given a decimal number, truncate the decimals
        // and display the resulting whole number

        double width = 12.7786;
        int newValue = (int)width;
        System.out.println(newValue);

        // 2. Given an integer, display it truncated to the hundreds place
        int bigNum = 8132789;         // should display 8132700
        int lastDigs = bigNum % 100;
        System.out.println(bigNum - lastDigs);

        // OR

        int population = 97349902;
        int hundreds = population / 100 * 100;
        System.out.println(hundreds);

        // 3. Given a decimal number, display it rounded to the nearest integer
        double height = 7.89;
        int newHeight = (int) (height + 0.5);
        System.out.println(newHeight);

        // 4. Given an integer, round it to the nearest hundreds place
        int speed = 16378;
        int roundSpeed;




    }
}
