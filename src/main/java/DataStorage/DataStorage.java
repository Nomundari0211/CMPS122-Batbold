package DataStorage;

import Student.Student;

public class DataStorage {

     final int MAX_SIZE = 100;

     Student[] studentArray;
    //  Course[] courseArray;

     int studentCount;
     int courseCount;

    // Constructor
    public DataStorage() {
        studentArray = new Student[MAX_SIZE];
        // courseArray = new Course[MAX_SIZE];
        studentCount = 0;
        courseCount = 0;
    }
    // Add Student
    public void addStudent(Student newStudent) {
        if (studentCount < MAX_SIZE) {
            studentArray[studentCount] = newStudent;
            studentCount++;
            System.out.println("Student added successfully!");
        } else {
            System.out.println("Student storage is full!");
        }
    }
    // Add Course
    // public void addCourse(Course newCourse) {
    //     if (courseCount < MAX_SIZE) {
    //         courseArray[courseCount] = newCourse;
    //         courseCount++;
    //         System.out.println("Course added successfully!");
    //     } else {
    //         System.out.println("Course storage is full!");
    //     }
    // }
    // Get all students
    public Student[] getAllStudents() {
        return studentArray;
    }

    // Get student by index
    public Student getStudentByIndex(int index) {
        if (index >= 0 && index < studentCount) {
            return studentArray[index];
        } else {
            return null;
        }
    }

    // Get all courses
    // public Course[] getAllCourses() {
    //     return courseArray;
    // }

    // Get course by index
    // public Course getCourseByIndex(int index) {
    //     if (index >= 0 && index < courseCount) {
    //         return courseArray[index];
    //     } else {
    //         return null;
    //     }
    // }

    // Getters
    public int getStudentCount() {
        return studentCount;
    }

    public int getCourseCount() {
        return courseCount;
    }
}