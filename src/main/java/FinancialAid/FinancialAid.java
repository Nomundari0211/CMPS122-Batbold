package FinancialAid;
public class FinancialAid {

    // Properties
    private String studentId;
    private double aidAmount;
    private String aidType;

    // Constructors
    public FinancialAid(String studentId, double aidAmount, String aidType) {
        this.studentId = studentId;
        this.aidAmount = aidAmount;
        this.aidType = aidType;
    }

    public FinancialAid() {
    }

    // Getters
    public String getStudentId() {
        return this.studentId;
    }

    public double getAidAmount() {

        return this.aidAmount;
    }

    public String getAidType() {

        return this.aidType;
    }

    // Setters
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setAidAmount(double aidAmount) {
        if (aidAmount < 0) {
            System.out.println("Aid amount cannot be negative");
        }
        else {
            this.aidAmount = aidAmount;
        }
    }

    public void setAidType(String aidType) {
        this.aidType = aidType;
    }

    // determining financial aid using student's GPA and household income

    public boolean applyForAid(double gpa, double income) {
        if (gpa <= 0 || income < 0) {
            System.out.println("Invalid GPA or income value!");
            return false;
        }

        if (gpa >= 3.8 && income < 20000) {
            this.aidType = "Full Scholarship";
            this.aidAmount = 20000.00;
        } else if (gpa >= 2.5 && income < 50000) {
            this.aidType = "Partial Grant";
            this.aidAmount = 8000.00;
        } else if (income < 20000) {
            this.aidType = "Need-Based Aid";
            this.aidAmount = 10000.00;
        } else {
            System.out.println("Student " + "("+studentId+")"+ " does not qualify for aid.");
            return false;
        }

        System.out.println("Aid approved for student " + "("+studentId+")" +
                "= " + aidType + " ($" + aidAmount + ")");
        return true;
    }

    public void start() {
        System.out.println("Welcome to FinancialAid");
    }

    public static void main(String[] args) {
        FinancialAid student = new FinancialAid();
        student.setStudentId("201245");
        student.start();
        student.applyForAid(3.6, 25000);
    }
}