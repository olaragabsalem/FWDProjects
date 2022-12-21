/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application_Controller;

import Application_View.SIG_View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author HP
 */
public class Controller implements ActionListener {
private SIG_View frame;

    public Controller(SIG_View frame) {
        this.frame = frame;
    }

   
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("helloworld");
        switch(e.getActionCommand()){
        
        
       case "CreateInvoiceBtn":
           NewInvoice();
           break;
       case "DeleteInvoiceBtn" :
           DeleteInvoice();
                      break;
       case "CreateItemBtn" :
           SaveItem();
                      break;
       case "DeleteItemBtn":
           DeleteItem();
                      break;
       case "LoadMenuItem" :
           LoadMenu();
                      break;
       case "SaveMenuItem":
           SaveMenu();
                      break;
  }
    
}

    private void SaveMenu() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void LoadMenu() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void DeleteItem() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void SaveItem() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void DeleteInvoice() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void NewInvoice() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
