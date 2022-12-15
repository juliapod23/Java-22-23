package U6_Arrays.CourseEx;

public class Course {
    private String teacherName;
    private String subject;
    private String currentGrade;
    private int period;

    //Full Constructor
    public Course(String teacherName, String subject, String currentGrade, int period) {
        this.teacherName = teacherName;
        this.subject = subject;
        this.currentGrade = currentGrade;
        this.period = period;
    }

    //Constructor for courses without teacher or grade
    public Course(String subject, int period) {
        this.subject = subject;
        this.period = period;
        this.teacherName = "N/A";
        this.currentGrade = "N/A";
    }

    //Create method that will return course data on one line(include new line at the end)
    public String toString() {
        String output = "Period " + period + " " + subject + " with M(r/s). " + teacherName + ", " + currentGrade+ "\n";
        return output;
    }



    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCurrentGrade() {
        return currentGrade;
    }

    public void setCurrentGrade(String currentGrade) {
        this.currentGrade = currentGrade;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
}
