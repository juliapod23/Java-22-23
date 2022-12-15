package U4_Loops;

public class ChallengeProblem {
    public static void main(String[] args) {
        String str = "FremdHS";
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.substring(i, i + 1) + " ");
        }
        System.out.println("");

        String newString = "cookie";
        for (int i = newString.length() - 1; i >= 0; i--){
            System.out.print(newString.substring(i, i + 1));
        }
    }
}
