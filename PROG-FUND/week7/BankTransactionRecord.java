// The purpose of this class is to create a blueprint for a Bank transaction record
// it includes 4 attributes for each objetc, 1 static attribute for counting the number of
// objects created and a constructor to initialize the attributes
// A constructor which takes 4 parameters
// and getters and setters for each attribute

public class BankTransactionRecord {
  // State
  private boolean canadianFunds;
  private double exchangeRate;
  private int transactionNumber;
  private long transactionReferenceNumber;

  public static int objectCounter = 0;

  // Constructor
  BankTransactionRecord(boolean canadianFunds, double exchangeRate, int transactionNumber,
      long transactionReferenceNumber) {

    this.canadianFunds = canadianFunds;
    this.exchangeRate = exchangeRate;
    this.transactionNumber = transactionNumber;
    this.transactionReferenceNumber = transactionReferenceNumber;
    objectCounter++;
  }

  // Getters and Setters
  public boolean getCanadianFunds() {
    return canadianFunds;
  }

  public double getExchangeRate() {
    return exchangeRate;
  }

  public int getTransactionNumber() {
    return transactionNumber;
  }

  public long getTransactionReferenceNumber() {
    return transactionReferenceNumber;
  }

  public void setCanadianFunds(boolean canadianFunds) {
    this.canadianFunds = canadianFunds;
  }

  public void setExchangeRate(double exchangeRate) {
    this.exchangeRate = exchangeRate;
  }

  public void setTransactionNumber(int transactionNumber) {
    this.transactionNumber = transactionNumber;
  }

  public void setTransactionReferenceNumber(long transactionReferenceNumber) {
    this.transactionReferenceNumber = transactionReferenceNumber;
  }
}
