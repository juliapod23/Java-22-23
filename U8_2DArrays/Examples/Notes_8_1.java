package U8_2DArrays.Examples;

public class Notes_8_1 {
    public static void main(String[] args) {
        // Three initialized 1D arrays

        int[] arr2 = {2, 4, 6, 8, 10};
        int[] arr3 = {3, 6, 9, 12, 15};
        int[] arr4 = {4, 8, 12, 16, 20};

        // 1. Create a 2D array called arr2D with arr2, arr3, and arr4
        int[][] arr2d = {arr2, arr3, arr4};

        // 2. Create an int called last and save the last value of the first row
        //    in arr2D in this variable.  Print this value
        int last = arr2d[0][arr2d.length - 1];
        System.out.println(last);

        // 3.  Print the middle value of arr2D
        System.out.println(arr2d[1][2]);

        // 4.  Change the first value in the last row of arr2D to be equal to 0
        //     and then print its new value
        arr2d[arr2d.length - 1][0] = 0;
        System.out.println(arr2d[arr2d.length - 1][0]);

        // BONUS challenge - see if you can figure out the way to use double for loops to
        // traverse a 2D array


        // Write a double loop to print all the values of the array arr2D.
        // Each row of the array should print on a new line
        // i controls the row, j controls the column
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[0].length; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }

        // Create a 5 x 10 2D array called multiples
        int[][] multiples = new int[5][10];

        /* Fill the multiples array using a for loop so that the values look like:
            2 4  6  8 10 12 14 16 18 20
            3 6  9 12 15 18 21 24 27 30
            4 8 12 16 20 24 28 32 36 40
            ..
            6 12 ...                 60
        */
        for (int i = 0; i < multiples.length; i++) {
            for (int j = 0; j < multiples[0].length; j++) {
                System.out.print(multiples[i][j] = (i+2)*(j+1));
                System.out.print(" ");
            }
            System.out.println();
        }

        // Print all values in multiples using a for loop


    }
}
