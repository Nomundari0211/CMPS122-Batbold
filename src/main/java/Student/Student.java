/**
 * Student class represents a student with basic attributes.
 * This class is designed based on Lab01 requirements:
 * name, age, GPA, and student status.
 */
public class Student {

    // Instance variables (attributes of a student)
    private String name;
    private int age;
    private double gpa;
    private boolean isStudent;

    /**
     * Default constructor
     * Initializes a student with default values
     */
    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.gpa = 0.0;
        this.isStudent = false;
    }

    /**
     * Parameterized constructor
     * Allows creating a student with specific values
     */
    public Student(String name, int age, double gpa, boolean isStudent) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isStudent = isStudent;
    }

    // Getter methods (used to access private variables)

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isStudent() {
        return isStudent;
    }

    // Setter methods (used to modify values)

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setStudentStatus(boolean isStudent) {
        this.isStudent = isStudent;
    }

    /**
     * This method prints student information in a clean format
     */
    public void printStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Student Status: " + isStudent);
    }
}