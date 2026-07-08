package studentdatabaseapplication;

import java.time.Year;

public class StudentIdGenerator {

    private static int counter = 1001;

    public static String generateEnrollmentId(Course course) {

        String year = String.valueOf(Year.now().getValue());

        return "EDU-" + course.getCourseCode() + "-" + year + "-" + counter++;
    }

}