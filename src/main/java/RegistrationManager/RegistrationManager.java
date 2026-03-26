package RegistrationManager;

import java.util.ArrayList;
public class RegistrationManager {
    ArrayList<String> registrations; 
    ArrayList<String> studentList;
    ArrayList<String> courseList; 

    public RegistrationManager () {
        registrations = new ArrayList<>();
        studentList = new ArrayList<>();
        courseList = new ArrayList<>();   
    }
    public RegistrationManager ( ArrayList<String> registrations, ArrayList<String> studentList, ArrayList<String> courseList ) {
        this.registrations = registrations;
        this.studentList = studentList;
        this.courseList = courseList;   
    }

    public static void main(String[] args) {
        System.out.println("this is the RegistrationManager class");
        
    }
}
