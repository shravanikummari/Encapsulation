import java.util.Scanner;

public class GradeManagementApp {
    private Scanner scanner;
    public GradeManagementApp() {
        scanner = new Scanner(System.in);
    }
    public void addStudent() {
        Student student = new Student();
        System.out.print("Enter student ID: ");
        student.setStudentID(scanner.nextLine());
        System.out.print("Enter student name: ");
        student.setStudentName(scanner.nextLine());
        System.out.print("Enter student grade: ");
        double grade = scanner.nextDouble();
        student.setGrade(grade);
        scanner.nextLine();

        displayStudentInfo(student);
    }

    // Method to display student information
    public void displayStudentInfo(Student student) {
        System.out.println("Student ID: " + student.getStudentID());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Student Grade: " + student.getGrade());
    }

    // Main method to run the application
    public static void main(String[] args) {
        GradeManagementApp app = new GradeManagementApp();
        boolean exit = false;
        while (!exit) {
            System.out.println("1. Add Student");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            int choice = app.scanner.nextInt();
            app.scanner.nextLine();

            switch (choice) {
                case 1:
                    app.addStudent();
                    break;
                case 2:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
