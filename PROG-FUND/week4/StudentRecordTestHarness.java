// The purpose of this class is to test the StudentRecord class by using a main method.

public class StudentRecordTestHarness {
  public static void main(String[] args) {
    StudentRecord student1 = new StudentRecord("John", "Doe", 123456789, 78);

    System.out.println("Student first name: " + student1.getFirstName());
    System.out.println("Student last name: " + student1.getLastName());
    System.out.println("Student ID: " + student1.getStudentID());
    System.out.println("Student grade course: " + student1.getGradeCourseOne());
    System.out.println("Student grade course letter: " + student1.getGradeCourseOneLetter());
    student1.getVoewsInFirstName();
  }
}
