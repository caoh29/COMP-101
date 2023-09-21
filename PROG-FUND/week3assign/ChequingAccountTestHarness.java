public class ChequingAccountTestHarness {

  public static void main(String[] args) {
    // Creates an instance (object) from the class ChequingAccount with the
    // corresponding states(attributes)
    ChequingAccount account1 = new ChequingAccount("Camilo", "Ordonez", 1500.45, 444111777);

    // Prints in a new line Instance's attribute with its corresponding value
    System.out.println("Instance's first name = " + account1.getFirstName());
    System.out.println("Instance's last name = " + account1.getLastName());
    System.out.println("Instance's current balance = " + account1.getBalance());
    System.out.println("Instance's account number = " + account1.getAccountNumber());

    // Changes (Mutate) the instance (object) values (attributes)
    account1.setFirstName("XXXXXX");
    account1.setLastName("YYYYYYY");

    // Prints in a new line Instance's attribute with its corresponding new value
    System.out.println("Instance's first name = " + account1.getFirstName());
    System.out.println("Instance's last name = " + account1.getLastName());
    System.out.println("Instance's current balance = " + account1.getBalance());
    System.out.println("Instance's account number = " + account1.getAccountNumber());
  }
}