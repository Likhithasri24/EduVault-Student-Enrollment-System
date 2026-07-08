package studentdatabaseapplication;

public class Utils {

    // Display Welcome Message
    public static void displayWelcome() {

        System.out.println("======================================================");
        System.out.println("        WELCOME TO EDUVAULT");
        System.out.println(" Student Enrollment & Fee Management System");
        System.out.println("======================================================");
        System.out.println();
    }

    // Display Section Header
    public static void printHeader(String title) {

        System.out.println();
        System.out.println("======================================================");
        System.out.println("                " + title.toUpperCase());
        System.out.println("======================================================");
    }

    // Display Separator Line
    public static void printLine() {

        System.out.println("------------------------------------------------------");
    }

    // Display Thank You Message
    public static void displayThankYou() {

        System.out.println();
        System.out.println("======================================================");
        System.out.println("   Thank You For Choosing EduVault!");
        System.out.println("   Have a Great Learning Journey!");
        System.out.println("======================================================");
    }
}