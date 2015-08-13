/*
 * Student Roster
 * William Roetzheim
 * Created for WGU course c169
 * Class: Student
 */

//package reference for IDE
package roster;

// Import Arrays utility to be used later.
import java.util.Arrays;

// Create the Student Class
public class Student {
    
    // firstname, lastname and emailAddress are all strings
    private String firstname;
    private String lastname;
    private String studentEmail;
    
    // studentID, studentAge, grade1, grade2 and grade3 are integers
    private int studentID;
    private int studentAge;
    private int grade1;
    private int grade2;
    private int grade3;
    
    // add an array to hold the grades
    private int[] grade_list;
    
    /* 
     * Define the Student method with the arguements of all the attributes
     * used to create a new student
     * parameters: 
     *   studentID, firstname, lastname, studentEmail 
     *   studentAge, grade1, grade2, grade3
    */
    public Student(int studentID, String firstname, String lastname, String studentEmail, int studentAge, int grade1, int grade2, int grade3) {
        
        // assign the values passed in to the attributes
        set_student_id(studentID);
        set_first_name(firstname);
        set_last_name(lastname);
        set_student_email(studentEmail);
        set_student_age(studentAge);
        set_grades_array(grade1, grade2, grade3);
        set_grades_int(grade1, grade2, grade3);

    }
    
    // Return the studentID
    public int get_student_id() {
        return studentID;
    }
    
    // Set the student id
    private void set_student_id(int studentID) {
        this.studentID = studentID;
    }
    
    // Return the firstname
    public String get_first_name() {
        return firstname;
    } 
    
    // Set the first name
    private void set_first_name(String firstname) {
        this.firstname = firstname;
    }
    
    // Return the lastname
    public String get_last_name() {
        return lastname;
    }
    
    // Set the last name
    private void set_last_name(String lastname) {
        this.lastname = lastname;
    }
    
    // Return the studentEmail
    public String get_student_email() {
        return studentEmail;
    }
    
    // Set the student email
    private void set_student_email(String studentEmail) {
        this.studentEmail = studentEmail;
    }
    
    // Set the student age
    public int get_student_age() {
        return studentAge;
    }
    
    // Return the studentAge
    private void set_student_age(int studentAge) {
        this.studentAge = studentAge;
    }
    
    // Return the student's grades as an Array
    public String get_grades_array() {
        return Arrays.toString(grade_list);
    }
    
    // Set the grades as an Array
    private void set_grades_array(int grade1, int grade2, int grade3) {
        grade_list = new int[] { grade1, grade2, grade3 };
    }
    
    // Return the grades as individual integers added together
    public int get_grades_int() {
        return grade1 + grade2 + grade3;
    }
    
    // Set the grades as individual integers
    private void set_grades_int(int grade1, int grade2, int grade3) {
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }
    
    // Method for getting grades of each student by studentID
    public int get_average_grades(int studentID) {
        return get_grades_int() / 3;
    } 
    
} // end student class