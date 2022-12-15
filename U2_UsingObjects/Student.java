package U2_UsingObjects;

public class Student {
    // instance variables
    private String name;
    private double gpa;
    private int gradeLevel;

    // constructor
    public Student(String studentName, double studentGpa, int studentGradeLevel){
        name = studentName;
        gradeLevel = studentGradeLevel;
        gpa = studentGpa;
    }

    public Student(String stName){
        name = stName;
        gradeLevel = 9;
        gpa = -1;
    }

    // methods
    public void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("Grade: " + gradeLevel);
        System.out.println("GPA: " + gpa);
        System.out.println();
    }

    public void setGradeLevel(int newGradeLevel){
        gradeLevel = newGradeLevel;

    }

    public int getGradeLevel(){
        return gradeLevel;
    }


}
