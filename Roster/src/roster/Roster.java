/*
 * Student Roster
 * William Roetzheim
 */
package roster;

//Imprt ArrayList to be used later.
import java.util.ArrayList;

public class Roster {
 
    //Define the input string
    static String [] students = {"1,John,Smith,John1989@gmail.com,20,88,79,59", 
        "2,Suzan,Erickson,Erickson_1990@gmailcom,19,91,72,85",
        "3,Jack,Napoli,The_lawyer99yahoo.com,19,85,84,87",
        "4,Erin,Black,Erin.black@comcast.net,22,91,98,82",
        "5,MyFirstName,MyLastName,myemail@address.com,31,1,2,3"};

    //Define the array "student_list" to hold the split up "students" string
    static ArrayList<Student> student_list = new ArrayList<>();
    
    public static void main(String[] args) {
       
        for (int i = 0; i <students.length; i++) {
            String[] a_student = students[i].split(",");

            int studentID = Integer.parseInt(a_student[0]);
            String firstname = a_student[1];
            String lastname = a_student[2];
            String studentEmail = a_student[3];
            int studentAge = Integer.parseInt(a_student[4]);
            int grade1 = Integer.parseInt(a_student[5]);
            int grade2 = Integer.parseInt(a_student[6]);
            int grade3 = Integer.parseInt(a_student[7]);

            Student a_new_student = new Student(studentID, firstname, lastname, studentEmail, studentAge, grade1, grade2, grade3 );

            student_list.add(a_new_student);
        }

        print_all();
        remove(3);
    }

    
    public static void print_all() {
        for (Student student : student_list) {
            System.out.println(student);
        }
    }
    
    public static void add(int studentID, String firstname, String lastname, String emailAddress, int studentAge, int grade1, int grade2, int grade3) {
    
        Student a_student = new Student (studentID, firstname, lastname, emailAddress, studentAge, grade1, grade2, grade3);
        
        student_list.add(a_student);   
    }
    
    public static void remove(int studentID) {
        for (int i = 0; i < student_list.size(); i++) {
            if (student_list.get(i).getStudentID() == (studentID)) {
                student_list.remove(i);
                System.out.println("Removing student: " + studentID);
                return;
            }   
        }
        System.out.println("Student with ID of " + studentID + " could not be found.");
    }
    

} //end roster class

//Create the Student class
class Student {
    
    //id, firstname, lastname and email are all strings
    int studentID;	
    String firstname;
    String lastname;
    String studentEmail;
    
    //age, grade1, grade2 and grade3 are integers
    int studentAge;
    ArrayList<Integer> grade_list = new ArrayList<>();
    int grade1;
    int grade2;
    int grade3;
    
    //Define the Student method with the arguements of all the attributes
    public Student(int studentID, String firstname, String lastname, String studentEmail, int studentAge, int grade1, int grade2, int grade3) {
        
        //assign the values passed in to the attributes
        this.studentID = studentID;
        this.firstname = firstname;
        this.lastname = lastname;
        this.studentEmail = studentEmail;

        this.studentAge = studentAge;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }
    
    public int getStudentID() {
        return studentID;
    }
    
    //We need to define the toString method so when we print
    //the object, it doesn't return an object but rather
    //the desired attributes of the object. 
    @Override
    public String toString() {
 
        return "Student ID: " + studentID + ". First Name: " + firstname + ". Last Name: " +  lastname +  ". Age: " + studentAge + ". Grades: (" + grade1 + " " + grade2 + " " + grade3 + ").";
    }
    
} //end student class