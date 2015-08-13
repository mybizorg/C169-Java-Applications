/*
 * Student Roster
 * William Roetzheim
 * Created for WGU course c169
 * Class: Roster
 */

//package reference for IDE
package roster;

// Import ArrayList utility to be used later.
import java.util.ArrayList;

// Create Roster Class
public class Roster {
 
    // Define the input string
    static String [] students = {"1,John,Smith,John1989@gmail.com,20,88,79,59", 
        "2,Suzan,Erickson,Erickson_1990@gmailcom,19,91,72,85",
        "3,Jack,Napoli,The_lawyer99yahoo.com,19,85,84,87",
        "4,Erin,Black,Erin.black@comcast.net,22,91,98,82",
        "5,MyFirst,MyLast,email@example.edu,31,91,85,94"};

    // Define the array "student_list" to hold the split up "students" string
    static ArrayList<Student> student_list = new ArrayList<>();
    
    // Main method which will run the program
    public static void main(String[] args) {
        
        // Split the input string by comma and set all the data to 
        // variables to use later.
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

            // use the add method to add a student to the student_list ArrayList
            add(studentID, firstname, lastname, studentEmail, studentAge, grade1, grade2, grade3);
        }
        
        // all of the method calls to generate the output
        horizontal_rule(0,1);
        welcome();
        horizontal_rule(0,1);
        horizontal_rule(0,1);
        //System.out.println("Current Students");
        System.out.println("All Current Students");
        horizontal_rule(1,100);
        print_all();
        horizontal_rule(1,100);
        
        //horizontal_rule(1,34);
        //print_grades();
        //horizontal_rule(1,34);
        System.out.println("Email Validation for Student Emails");
        horizontal_rule(1,58);
        check_for_invalid_emails();
        horizontal_rule(1,58);
        System.out.println("Average Grades for Each Student");
        horizontal_rule(1,39);
        print_average_grades();
        horizontal_rule(1,39);
        System.out.println("Removing Student with Student ID of 3:");
        remove(3);
        horizontal_rule(1,39);
        System.out.println("Removing Student with Student ID of 3:");
        remove(3);
        horizontal_rule(1,39);
    
    } // end the main method
    
    /* 
     * Method to create a horizontal rule
     * parameters:
     *  integer inline = if the line is inline or not
     *  integer times = amount of times the character should be repeated
     * returns a pretty line
     */
    public static void horizontal_rule(int inline, int times) {
        if (inline == 1) {
            for (int i = 0; i <= times; i++) {
                System.out.print("=");   
            }
            System.out.print("\n");
        }
        else {
            System.out.println("=============================");  
        }
    } // end horizontal rule method
    
    // Method to print welcome message
    public static void welcome() {
        System.out.println("Student Roster Program");
        System.out.println("Created for WGU course C169");
        System.out.println("Author: William Roetzheim");
    } // end welcome message method
    
    // Method for adding a student to the ArrayList
    public static void add(
                        int studentID, String firstname, String lastname, 
                        String emailAddress, int studentAge, int grade1, 
                        int grade2, int grade3) 
                        {
        
        Student a_student = new Student (
                                studentID, firstname, lastname, emailAddress, 
                                studentAge, grade1, grade2, grade3)
                                ;
        
        student_list.add(a_student);   
    } // end add student method

    public static void print_average_grades() {
        for (int i = 0; i < student_list.size(); i++) {
            System.out.println(student_list.get(i).get_first_name() + "'s average grade is: " + student_list.get(i).get_average_grades(i));
        }
    } // end print average grades method
    
    // Method to print data for all students
    public static void print_all() {
        for (int i = 0; i < student_list.size(); i++) {
            System.out.println("Student ID: " + 
                student_list.get(i).get_student_id() + "\t First Name: " + 
                student_list.get(i).get_first_name() + "\t Last Name: " +  
                student_list.get(i).get_last_name() +  "\t Age: " + 
                student_list.get(i).get_student_age() + "\t Grades: " + 
                student_list.get(i).get_grades_array() 
                );     
        } 
    } 
    
    // Method to check existing emails for proper formatting
    public static void check_for_invalid_emails() {
        for (int i = 0; i < student_list.size(); i++) {
            String student_email = student_list.get(i).get_student_email();
            
            if (student_email.contains("@") && student_email.contains(".")) {
                if (student_email.contains(" ") ) {
                    System.out.print("***");
                    System.out.println(student_list.get(i).get_first_name()+ "'s email <" + student_list.get(i).get_student_email() + "> address is incorrect.");
                    System.out.print("***");
                }
                System.out.println("Email for " + student_list.get(i).get_first_name() + " <" + student_list.get(i).get_student_email() + "> is correct.");
            }
            else 
                System.out.println(student_list.get(i).get_first_name()+ "'s email <" + student_list.get(i).get_student_email() + "> address is incorrect.");
        }
    }  // end check for invalid emails method

    /*
     * Method for removing a student from the array
     * returns error message if student is not found
     * parameters: studentID
    */
    public static void remove(int studentID) {
        for (int i = 0; i < student_list.size(); i++) {
            if (student_list.get(i).get_student_id() == (studentID)) {
                student_list.remove(i);
                System.out.println("Student " + studentID + " removed.");
                return;
            }   
        }
        System.out.println("Student with ID of " + studentID + " could not be found.");
    } // end remove student method
    
} // end roster class