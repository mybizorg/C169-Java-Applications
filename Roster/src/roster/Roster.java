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
        
        for (int i = 0; i <students.length; i++) {
            String a_student = students[i];
            System.out.println(a_student);
        }
        //Run the roster method code
        new Roster();
    }
    
    //Roster method
    public Roster() {

        //Define the array "student_list" to hold the split up "students" string
        ArrayList<Student> student_list = new ArrayList<>();

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
}

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
}