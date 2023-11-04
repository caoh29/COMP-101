//Example of Constructor

class studentConstr {

  String name;
  int rollno;

  public studentConstr(String name, int rollno) {
    this.name = name;
    this.rollno = rollno;
  }

  public static void main(String[] args) {
    studentConstr s1 = new studentConstr("Krish", 101);
    System.out.println(s1.name);
    System.out.println(s1.rollno);

    studentConstr s2 = new studentConstr("Madhur", 102);
    System.out.println(s2.name);
    System.out.println(s2.rollno);

  }
}
