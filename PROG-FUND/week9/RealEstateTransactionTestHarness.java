import java.util.Scanner;

public class RealEstateTransactionTestHarness {

  public static void main(String[] args) {
    // Instantiate RealEstateTransaction with sample data
    RealEstateTransaction transaction = new RealEstateTransaction("123 Main St.", "New York", "NY", "100000");

    // Test Method 1
    System.out.println("Test Method 1:");
    System.out.println(transaction);

    // Test Method 2
    System.out.println("\nTest Method 2:");
    System.out.println(transaction.generateSubstring());

    // Test Method 3
    System.out.println("\nTest Method 3:");
    Scanner scanner = new Scanner(System.in);
    int keyIndex, startIndex;

    do {
      // Get user input for keyIndex and startIndex
      System.out.print("Enter keyIndex (less than length): ");
      keyIndex = scanner.nextInt();
      System.out.print("Enter startIndex (less than length): ");
      startIndex = scanner.nextInt();

      // Check if the entered indices are valid
      if (keyIndex >= transaction.toString().length() || startIndex >= transaction.toString().length()
          || keyIndex >= startIndex) {
        System.out.println("Invalid indices. Please enter valid indices.");
      } else {
        break; // Valid indices, exit the loop
      }
    } while (true);

    // Test Method 3 with valid inputs
    String encryptedResult = transaction.encryptString(keyIndex, startIndex);
    System.out.println("Encrypted String: " + encryptedResult);

    // Close the scanner
    scanner.close();
  }
}
