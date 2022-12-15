package U6_Arrays.CourseEx;

public class Student {
    private String name;
    private Course[] myClasses;

    //Full Constructor
    public Student(String name, Course[] myClasses){
        //copying the name
        this.name = name;

        //copy the courses 1 by 1
        this.myClasses = new Course[8];
        for(int i =0; i <8; i++){
            this.myClasses[i] = new Course( myClasses[i].getTeacherName(),
                    myClasses[i].getSubject(),
                    myClasses[i].getCurrentGrade(),
                    myClasses[i].getPeriod());
        }
    }

    // Write a toString method that will return a string with:
    // 1. The student's name
    // 2. Use a for-loop to print all of the Course objects
    public String toString(){
        // Add the name
        String output = name + ":\n";

        for(int i=0; i < myClasses.length; i++){
            output += this.myClasses[i];
        }

        return output;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course[] getMyClasses() {
        return myClasses;
    }

    public void setMyClasses(Course[] myClasses) {
        this.myClasses = myClasses;
    }
}

