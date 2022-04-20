package Model;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;



import Model.borrow;
import Model.borrows;
import View.menu;



public class ReadJAXB {



	//public void readXML(String src) throws JAXBException {
	public void readXML(String src) throws JAXBException {
   JAXBContext jaxbContext = JAXBContext.newInstance(borrow.class);
    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

   File file = new File(src);
    borrow Borrow = (borrow) jaxbUnmarshaller.unmarshal(new File ("borrow.xml"));
    //menu.showList(Borrow);
   System.out.println(Borrow);
}

public void readOrderListXML(String src) throws JAXBException {
    JAXBContext jaxbContext = JAXBContext.newInstance(borrows.class);
    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

    File file = new File(src);
    borrows orders = (borrows) jaxbUnmarshaller.unmarshal(file);
    System.out.println(orders);
}
	
/*
 * borrows stlistread = new borrows(); JAXBContext context =
 * JAXBContext.newInstance(borrows.class); Unmarshaller unmar =
 * context.createUnmarshaller(); stlistread =(borrows) unmar.unmarshal(new
 * File("C:\\Users\\vutd2\\eclipse-workspace\\Java\\src\\XML\\borrow.xml"));
 * return stlistread; }
 */
}

