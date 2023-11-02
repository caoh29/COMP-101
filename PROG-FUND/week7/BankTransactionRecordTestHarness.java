// The purpose of this class is to Test a blueprint for a Bank transaction record
// first we define the number of transactions
// then we create a transactions array which stores each reference for each object created from the class
// then for each transaction we generate random data for each attribute to create a new object of a class
// and then print out the state of each attributte in th object
// finally we ask the user if wants to continue,
// if so assign the same random value to each object but keeping the transactionReferenceNumber the same

import java.util.Random;
import java.util.Scanner;

public class BankTransactionRecordTestHarness {
  public static void main(String[] args) {

    int numberOfTransactions = 10;

    BankTransactionRecord[] transactions = new BankTransactionRecord[numberOfTransactions];

    Random rand = new Random();

    for (int i = 0; i < numberOfTransactions; i++) {
      boolean canadianFunds = rand.nextBoolean();
      double exchangeRate = rand.nextDouble();
      int transactionNumber = Math.abs(rand.nextInt());
      long transactionReferenceNumber = Math.abs(rand.nextLong());

      transactions[i] = new BankTransactionRecord(canadianFunds, exchangeRate, transactionNumber,
          transactionReferenceNumber);

      System.out.println("Canadian Funds: " + transactions[i].getCanadianFunds());
      System.out.println("Exchange Rate: " + transactions[i].getExchangeRate());
      System.out.println("Transaction Number: " + transactions[i].getTransactionNumber());
      System.out.println("Transaction Reference Number: " + transactions[i].getTransactionReferenceNumber());
      System.out.println("-----------------------------------");
    }

    System.out.print("Do you wish to complete phase two of the test? (yes/no): ");

    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();

    if (input.equals("yes")) {
      System.out.println("-----------------------------------");

      boolean canadianFunds = rand.nextBoolean();
      double exchangeRate = rand.nextDouble();
      int transactionNumber = Math.abs(rand.nextInt());

      for (int j = 0; j < BankTransactionRecord.objectCounter; j++) {
        transactions[j].setCanadianFunds(canadianFunds);
        transactions[j].setExchangeRate(exchangeRate);
        transactions[j].setTransactionNumber(transactionNumber);
        System.out.println("Canadian Funds: " + transactions[j].getCanadianFunds());
        System.out.println("Exchange Rate: " + transactions[j].getExchangeRate());
        System.out.println("Transaction Number: " + transactions[j].getTransactionNumber());
        System.out.println("Transaction Reference Number: " + transactions[j].getTransactionReferenceNumber());
        System.out.println("-----------------------------------");
      }
    }

    sc.close();
  }
}
