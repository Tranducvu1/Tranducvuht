package Model;




import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

;

@XmlRootElement(name = "order")
public class borrow {

    private String ticketid;

    private String borrower;

    private String borrow_date;
    
    private String borrow_time;

    private List<Item> items;

    private String name;

    private String price;

 

    public borrow() {
    }

    public borrow(String ticketid, String borrower, String borrow_date,String borrow_time, List<Item> items, String name, String price) {
        this.ticketid = ticketid;
        this.borrower = borrower;
        this.borrow_date = borrow_date;
        this.borrow_time = borrow_time;
        this.items = items;
        this.name = name;
        this.price = price;

    }


    public String getTicketid() {
		return ticketid;
	}
    @XmlElement
	public void setTicketid(String ticketid) {
		this.ticketid = ticketid;
	}

	public String getBorrower() {
		return borrower;
	}
    @XmlElement
	public void setBorrower(String borrower) {
		this.borrower = borrower;
	}

	public String getBorrow_date() {
		return borrow_date;
	}
    @XmlElement
	public void setBorrow_date(String borrow_date) {
		this.borrow_date = borrow_date;
	}

	public String getBorrow_time() {
		return borrow_time;
	}
    @XmlElement
	public void setBorrow_time(String borrow_time) {
		this.borrow_time = borrow_time;
	}
	public List<Item> getItems() {
		return items;
	}
	@XmlElement(name = "item")
	public void setItems(List<Item> items) {
		this.items = items;
	}

	public String getName() {
		return name;
	}
	@XmlElement(name = "name")
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPrice() {
		return price;
	}
	@XmlElement(name = "Price")
	public void setPrice(String price) {
		this.price = price;
	}

	
	  @Override public String toString() { return "borrow{" + "ticketid=" +
	  ticketid + ", borrower=" + borrower + ", borrow_date=" + borrow_date +
	  borrow_time +", borrow_time=" + ", items=" + items + ", name=" + name +
	  ", price=" + price + '}'; }
	 

}
