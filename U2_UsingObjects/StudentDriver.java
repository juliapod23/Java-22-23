package U2_UsingObjects;

public class StudentDriver {
    public static void main(String[] args) {
        System.out.println("hello");

        Student s1 = new Student("Mike",3.78,11);
        Student s2 = new Student("Varsha");

        s1.printInfo();
        s2.printInfo();

        s1.setGradeLevel(12);
        s1.printInfo();

        System.out.println(s1.getGradeLevel());


    }
}
