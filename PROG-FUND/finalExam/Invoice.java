public class Invoice {
  // States
  private int invoiceNumber;
  private int invoiceAmount;

  // Constructors
  Invoice(int invoiceNumber, int invoiceAmount) {
    this.invoiceNumber = invoiceNumber;
    this.invoiceAmount = invoiceAmount;
  }

  Invoice() {
    this.invoiceNumber = 0;
    this.invoiceAmount = 0;
  }

  // Methods
  public int getInvoiceNumber() {
    return this.invoiceNumber;
  }

  public int getInvoiceAmount() {
    return this.invoiceAmount;
  }

  public void setInvoiceNumber(int invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public void setInvoiceAmount(int invoiceAmount) {
    this.invoiceAmount = invoiceAmount;
  }
}