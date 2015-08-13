/*
 * Student Roster
 * William Roetzheim
 */
package roster;

//Imprt ArrayList to be used later.
import java.util.ArrayList;
import java.util.Arrays;

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

            //Student a_new_student = new Student(studentID, firstname, lastname, studentEmail, studentAge, grade1, grade2, grade3);
            
            //use the add method to add a student to the student_list ArrayList
            add_student(studentID, firstname, lastname, studentEmail, studentAge, grade1, grade2, grade3);
        }
        horizontal_rule(0,1);
        welcome();
        horizontal_rule(0,1);
        horizontal_rule(0,1);
        System.out.println("Current Students");
        horizontal_rule(1,100);
        print_all();
        horizontal_rule(1,100);
        System.out.println("Removing Student with Student ID of 3:");
        remove_student(3);
        horizontal_rule(1,39);
        System.out.println("Removing Student with Student ID of 8:");
        remove_student(8);
        horizontal_rule(1,39);
        System.out.println("Removing Student with Student ID of 3:");
        remove_student(3);
        horizontal_rule(1,39);
        System.out.println("All Student Grades");
        horizontal_rule(1,30);
        print_grades();
        horizontal_rule(1,30);
        System.out.println("Average Grades for Each Student");
        horizontal_rule(1,30);
        print_average_grades();
        horizontal_rule(1,43);
        System.out.println("Email Validation for Student Emails");
        horizontal_rule(1,43);
        check_for_invalid_emails();
        
    }
    
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
        
    }
    
    public static void welcome() {
        System.out.println("Student Roster Program");
        System.out.println("Created for WGU course C169");
        System.out.println("Author: William Roetzheim");
        
    }
    
    //Method for adding a student to the array
    public static void add_student(int studentID, String firstname, String lastname, String emailAddress, int studentAge, int grade1, int grade2, int grade3) {
        
        Student a_student = new Student (studentID, firstname, lastname, emailAddress, studentAge, grade1, grade2, grade3);
        
        student_list.add(a_student);   
    }

    //Method to print all attributes for all students
    public static void print_all() {
        for (Student student : student_list) {
            System.out.println(student);
        }
    }
    
    public static void print_average_grades() {
        for (int i = 0; i < student_list.size(); i++) {
            System.out.println(student_list.get(i).get_first_name() + "'s average grade is: " + student_list.get(i).get_grades_int() / 3);
        }
    }
    
    //Method to print grades for all students
    public static void print_grades() {
        for (int i = 0; i < student_list.size(); i++) {
            System.out.println(student_list.get(i).get_first_name() + "'s grades are: " + student_list.get(i).get_grades_array());
        }
    }
    
    public static void check_for_invalid_emails() {
        for (int i = 0; i < student_list.size(); i++) {
            String student_email = student_list.get(i).get_student_email();
            
            if (student_email.contains("@") && student_email.contains(".")) {
                if (student_email.contains(" ") ) {
                    System.out.print("***");
                    System.out.println(student_list.get(i).get_first_name()+ "'s email <" + student_list.get(i).get_student_email() + "> address is incorrect");
                    System.out.print("***");
                }
                
                System.out.println("Email for " + student_list.get(i).get_first_name() + " <" + student_list.get(i).get_student_email() + "> is correct.");
            }
            
            else 
                System.out.println(student_list.get(i).get_first_name()+ "'s email <" + student_list.get(i).get_student_email() + "> address is incorrect");
        }
    }

    
    
    //Method for removing a student from the array
    //returns error message if student is not found
    //parameters: studentID
    public static void remove_student(int studentID) {
        for (int i = 0; i < student_list.size(); i++) {
            if (student_list.get(i).get_student_id() == (studentID)) {
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
    
    //firstname, lastname and emailAddress are all strings
    	
    String firstname;
    String lastname;
    String studentEmail;
    
    //studentID, studentAge, grade1, grade2 and grade3 are integers
    int studentID;
    int studentAge;
    int grade1;
    int grade2;
    int grade3;
    
    //Storing the grades in an array
    int[] grade_list;
    
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
        
        //Add the individual grades to an ArrayList
//        grade_list[0] = grade1;
//        grade_list[1] = grade2;
//        grade_list[2] = grade3;
        grade_list = new int[] { grade1, grade2, grade3 };
    }
    
    //Return the studentID
    public int get_student_id() {
        return studentID;
    }
    
    public void set_student_id(int studentID) {
        this.studentID = studentID;
    }
    
    //Return the firstname
    public String get_first_name() {
        return firstname;
    } 
    
    public void set_first_name(String firstname) {
        this.firstname = firstname;
    }
    
    //Return the lastname
    public String get_last_name() {
        return lastname;
    }
    
    public void set_last_name(String lastname) {
        this.lastname = lastname;
    }
    
    //Return the studentEmail
    public String get_student_email() {
        return studentEmail;
    }
    
    public void set_student_email(String studentEmail) {
        this.studentEmail = studentEmail;
    }
    
    //Return the student's grades as an ArrayList
    public String get_grades_array() {
        return Arrays.toString(grade_list);
    }
    
    public void set_grades_array(int grade1, int grade2, int grade3) {
        grade_list[0] = grade1;
        grade_list[1] = grade2;
        grade_list[2] = grade3;
    }
    
    //Return the grades as individual integers
    public int get_grades_int() {
        return grade1 + grade2 + grade3;
    }
    
    public void set_grades_int(int grade1, int grade2, int grade3) {
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }
    
    //We need to define the toString method so when we print
    //the object, it doesn't return an object but rather
    //the desired attributes of the object. 
    @Override
    public String toString() {
 
        return "Student ID: " + studentID + "\t First Name: " + firstname + "\t Last Name: " +  lastname +  "\t Age: " + studentAge + "\t Grades: " + Arrays.toString(grade_list)  ;
    }
    
} //end student class