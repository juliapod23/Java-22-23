package U8_2DArrays.Examples;

public class Notes_8_2_MethodWriting {
    public static void main(String[] args) {
        int[][] myNums = {  {9,7,25,3},
                            {29,8,22,10},
                            {19,16,9,1}};

        //1. Output the array in normal form
        showArray(myNums);

        //2. Output the average of all nums in myNums
        double avg = getAvg(myNums);
        System.out.println("Average value: " + avg);

        //3. Find the number of rows that contain at least one even number
        int evenRowCount = getEvenRowCount(myNums);
        System.out.println("# of rows with an even #: "+ evenRowCount);

        //4. Find the number of columns that contain at least one even number
        int evenColCount = getEvenColCount(myNums);
        System.out.println("# of columns with an even #: " + evenColCount);
    }

    public static void showArray(int[][] arr) {
        for(int[] row: arr){
            for(int val: row){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static double getAvg(int[][] arr) {
        double avg = 0;
        int count = 0;
        for(int[] row: arr){
            for(int val: row){
                avg += val;
                count++;
            }
        }

        // or: int count = arr.length * arr[0].length;
        return avg/count;
    }

    public static int getEvenRowCount(int[][] arr) {
        int count = 0;
        for(int[] row: arr){
            for(int val: row){
                if(val % 2 == 0){
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    /*
    public static int getEvenColCount(int[][] arr) {
    int count = 0;
        for(int j = 0; j < arr[0].length+1; j++){
            for(int i = 0; i < arr.length; i++){
                if(j % 2 == 0){
                    count++;
                    break;
                }
            }
        }
        return count;

    }
     */

    public static int getEvenColCount(int[][] arr){
        int count = 0;
        for(int column = 0; column < arr[0].length;column++){
            boolean hasEven = false;
            for(int row = 0; row < arr.length; row++){
                if(arr[row][column] %2 == 0){
                    hasEven = true;
                }
            }
            if(hasEven == true){
                count++;
            }
        }
        return count;
    }


}
