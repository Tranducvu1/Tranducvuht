package Controller;

import java.util.Scanner;
import javax.xml.bind.JAXBException;
/*import java.io.File;
import java.util.ArrayList;
import java.util.List;


import javax.xml.bind.JAXBContext;

import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;*/



import Model.ReadJAXB;
/*import Model.Item;
import Model.borrow;
import Model.borrows;*/
import View.menu;


//import Model.borrow;
//import Model.borrows;

public class Main {

	public static void main(String[] args) throws JAXBException {
	//	Scanner sc = new Scanner(System.in);
		//ReadJAXB rwx = new ReadJAXB();
		//borrows stlist = rwx.read();
	//borrow st = new borrow();
	//	menu m= new menu();
        while (true) {
            int choice = menu.menu();
           // String ticketid, borrower,borrow_date, borrow_time,itemName, itemPrice;

            switch (choice) {
                case 1:
                 ReadJAXB read = new ReadJAXB();
                read.readXML("borrow.xml");     
                //	System.out.println(rwx.read());
                    break;
               
                case 2:
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Does not exist with the entered ID");
                    System.out.println("Try again");
                    break;
            }
        }
    }

}