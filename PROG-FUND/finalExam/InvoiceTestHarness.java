import java.util.Random;

public class InvoiceTestHarness {
  public static void main(String[] args) {
    int invoicesQuantity = 1000;
    Invoice[] invoices = new Invoice[invoicesQuantity];

    Random rand = new Random();

    for (int i = 0; i < invoicesQuantity; i++) {
      invoices[i] = new Invoice();

      int randomInvoiceAmount = rand.nextInt(999) + 1;

      int invoiceNumber = 10000 + i;

      invoices[i].setInvoiceAmount(randomInvoiceAmount);
      invoices[i].setInvoiceNumber(invoiceNumber);
    }

    for (int i = 0; i < invoicesQuantity; i++) {
      if (invoices[i].getInvoiceAmount() > 500 && invoices[i].getInvoiceNumber() % 2 == 0) {
        System.out.println("-----------------------------");
        System.out.println("Invoice amount: $" + invoices[i].getInvoiceAmount());
        System.out.println("Invoice #: " + invoices[i].getInvoiceNumber());
      }
    }
  }
}
