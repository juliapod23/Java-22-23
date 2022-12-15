package U6_Arrays.CourseEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadingEx {
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("studentScheduleData.txt");
        Scanner fileIn = new Scanner(myFile);

        // the first line contains the number of students on the list
        int numStudents = fileIn.nextInt();
        fileIn.nextLine();   // dummy read for newline after number

        // Create an array of student objects to store our class
        Student[] myStudents = new Student[numStudents];


        for(int j = 0; j < numStudents; j++){
            // First, read in the student's name
            String stName = fileIn.nextLine();
            Course[] sched = new Course[8];

            for(int i = 0; i < 8; i++) {
                String teacherName = fileIn.nextLine();
                String className = fileIn.nextLine();
                String letterGrade = fileIn.nextLine();
                int periodNum = fileIn.nextInt();

                if(fileIn.hasNextLine()){
                    fileIn.nextLine();      //dummy read to clear newline after #
                }

                Course myCourse = new Course(teacherName, className, letterGrade, periodNum);
                sched[i] = myCourse;
            }

            // Now that we know the student's name and courses, create student object
            Student curStudent = new Student(stName, sched);
            myStudents[j] = curStudent;
        }
        // Go thru and display whole class
        for(Student c : myStudents){
            System.out.println(c);
        }
    }
}
