package U3_Boolean_If_Statements;

public class Student {
    private String fName;
    private String lName;
    private int idNum;

    public Student(String fName, String lName, int idNum){
        this.fName = fName;
        this.lName = lName;
        this.idNum = idNum;
    }
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    //public boolean equals(String fName, String lName){

    //}

    //public int compareTo(){

    //}
}
