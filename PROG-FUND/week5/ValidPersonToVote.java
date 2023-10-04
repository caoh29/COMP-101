// Camilo Ordonez
// 200565871

// Week 5 Assignment

// This program prompts the user for the age of a person and then checks if the
// age entered is valid to vote or not.

// Imports the library Scanner to prompt the user for input
import java.util.Scanner;

public class ValidPersonToVote {
  // Attributes
  private int age;

  // Constructor
  ValidPersonToVote(int age) {
    this.age = age;
  }

  // Methods
  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  // Check if the age from the person object is equal or above 18 is so returns
  // True
  // otherwise returns false
  public boolean isEligible() {
    return this.age >= 18;
  }

  public static void main(String[] args) {
    // Creates a new object from the class Scanner with the name scanner
    Scanner scanner = new Scanner(System.in);

    // Prints into the console the following text
    System.out.println("Enter your age: ");
    // Wait for the user input to assign the value to and age variable
    int age = scanner.nextInt();

    // Closes the scanner object
    scanner.close();

    // Creates a new object (instance) of the ValidPersonToVote Class
    ValidPersonToVote person = new ValidPersonToVote(age);

    // Checks if the person is eligible to vote or not using the isEligible method
    if (person.isEligible()) {
      // Prints into the console the following text when the age is valid to vote
      System.out.println("Great news! You are eligible to vote.");
    } else {
      // Prints into the console the following text when the age is below the require
      System.out.println("We are sorry to inform you that you are NOT eligible to vote.");
    }
  }
}