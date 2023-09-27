// The purpose of this class is to test the StudentRecord class by using a main method.

import java.util.Scanner;

public class StudentRecordTestHarness2 {
  public static void main(String[] args) {
    StudentRecord student2 = new StudentRecord();

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the student's first name: ");
    student2.setFirstName(scanner.nextLine());

    System.out.println("Enter the student's last name: ");
    student2.setLastName(scanner.nextLine());

    System.out.println("Enter the student's ID: ");
    student2.setStudentID(scanner.nextLong());

    System.out.println("Enter the student's course grade: ");
    student2.setGradeCourseOne(scanner.nextInt());

    scanner.close();

    System.out.println("-------------------------------------");
    System.out.println("Student first name: " + student2.getFirstName());
    System.out.println("Student last name: " + student2.getLastName());
    System.out.println("Student ID: " + student2.getStudentID());
    System.out.println("Student grade course: " + student2.getGradeCourseOne());
    System.out.println("Student grade course letter: " + student2.getGradeCourseOneLetter());
    student2.getVoewsInFirstName();
  }
}
