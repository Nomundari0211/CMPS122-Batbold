package Intstructor;

public class Instructor {
    private String instructorId;
    private String name;
    private String department;
    private String[] coursesTaught;
    private int courseCount;
    private int maxCourses;


    public Instructor(String instructorId, String name, String department) {
        this.instructorId = instructorId;
        this.name = name;
        this.department = department;
        this.coursesTaught = new String[5];
        this.courseCount = 0;
        this.maxCourses = 5;
    }

    String getInstructorId() {
        return instructorId;
    }

    String getName() {
        return name;
    }

    String getDepartment() {
        return department;
    }

    void setDepartment(String d) {
        this.department = d;
    }

    boolean assignCourse(String courseId) {
        if (isAvailable()) {
            coursesTaught[courseCount] = courseId;
            courseCount++;
            return true;
        }
        return false;
    }

    int getCourseCount() {
        return courseCount;
    }

    boolean isAvailable() {
        return courseCount < maxCourses;
    }

    void displayProfile() {
        System.out.println("Instructor ID: " + instructorId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Courses Assigned: " + courseCount);
        for (int i = 0; i < courseCount; i++) {
            System.out.println(" - " + coursesTaught[i]);
        }
    }

    public void startS() {
        System.out.println("Welcome to Instructor Module!");
    }

}
