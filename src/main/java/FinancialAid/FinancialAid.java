package FinancialAid;
public class FinancialAid {

    // Properties
    String studentId;
    double aidAmount;
    String aidType;

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

    public void  start() {
        System.out.print("Welcome to FinancialAid");
    }
}