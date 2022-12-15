package U2_UsingObjects;

public class StringExample {
    public static void main(String[] args) {
        String s1 = "Vacation";
        String s2 = "Sunshine cures all things";

        // .toUpperCase() returns the same string, but in all caps
        System.out.println(s1.toUpperCase());

        // Just prints out s1 because s1 was not set to be all caps, it was only printed
        System.out.println(s1);

        // prints out the position of the letter in the string, only the first occurrence
        System.out.println(s2.indexOf("u"));

        // prints out -1 because there is no x in the string
        System.out.println(s2.indexOf("x"));

        // prints out everything in the string to the right of position 4
        System.out.println(s1.substring(4));

        // prints out everything in between position 2 and 5, first number inclusive, second number exclusive
        System.out.println(s1.substring(2,5));

        System.out.println(s1.length());
        System.out.println(s2.length());

        // .equals() returns true or false if the String matches the variable
        boolean isEqual = s1.equals("VACATION");
        System.out.println(isEqual);

        String s3 = "bat";
        String s4 = "bird";
        String s5 = "Mickey";

        System.out.println(s3.compareTo(s4));
        System.out.println(s3.compareTo(s3));
        System.out.println(s4.compareTo(s3));
    }
}
