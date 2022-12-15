package U6_Arrays.CourseEx;

public class StudentTester {
    public static void main(String[] args) {
        Course per1 = new Course("Newby","Gym","A",1);
        Course per2 = new Course("Higgins","Gym","A",1);
        Course per3 = new Course("Schmidt","Gym","A",1);
        Course per4 = new Course("Anderson","Gym","A",1);
        Course per5 = new Course("Snyder","Gym","A",1);
        Course per6 = new Course("Teschner","Gym","A",1);
        Course per7 = new Course("Moon","APCSA","A+",7);
        System.out.println(per7);

        Course[] schedule = {per1, per2, per3, per4,per5, per6, per7};

        Student st1 = new Student ("Kasthuri", schedule);
        System.out.println(st1);

        per5.setCurrentGrade("F");
        Student st2 = new Student ("Isac", schedule);
        System.out.println(st2);

        System.out.println(st1);

    }
}
