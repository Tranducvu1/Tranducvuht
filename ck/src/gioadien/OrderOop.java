package gioadien;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JCalendar;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import java.util.Calendar;
import gioadien.ConnectDB;
public class OrderOop extends JFrame{
	JFrame f = new JFrame("Orderl");
	JLabel lbID = new JLabel("Id");
	JTextField tfID = new JTextField(10);
	JLabel lbOrderID = new JLabel("OrderID");
	JTextField tfOrderID = new JTextField(10);
	JLabel lbOrderDate = new JLabel("OrderDate");
	JCalendar jcOrderDate = new JCalendar();
	JLabel lbProductID = new JLabel("ProductID");
	JTextField tfProductID = new JTextField(10);
	JLabel lbQuantity = new JLabel("Quantity");
	JTextField tfQuantity = new JTextField(10);
	JButton btInsert = new JButton("Insert");
	JButton btSelect = new JButton("Select");
	PreparedStatement ps;
	Connection conn;
	ResultSet rs;
	JTable tbmonth;
	public OrderOop() {
		f.setLocation(250,250);
		f.setLayout(new GridLayout(7,2));
		Container cont =  f.getContentPane();
		cont.add(lbOrderID);
		cont.add(tfOrderID);
		cont.add(lbOrderDate);
		cont.add(jcOrderDate);
		cont.add(lbID);
		cont.add(tfID);
		cont.add(lbProductID);
		cont.add(tfProductID);
		cont.add(lbQuantity);
		cont.add(tfQuantity);
		cont.add(btInsert);
		cont.add(btSelect);
		//DisplayOrder();
		JScrollPane sp = new JScrollPane(tbmonth);
		cont.add(sp);
		f.pack();
		f.setSize(500,500);
		f.setVisible(true);
		btInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
					try {
						Date selectedOrderDate = (Date) jcOrderDate.getDate();
						//java.sql.Date OrderDate = convertUtilToSql(selectedOrderDate);
						java.sql.Date OrderDate = convertUtilToSql(selectedOrderDate);
						ConnectDB conn = new ConnectDB();
						//checkOrdetID(tfOrderID.getText());
						checkbirthday(tfOrderID.getText());
						int record = conn.executeDB("Insert into Orderl values('"+tfOrderID.getText()+"','"+OrderDate+"','"+tfID.getText()+"','"+tfProductID.getText()+"','"+tfQuantity.getText()+"')");
						
						if (record>0) JOptionPane.showMessageDialog(null, "Success");
					}catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
			}

			private java.sql.Date convertUtilToSql(Date selectedOrderDate) {
				java.sql.Date sDate = new java.sql.Date(selectedOrderDate.getTime());
		        return sDate;
			}
		});
		btSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		
	}
//	public void DisplayOrder() {
//		   ConnectDB conn = new ConnectDB();
//	        rs= conn.listAll("select Rental_Management.Id, Rental_Management.Name, Product.ProductID, Product.ProductName from Rental_Management, Orderl,Product\r\n"
//	        		+ "where Rental_Management.Id = Orderl.Id and Product.ProductID = Orderl.ProductID and MONTH(OrderDate) = 1 ");
	//      String column[] = {"Id", "Name"," ProductID"," ProductName"};
//	        DefaultTableModel tm = new DefaultTableModel (column, 0);
//	        try {
//				while (rs.next()) {
//					Object data[]= {rs.getString("Id"), rs.getString("Name"),rs.getString("ProductID"),rs.getString("ProductName")};    
//				
//					tbmonth = new JTable(tm);
//					tm.addRow(data);
//					
	//			}
	//		} catch (SQLException e1) {
	//			// TODO Auto-generated catch block
	//			e1.printStackTrace();
	//		}
	        
//	}
	//ki???m tra xem ????ng ?????nh d???ng email kh??ng.
	public void checkOrdetID(String str ) throws Exception {
		String emailulg = "^[\\w-]+@([\\w- ]+\\.)+[\\w-]+$";
		//^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$
		Boolean b = str.matches(emailulg);
		if(b==false) throw new Exception("Dia chi Email khong hop le");
	}
	public void checkbirthday (String str) throws Exception {
		Pattern patternDate = Pattern.compile("^\\d{2}[-|/]\\d{2}[-|/]\\d{4}$");
		Boolean b= patternDate.matcher(str).matches();
		if(b==false) throw new Exception("Ngay thang nam sinh khong hop le");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OrderOop();
	}

}
