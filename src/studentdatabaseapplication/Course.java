package studentdatabaseapplication;

public class Course {
	
	private String courseCode;
    private String courseName;
    private int courseFee;
    private String duration;

    // Default Constructor
    public Course() {

    }

    // Parameterized Constructor
    public Course(String courseCode, String courseName, int courseFee, String duration) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseFee = courseFee;
        this.duration = duration;
    }

    // Getters
    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseFee() {
        return courseFee;
    }

    public String getDuration() {
        return duration;
    }

    // Setters
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseFee(int courseFee) {
        this.courseFee = courseFee;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    // Display Course Details
    public void displayCourseDetails() {
        System.out.println("\n----------------------------------------");
        System.out.println("Course Code : " + courseCode);
        System.out.println("Course Name : " + courseName);
        System.out.println("Duration    : " + duration);
        System.out.println("Course Fee  : ₹" + courseFee);
        System.out.println("----------------------------------------");
    }

    @Override
    public String toString() {
        return "Course [courseCode=" + courseCode +
                ", courseName=" + courseName +
                ", courseFee=" + courseFee +
                ", duration=" + duration + "]";
    }

}
