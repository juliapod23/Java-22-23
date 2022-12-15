package U3_Boolean_If_Statements;

public class CompoundBooleanExample {
    public static void main(String[] args) {
        String day = "Saturday";
        int numHwAssignments = 2;

        if(day.equals("Saturday") || numHwAssignments == 0){
            System.out.println("Yay, video games!");
        }
        else {
            System.out.println("I guess I'll have to wait :(");
        }

        if(day.equals("Monday") && numHwAssignments <= 2){
            System.out.println("Yay, coding club!");
        }
        else{
            System.out.println("Today is a sad day :(");
        }

        int probability = (int)(Math.random());
        if(day.equals("Saturday") || day.equals("Sunday")){
            probability = 1;
            System.out.println("Exercise");
        }
        else{
            if(numHwAssignments == 0){
                if(probability <= .3){
                    System.out.println("Exercise");
                }
            }
            else{
                System.out.println("No Exercise");
            }
        }
    }
}




