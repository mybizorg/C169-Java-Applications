/*
 * Student Roster
 * William Roetzheim
 */
package roster;

//Imprt ArrayList to be used later.
import java.util.ArrayList;

public class Roster {
 
    public static void main(String[] args) {
        //Define the input string
        String [] students = {"1,John,Smith,John1989@gmail.com,20,88,79,59", 
            "2,Suzan,Erickson,Erickson_1990@gmailcom,19,91,72,85",
            "3,Jack,Napoli,The_lawyer99yahoo.com,19,85,84,87",
            "4,Erin,Black,Erin.black@comcast.net,22,91,98,82",
            "5,MyFirstName,MyLastName,myemail@address.com,31,1,2,3"};
        
        System.out.println(students.length);
        
        //Define the array "student_list" to hold the split up "students" string
        ArrayList<Student> student_list = new ArrayList<>();
        
        for (int i = 0; i <students.length; i++) {
            String[] a_student = students[i].split(",");
            
            String id = a_student[0];
            String firstname = a_student[1];
            String lastname = a_student[2];
            String email = a_student[3];
            int age = Integer.parseInt(a_student[4]);
            int grade1 = Integer.parseInt(a_student[5]);
            int grade2 = Integer.parseInt(a_student[6]);
            int grade3 = Integer.parseInt(a_student[7]);
            
            Student a_new_student = new Student(id, firstname, lastname, email, age, grade1, grade2, grade3 );
            
            student_list.add(a_new_student);
        }
        
        for (Student student : student_list) {
            System.out.println(student); 
        }

    }
    
    //Roster method
    public Roster() {

        
        

        ArrayList<Integer> integer_list = new ArrayList<>(0);

        integer_list.add(20);
        integer_list.add(30);
        integer_list.add(49);

        //Set an elements value in the ArrayList: integer_list
        integer_list.set(2, 50);

        //Count all of the elements in the ArrayList: integer_list
        int count = integer_list.size();
        System.out.println("Count: " + count);

        //Loop through all elements in the ArrayList: integer_list
        for (int i = 0; i < integer_list.size(); i++) {
            int value = integer_list.get(i);
            System.out.println("Integer List Item: " + value);
        }
    }  

} //end roster class

//Create the Student class
class Student {
    //id, firstname, lastname and email are all strings
    String id;	
    String firstname;
    String lastname;
    String email;
    //age, grade1, grade2 and grade3 are integers
    int age;
    int grade1;
    int grade2;
    int grade3;
    
    public Student(String id, String firstname, String lastname, String email, int age, int grade1, int grade2, int grade3) {
    
    }
} //end student class