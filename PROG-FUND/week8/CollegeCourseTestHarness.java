import java.util.Random;
import java.util.Scanner;

public class CollegeCourseTestHarness {
  public static void main(String[] args) {
    // first row then column
    CollegeCourse[][] arr = new CollegeCourse[200][10];

    Random random = new Random();

    int[] courseNumberList = { 45209, 36970, 56258, 29136 };

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 200; j++) {
        if (j < 100) {
          arr[j][i] = new CollegeCourse();
        } else {
          arr[j][i] = new CollegeCourse(9999, 9999);
        }
        System.out.println("For row " + j + " and column " + i + " the courseReferenceNumber is "
            + arr[j][i].getCourseReferenceNumber() + " and the courseNumber is " + arr[j][i].getCourseNumber());
        System.out
            .println("-------------------------------------------------------------------------------------------");
      }

    }

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 200; j++) {
        int min = 1000000; // Smallest 7-digit number
        int max = 9999999; // Largest 7-digit number
        int randomCourseReferenceNumber = random.nextInt(max - min + 1) + min;
        arr[j][i].setCourseReferenceNumber(randomCourseReferenceNumber);

        int randomIndex = random.nextInt(courseNumberList.length);
        int randomCourseNumber = courseNumberList[randomIndex];
        arr[j][i].setCourseNumber(randomCourseNumber);

        System.out.println("For row " + j + " and column " + i + " the courseReferenceNumber is "
            + arr[j][i].getCourseReferenceNumber() + " and the courseNumber is " +
            arr[j][i].getCourseNumber());
        System.out
            .println("-------------------------------------------------------------------------------------------");
      }
    }

    Scanner scanner = new Scanner(System.in);
    while (true) {
      try {
        System.out.println("Enter a column number: ");
        int column = scanner.nextInt();
        System.out.println("Enter a row number: ");
        int row = scanner.nextInt();
        System.out
            .println("-------------------------------------------------------------------------------------------");
        System.out.println("For row " + row + " and column " + column + " the courseReferenceNumber is "
            + arr[row][column].getCourseReferenceNumber() + " and the courseNumber is " +
            arr[row][column].getCourseNumber());
        System.out
            .println("-------------------------------------------------------------------------------------------");
        break;
      } catch (Exception e) {
        System.out.println("The row or column provided is out of bound");
        System.out.println("Enter a column number from 0 to 9 AND a row number from 0 to 199");
        System.out
            .println("-------------------------------------------------------------------------------------------");
        System.out.println(e.getMessage());
        System.out
            .println("-------------------------------------------------------------------------------------------");
      }
    }
    scanner.close();
  }
}
