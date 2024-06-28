import java.util.Scanner;
public class Student {
    private String studentID;
    private String studentName;
    private double grade;

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade >= 0.0 && grade <= 100.0) {
            this.grade = grade;
        } else {
            System.out.println("Invalid grade. Please enter a value between 0.0 and 100.0.");
        }
    }
}
