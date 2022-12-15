package U4_Loops;

public class Notes4_5_CodeAnalysis {
    public static void main(String[] args) {
        // #1
        outputBreak("Challenge 1: Number Pyramid 1 to 5");
        String pyramid = "";
        for(int i = 5; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println(pyramid);
        }
        // #2
        outputBreak("Challenge 2: Number Pyramid 55555 to 1");
        for(int i = 5; i >= 1; i--){
            for(int j = 0; j < i; j++){
                System.out.print(i);
            }
            System.out.println();
        }

        // #3
        outputBreak("Challenge 3: Every Other Letter Pyramid");
        everyOtherLetterPyramid("FremdVikings");
        // #4
    }

    public static void everyOtherLetterPyramid(String str){
        String origStr = str;
        System.out.println(origStr);

        String newStr = "";

    }

    public static void outputBreak(String title){
        System.out.println();
        System.out.println();
        System.out.println(title);
        System.out.println();
    }
}
