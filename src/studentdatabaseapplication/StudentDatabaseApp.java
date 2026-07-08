package studentdatabaseapplication;

import java.time.LocalDate;
import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        int choice;

        do {

            Utils.displayWelcome();

            System.out.println("============== MAIN MENU ==============");
            System.out.println("1. Enroll New Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Payment");
            System.out.println("5. Delete Student");
            System.out.println("6. Total Students");
            System.out.println("7. Exit");
            System.out.println("=======================================");

            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

            case 1:
                enrollStudent(sc, service);
                break;

            case 2:
                service.viewAllStudents();
                break;

            case 3:
                System.out.println("\nSearch Student Module - Coming Soon");
                break;

            case 4:
                System.out.println("\nUpdate Payment Module - Coming Soon");
                break;

            case 5:
                System.out.println("\nDelete Student Module - Coming Soon");
                break;

            case 6:
                System.out.println("\nTotal Students : " + service.getTotalStudents());
                break;

            case 7:
                Utils.displayThankYou();
                break;

            default:
                System.out.println("\nInvalid Choice!");
            }

            if (choice != 7) {
                System.out.println("\nPress Enter to continue...");
                sc.nextLine();
            }

        } while (choice != 7);

        sc.close();
    }

    // =========================================================
    // Enroll Student
    // =========================================================

    private static void enrollStudent(Scanner sc, StudentService service) {

        Utils.printHeader("Student Enrollment");

        // Student Name

        System.out.print("Enter Student Full Name : ");
        String fullName = sc.nextLine();

        // Qualification

        System.out.println("\nSelect Highest Qualification");

        System.out.println("1. BE/B.Tech");
        System.out.println("2. M.Tech");
        System.out.println("3. MBA");
        System.out.println("4. MCA");

        System.out.print("Enter Choice : ");
        int qualificationChoice = sc.nextInt();
        sc.nextLine();

        String qualification = "";

        switch (qualificationChoice) {

        case 1:
            qualification = "BE/B.Tech";
            break;

        case 2:
            qualification = "M.Tech";
            break;

        case 3:
            qualification = "MBA";
            break;

        case 4:
            qualification = "MCA";
            break;

        default:
            System.out.println("Invalid Qualification!");
            return;
        }

        // Course Selection

        System.out.println("\nAvailable Courses");

        System.out.println("1. Java Full Stack");
        System.out.println("2. Python Full Stack");
        System.out.println("3. Data Science");

        System.out.print("Enter Choice : ");
        int courseChoice = sc.nextInt();
        sc.nextLine();

        Course selectedCourse = null;

        switch (courseChoice) {

        case 1:
            selectedCourse = new Course("JFS", "Java Full Stack", 30000, "6 Months");
            break;

        case 2:
            selectedCourse = new Course("PFS", "Python Full Stack", 28000, "6 Months");
            break;

        case 3:
            selectedCourse = new Course("DS", "Data Science", 35000, "8 Months");
            break;

        default:
            System.out.println("Invalid Course!");
            return;
        }

        Utils.printLine();
        selectedCourse.displayCourseDetails();

        // Payment

        System.out.print("\nEnter Payment Amount : ₹");
        int paidAmount = sc.nextInt();
        sc.nextLine();

        if (!FeeManager.isValidPayment(selectedCourse.getCourseFee(), paidAmount)) {

            System.out.println("Invalid Payment Amount!");
            return;
        }

        int balanceAmount = FeeManager.calculateBalance(
                selectedCourse.getCourseFee(), paidAmount);

        String paymentStatus =
                FeeManager.getPaymentStatus(balanceAmount);

        // Create Student Object

        Student student = new Student();

        student.setFullName(fullName);
        student.setQualification(qualification);
        student.setCourse(selectedCourse);

        student.setTotalFee(selectedCourse.getCourseFee());
        student.setPaidAmount(paidAmount);
        student.setBalanceAmount(balanceAmount);

        student.setPaymentStatus(paymentStatus);
        student.setEnrollmentStatus("Active");

        student.setEnrollmentDate(LocalDate.now().toString());

        student.setEnrollmentId(
                StudentIdGenerator.generateEnrollmentId(selectedCourse));

        // Save Student

        service.addStudent(student);

        // Display Student

        Utils.printHeader("Enrollment Successful");

        student.displayStudentDetails();
    }

}