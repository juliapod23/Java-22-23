package U7_ArrayLists.Examples;

public class Notes_7_3_TryCatch {
    public static void main(String[] args) {

        int[] myNums = {1,2,3,4};
        String str = "hello world";

        try{
            //int x = 5/0;
            //System.out.println("The last number is: " + myNums[4]);
            System.out.println(str.substring(8,77));
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("Invalid index for string!");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index for array!");
        }
        catch (ArithmeticException e){
            System.out.println("Can't divide by 0!");
        }
        catch (Exception e){
            System.out.println("Something went wrong!");
        }
    }
}
