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

    public void start() {
        // Start function 
        //should guide through what does Student Module do, or help with 
        System.out.println(">> RegistrationManager Management Module <<");
    }
}
