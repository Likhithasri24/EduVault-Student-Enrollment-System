package studentdatabaseapplication;

public class Student {

	private String enrollmentId;
    private String fullName;
    private String qualification;
    private Course course;

    private int totalFee;
    private int paidAmount;
    private int balanceAmount;

    private String paymentStatus;
    private String enrollmentStatus;
    private String enrollmentDate;

    // Default Constructor
    public Student() {

    }

    // Parameterized Constructor
    public Student(String enrollmentId, String fullName, String qualification,
                   Course course, int totalFee, int paidAmount,
                   int balanceAmount, String paymentStatus,
                   String enrollmentStatus, String enrollmentDate) {

        this.enrollmentId = enrollmentId;
        this.fullName = fullName;
        this.qualification = qualification;
        this.course = course;
        this.totalFee = totalFee;
        this.paidAmount = paidAmount;
        this.balanceAmount = balanceAmount;
        this.paymentStatus = paymentStatus;
        this.enrollmentStatus = enrollmentStatus;
        this.enrollmentDate = enrollmentDate;
    }

    // Getters

    public String getEnrollmentId() {
        return enrollmentId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getQualification() {
        return qualification;
    }

    public Course getCourse() {
        return course;
    }

    public int getTotalFee() {
        return totalFee;
    }

    public int getPaidAmount() {
        return paidAmount;
    }

    public int getBalanceAmount() {
        return balanceAmount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public String getEnrollmentStatus() {
        return enrollmentStatus;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    // Setters

    public void setEnrollmentId(String enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setTotalFee(int totalFee) {
        this.totalFee = totalFee;
    }

    public void setPaidAmount(int paidAmount) {
        this.paidAmount = paidAmount;
    }

    public void setBalanceAmount(int balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public void setEnrollmentStatus(String enrollmentStatus) {
        this.enrollmentStatus = enrollmentStatus;
    }

    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    // Display Student Details

    public void displayStudentDetails() {

//        System.out.println("\n==============================================");
//        System.out.println("            STUDENT DETAILS");
//        System.out.println("==============================================");

        System.out.println("Enrollment ID     : " + enrollmentId);
        System.out.println("Student Name      : " + fullName);
        System.out.println("Qualification     : " + qualification);
        System.out.println("Course            : " + course.getCourseName());
        System.out.println("Course Duration   : " + course.getDuration());
        System.out.println("Course Fee        : ₹" + totalFee);
        System.out.println("Paid Amount       : ₹" + paidAmount);
        System.out.println("Balance Amount    : ₹" + balanceAmount);
        System.out.println("Payment Status    : " + paymentStatus);
        System.out.println("Enrollment Status : " + enrollmentStatus);
        System.out.println("Enrollment Date   : " + enrollmentDate);

        System.out.println("==============================================");
    }

    @Override
    public String toString() {
        return "Student [enrollmentId=" + enrollmentId +
                ", fullName=" + fullName +
                ", qualification=" + qualification +
                ", course=" + course.getCourseName() +
                ", totalFee=" + totalFee +
                ", paidAmount=" + paidAmount +
                ", balanceAmount=" + balanceAmount +
                ", paymentStatus=" + paymentStatus +
                ", enrollmentStatus=" + enrollmentStatus +
                ", enrollmentDate=" + enrollmentDate + "]";
    }
}
