// The purpose of this class is to test the StudentRecord class by using a main method.

import java.util.Scanner;

public class StudentRecordTestHarness {
  public static void main(String[] args) {

    // Creates a new object called student1 using the constructor with parameters,
    // by providing the values for the attributes
    StudentRecord student1 = new StudentRecord("John", "Doe", 123456789, 78);

    // Prints in the console the value for each attribute from student1 object
    System.out.println("Student first name: " + student1.getFirstName());
    System.out.println("Student last name: " + student1.getLastName());
    System.out.println("Student ID: " + student1.getStudentID());
    System.out.println("Student grade course: " + student1.getGradeCourseOne());
    System.out.println("Student grade course letter: " + student1.getGradeCourseOneLetter());

    // prints a line to differenciate between student 1 data and student 2
    System.out.println("-------------------------------------");

    // Creates a new object called student2 using the constructor without parameters
    StudentRecord student2 = new StudentRecord();

    // creates an instance from the Scanner class to read the user input from the
    // console
    // and sets the values for the attributes of the student2 object, by using the
    // set methods.
    Scanner scanner = new Scanner(System.in);

    // Prompts the user for an input in this case the first name which is a String
    // thats why nextLine method is used
    System.out.println("Enter the student's first name: ");
    student2.setFirstName(scanner.nextLine());

    // Prompts the user for an input in this case the last name which is a String
    // thats why nextLine method is used
    System.out.println("Enter the student's last name: ");
    student2.setLastName(scanner.nextLine());

    // Prompts the user for an input in this case the ID which is a long thats why
    // nextLong method is used
    System.out.println("Enter the student's ID: ");
    student2.setStudentID(scanner.nextLong());

    // Prompts the user for an input in this case the grade which is a integer thats
    // why nextInt method is used
    System.out.println("Enter the student's course grade: ");
    student2.setGradeCourseOne(scanner.nextInt());

    // Close the scanner and prints a line to differenciate the data
    scanner.close();
    System.out.println("-------------------------------------");

    // Prints in the console the value for each attribute from student2 object
    System.out.println("Student first name: " + student2.getFirstName());
    System.out.println("Student last name: " + student2.getLastName());
    System.out.println("Student ID: " + student2.getStudentID());
    System.out.println("Student grade course: " + student2.getGradeCourseOne());

    // Creates a new variable which stores the number of voews in student's first
    // name to a String and prints it to the console
    String voewsIntegerToString = String.valueOf(student2.getVoewsInFirstName());
    System.out.println("The number of voews in student's first name is: " + voewsIntegerToString);
  }
}
