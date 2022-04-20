package Model;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;

import Model.borrow;

public class WriteStAXCursor {
	 public void writeXML(String src, borrow borrow) throws XMLStreamException, FileNotFoundException {
	        XMLOutputFactory factory = XMLOutputFactory.newFactory();
	        XMLEventWriter writer = factory.createXMLEventWriter(new FileOutputStream(src), "UTF-8");
	        XMLEventFactory eventFactory = XMLEventFactory.newFactory();

	        XMLEvent event = eventFactory.createStartDocument("UTF-8", "1.0");

	        writer.add(event);
	        writer.add(eventFactory.createStartElement("", "", "borrow"));
	        
	        writer.add(eventFactory.createStartElement("", "", "ticketid"));
	        writer.add(eventFactory.createAttribute("number", borrow.getTicketid()));
	        writer.add(eventFactory.createEndElement("", "", "ticketid"));
	        writer.add(eventFactory.createStartElement("", "", "borrower"));
	        writer.add(eventFactory.createCharacters(borrow.getBorrower()));
	        writer.add(eventFactory.createEndElement("", "", "borrower"));

	        writer.add(eventFactory.createStartElement("", "", "borrow_date"));
	        writer.add(eventFactory.createCharacters(borrow.getBorrow_date()));
	        writer.add(eventFactory.createEndElement("", "", "borrow_date"));

	        writer.add(eventFactory.createStartElement("", "", "borrow_time"));
	        writer.add(eventFactory.createCharacters(borrow.getBorrow_time()));
	        writer.add(eventFactory.createEndElement("", "", "borrow_time"));

	        

	        writer.add(eventFactory.createStartElement("", "", "item"));

	        for (int i = 0; i < borrow.getItems().size(); i++) {
	            writer.add(eventFactory.createStartElement("", "", "name"));
	            writer.add(eventFactory.createCharacters(borrow.getItems().get(i).getName()));
	            writer.add(eventFactory.createEndElement("", "", "name"));


	            writer.add(eventFactory.createStartElement("", "", "price"));
	            writer.add(eventFactory.createCharacters(borrow.getItems().get(i).getPrice()));
	            writer.add(eventFactory.createEndElement("", "", "price"));
	        }
	        writer.add(eventFactory.createEndElement("", "", "Item"));

	        writer.add(eventFactory.createEndElement("", "", "borrow"));
	        writer.add(eventFactory.createEndDocument());

	        writer.flush();

	        writer.close();

	    }
	}



