public class financialAid {

    // Properties
    String studentId;
    double aidAmount;
    String aidType; // e.g., "Grant", "Loan", "Scholarship"

    // constructor
    public FinancialAid(String studentId, double aidAmount, String aidType) {
        this.studentId = studentId;
        this.aidAmount = aidAmount;
        this.aidType = aidType;
    }

    public FinancialAid() {
    }

    // getter
    public String getStudentId() {
        return this.studentId;
    }


    public static void main(String[] args) {

    }
}