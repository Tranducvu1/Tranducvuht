package Model;


import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement(name = "borrows")
public class borrows 
{
  @XmlElement(name = "borrow")
  private List<borrow> borrows = null;
 
  public List<borrow> getEmployees() {
    return borrows;
  }
 
  public void setEmployees(List<borrow> borrows) {
    this.borrows = borrows;
  }
}