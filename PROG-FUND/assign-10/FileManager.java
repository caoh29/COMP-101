import java.io.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;

public class FileManager {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int option = 0;

    while (option != 5) {
      System.out.println("===================================");
      System.out.println("Select between the following options");
      System.out.println("===================================");

      System.out.println("1. Create a new file");
      System.out.println("2. Delete a existing file");
      System.out.println("3. Display content of a file");
      System.out.println("4. Append content to an existing file");
      System.out.println("5. Exit");
      System.out.println("===================================");

      option = scanner.nextInt();

      switch (option) {
        case 1:
          System.out.println("Enter the file name");
          String fileNameToCreate = scanner.next();
          try {
            File fileToCreate = new File(fileNameToCreate);
            fileToCreate.createNewFile();
            System.out.println("===================================");
            System.out.println("File " + fileNameToCreate + " was created");
          } catch (Exception e) {
            System.out.println("===================================");
            System.out.println("Invalid name or File already created");
          }
          break;

        case 2:
          System.out.println("Enter the file name");
          String fileNameToDelete = scanner.next();
          try {
            File fileToDelete = new File(fileNameToDelete);
            fileToDelete.delete();
            System.out.println("===================================");
            System.out.println("File " + fileNameToDelete + " was deleted");
          } catch (Exception e) {
            System.out.println("===================================");
            System.out.println("Invalid File");
          }
          break;

        case 3:
          System.out.println("Enter the file name");
          String fileNameToRead = scanner.next();
          try {
            char[] array = new char[100];
            FileReader fileReader = new FileReader(fileNameToRead);
            fileReader.read(array);
            System.out.println("Data in the file:");
            System.out.println("===================================");
            System.out.println(array);
            fileReader.close();
          } catch (Exception e) {
            System.out.println("===================================");
            System.out.println("Error reading file");
          }
          break;

        case 4:
          System.out.println("Enter the file name");
          String fileNameToAppend = scanner.next();
          System.out.println("===================================");
          System.out.println("Enter the content to append");
          String contentToAppend = scanner.next();
          try {
            char[] array = new char[1000];
            FileWriter fileWriter = new FileWriter(fileNameToAppend);

            fileWriter.write(contentToAppend);
            System.out.println("===================================");
            System.out.println("Data was inserted");
            fileWriter.close();
          } catch (Exception e) {
            System.out.println("===================================");
            System.out.println("Invalid file name");
          }
          break;

        case 5:
          break;

        default:
          System.out.println("===================================");
          System.out.println("Invalid option");
          break;
      }
    }
  }
}