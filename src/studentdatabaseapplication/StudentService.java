package studentdatabaseapplication;

import java.util.ArrayList;

public class StudentService {

    private ArrayList<Student> students;

    // Default Constructor
    public StudentService() {
        students = new ArrayList<>();
    }

    // Add Student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("\nStudent Enrolled Successfully!");
    }

    // View All Students
    public void viewAllStudents() {

        if (students.isEmpty()) {
            System.out.println("\nNo Student Records Found.");
            return;
        }

        Utils.printHeader("All Students");

        for (Student student : students) {

            student.displayStudentDetails();
            Utils.printLine();
        }
    }

    // Search Student
    public Student searchStudent(String enrollmentId) {

        for (Student student : students) {

            if (student.getEnrollmentId().equalsIgnoreCase(enrollmentId)) {
                return student;
            }
        }

        return null;
    }

    // Delete Student
    public boolean deleteStudent(String enrollmentId) {

        Student student = searchStudent(enrollmentId);

        if (student != null) {
            students.remove(student);
            return true;
        }

        return false;
    }

    // Total Students
    public int getTotalStudents() {
        return students.size();
    }

}