/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application_Model;


/**
 *
 * @author HP
 */
public class Item {
    Header Invoice;
    int Invoice_No;
    String Customer_Name;
    int count;
     double price;

    public Item(Header Invoice, int Invoice_No, String Customer_Name, int count, double price) {
        this.Invoice = Invoice;
        this.Invoice_No = Invoice_No;
        this.Customer_Name = Customer_Name;
        this.count = count;
        this.price = price;
    }

    public Header getInvoice() {
        return Invoice;
    }

    public void setInvoice(Header Invoice) {
        this.Invoice = Invoice;
    }

    public int getInvoice_No() {
        return Invoice_No;
    }

    public void setInvoice_No(int Invoice_No) {
        this.Invoice_No = Invoice_No;
    }

    public String getCustomer_Name() {
        return Customer_Name;
    }

    public void setCustomer_Name(String Customer_Name) {
        this.Customer_Name = Customer_Name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" + "Invoice=" + Invoice + ", Invoice_No=" + Invoice_No + ", Customer_Name=" + Customer_Name + ", count=" + count + ", price=" + price + '}';
    }
    public double GetTotal(){
        return count*price;
    }
}
