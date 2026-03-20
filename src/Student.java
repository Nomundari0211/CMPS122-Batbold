public class Student {
    // Property 
    String studentId;
    String name;
    String email; 
    String major; // data type which stores a text, we use doble quatation mark for that " " not ''
    double gpa; // used for storing decimal numbers: (1.0,2.0,2.5,3.2,3.57,4.00)


    // Define Constructor, to assign initial value for those varibles in the class or outside this class
    public Student(String studentId, String name, String email, String major, double gpa){
        this.studentId = studentId;
        this.name = name;
        this.major = major;
        this.email = email;
        this.gpa = gpa;

    }

    public Student(){}

    public String getName(){
        return this.name;
    }

    public static void main(String[] args){

    }


    // properties, empty constructor, void main function
}
