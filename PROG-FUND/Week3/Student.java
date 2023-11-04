//Example of Static Variable
class Student {
  String name;
  int rollno;
  static String CollName = "Georgian college";// static variable

  public static void main(String[] args) {
    Student stu = new Student();

    System.out.println(stu.CollName);
    System.out.println(Student.CollName);// Recommended
    System.out.println(CollName);
  }
}