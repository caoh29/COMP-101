// Challenge 1
// Chequing account class
public class ChequingAccount {
  // States (instance variables)
  private String firstName;
  private String lastName;
  private double balance;
  private int accountNumber;

  // Constructor (assign attributes to an instance class)
  public ChequingAccount(String firstName, String lastName, double balance, int accountNumber) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.balance = balance;
    this.accountNumber = accountNumber;
  }

  // Behaviours (methods)
  // Getters and setters (functions that return or change the value (attribute) of
  // an instance variable (object))

  // Returns instance's first name
  public String getFirstName() {
    return firstName;
  }

  // Sets instance's first name
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  // Returns instance's last name
  public String getLastName() {
    return lastName;
  }

  // Sets instance's last name
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  // Returns instance's balance
  public double getBalance() {
    return balance;
  }

  // Sets instance's balance
  public void setBalance(double balance) {
    this.balance = balance;
  }

  // Returns instance's account number
  public int getAccountNumber() {
    return accountNumber;
  }

  // Sets instance's account number
  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }
}