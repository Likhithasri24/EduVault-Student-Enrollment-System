package studentdatabaseapplication;

public class FeeManager {

    // Calculate remaining balance
    public static int calculateBalance(int totalFee, int paidAmount) {
        return totalFee - paidAmount;
    }

    // Check payment status
    public static String getPaymentStatus(int balanceAmount) {

        if (balanceAmount == 0) {
            return "Paid";
        } else {
            return "Pending";
        }
    }

    // Validate payment amount
    public static boolean isValidPayment(int totalFee, int paidAmount) {

        if (paidAmount < 0) {
            return false;
        }

        if (paidAmount > totalFee) {
            return false;
        }

        return true;
    }
}