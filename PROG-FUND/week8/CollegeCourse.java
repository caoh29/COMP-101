class CollegeCourse {
  // States
  private int courseReferenceNumber;
  private int courseNumber;

  // Constructors
  CollegeCourse() {
    this.courseReferenceNumber = 0;
    this.courseNumber = 0;
  }

  CollegeCourse(int courseReferenceNumber, int courseNumber) {
    this.courseReferenceNumber = courseReferenceNumber;
    this.courseNumber = courseNumber;
  }

  // Behaviors
  public int getCourseReferenceNumber() {
    return this.courseReferenceNumber;
  }

  public int getCourseNumber() {
    return this.courseNumber;
  }

  public void setCourseReferenceNumber(int courseReferenceNumber) {
    this.courseReferenceNumber = courseReferenceNumber;
  }

  public void setCourseNumber(int courseNumber) {
    this.courseNumber = courseNumber;
  }
}