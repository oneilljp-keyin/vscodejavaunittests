package tech.johnoneill;

import static org.junit.Assert.*;
import org.junit.Test;

public class InvoiceItemTest {
  private InvoiceItem I1 = new InvoiceItem("1", "T-Shirt", 2, 10.99);
  private InvoiceItem I2 = new InvoiceItem("2", "Jeans", 3, 39.99);
  private InvoiceItem I3 = new InvoiceItem("3", "Sneakers", 1, 99.99);
  private InvoiceItem I4 = new InvoiceItem("4", "Baseball Cap", 5, 24.99);

  @Test
  public void returnTotalInvoices() {
    int totalInvoices = InvoiceItem.totalInvoices();
    assertEquals(4, totalInvoices);
  }

  @Test
  public void testInvoiceTotals() {
    double invoiceTotal1 = I1.getTotal();
    double invoiceTotal2 = I2.getTotal();
    double invoiceTotal3 = I3.getTotal();
    double invoiceTotal4 = I4.getTotal();

    assertEquals(21.98, invoiceTotal1, 0.01);
    assertEquals(119.97, invoiceTotal2, 0.01);
    assertEquals(99.99, invoiceTotal3, 0.01);
    assertEquals(124.95, invoiceTotal4, 0.01);
  }

  @Test
  public void testChangesToQtyAndUnitPrice() {
    I1.setQty(4);
    I4.setQty(3);
    int newQty1 = I1.getQty();
    int newQty4 = I4.getQty();
    assertEquals(4, newQty1);
    assertEquals(3, newQty4);

    I2.setUnitPrice(34.99);
    I3.setUnitPrice(82.67);
    double newUnitPrice2 = I2.getUnitPrice();
    double newUnitPrice3 = I3.getUnitPrice();
    assertEquals(34.99, newUnitPrice2, 0.01);
    assertEquals(82.67, newUnitPrice3, 0.01);

    double newInvoiceTotal1 = I1.getTotal();
    double newInvoiceTotal2 = I2.getTotal();
    double newInvoiceTotal3 = I3.getTotal();
    double newInvoiceTotal4 = I4.getTotal();
    assertEquals(43.96, newInvoiceTotal1, 0.01);
    assertEquals(104.97, newInvoiceTotal2, 0.01);
    assertEquals(82.67, newInvoiceTotal3, 0.01);
    assertEquals(74.97, newInvoiceTotal4, 0.01);

  }

}
