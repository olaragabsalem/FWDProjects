/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application_Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author HP
 */
public class Header {
  private   int Invoice_No;
  private  String Customer_Name;
  private Date Invoice_date;
  private ArrayList<Item> items;

    public Header(int Invoice_No, String Customer_Name, Date Invoice_date) {
        this.Invoice_No = Invoice_No;
        this.Customer_Name = Customer_Name;
        this.Invoice_date = Invoice_date;
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

    public Date getInvoice_date() {
        return Invoice_date;
    }

    public void setInvoice_date(Date Invoice_date) {
        this.Invoice_date = Invoice_date;
    }

    public ArrayList<Item> getItems() {
        if(items==null){      //lazy loading if item is null will not throw exception 
            items=new ArrayList();
        }
        
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Header{" + "Invoice_No=" + Invoice_No + ", Customer_Name=" + Customer_Name + ", Invoice_date=" + Invoice_date + ", items=" + items + '}';
    }
     public double GetTotal(){
         double total=0.0;
         for (Item item :getItems()) {
             total+=item.GetTotal();
         }
        return total;
    }
}
