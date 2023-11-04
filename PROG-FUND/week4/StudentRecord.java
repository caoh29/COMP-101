// The purpose of this class is to create a blueprint for all records regarding students enrolled in a course

class StudentRecord {
  // Defines the state of each object created using the StudentRecord class
  private String firstName;
  private String lastName;
  private long studentID;
  private int gradeCourseOne;

  // Constructors are in charge of initialize each object from a class
  StudentRecord() {
    // Default constructor which takes no parameters and assign a default value to
    // each attribute
    this.firstName = "";
    this.lastName = "";
    this.studentID = 0;
    this.gradeCourseOne = 0;
  }

  // Constructor which takes parameters and assign them to each attribute
  StudentRecord(String firstName, String lastName, long studentID, int gradeCourseOne) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.studentID = studentID;
    this.gradeCourseOne = gradeCourseOne;
  }

  // Methods are in charge of performing actions on each object created using the
  // StudentRecord class

  // Getters and Setter for each attribute
  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public long getStudentID() {
    return studentID;
  }

  public int getGradeCourseOne() {
    return gradeCourseOne;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setStudentID(long studentID) {
    this.studentID = studentID;
  }

  public void setGradeCourseOne(int gradeCourseOne) {
    this.gradeCourseOne = gradeCourseOne;
  }

  // Method which returns the letter grade of the course depending on the
  // gradeCourseOne range
  public char getGradeCourseOneLetter() {
    // if grade is more or equal to 90 return A
    if (this.gradeCourseOne >= 90)
      return 'A';
    // if grade is more or equal to 80 return B
    else if (this.gradeCourseOne >= 80)
      return 'B';
    // if grade is more or equal to 70 return C
    else if (this.gradeCourseOne >= 70)
      return 'C';
    // if grade is more or equal to 60 return D
    else if (this.gradeCourseOne >= 60)
      return 'D';
    // if grade is more or equal to 50 return E
    else if (this.gradeCourseOne >= 50)
      return 'E';
    else
      // if no conditions are met return F
      return 'F';
  }

  // Method which returns the number of voews that are present
  // in student's first name if it is 5 letters long
  public int getVoewsInFirstName() {
    // Initialize a counter variable with value 0
    int count = 0;
    // If student's first name has 5 letters
    if (this.firstName.length() == 5) {
      // Iterate through each letter of the first name
      for (int i = 0; i < this.firstName.length(); i++) {
        char letter = this.firstName.charAt(i);
        // If the letter is a vowel, increment the counter variable by 1
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
          count++;
        }
      }
    }
    return count;
  }
}