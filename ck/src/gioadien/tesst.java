package gioadien;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;


	public class tesst{
		
		JFrame f = new JFrame("Product");
		JLabel lbID = new JLabel("Product Id");
		JTextField tfID = new JTextField(10);
		JLabel lbName = new JLabel("Product Name");
		JTextField tfName = new JTextField(10);
		JLabel lbQuantity = new JLabel("Quantity");
		JTextField tfQuantity = new JTextField(10);
		JButton btnAdd = new JButton("Add");
		JButton btnUpdate = new JButton("Edit");
		JButton btnDelete = new JButton("Delete");
		public tesst() {
			JPanel jpnMain = new JPanel();
			jpnMain.setLayout(new BorderLayout());
			jpnMain.setLayout(new GridLayout(1,1));
			jpnMain.setSize(1000,1000);
			f.setLocation(250,250);
			f.setLayout(new GridLayout(7,2));
			Container cont =  f.getContentPane();
			cont.add(lbID);
			
			cont.add(tfID);
			cont.add(lbName);
			cont.add(tfName);
			cont.add(lbQuantity);
			cont.add(tfQuantity);
			
			cont.add(btnAdd);
			cont.add(btnUpdate);
			f.pack();
			f.setSize(500,500);
			f.setVisible(true);
			JPanel jpn2 = new JPanel();
			jpnMain.add(jpn2,BorderLayout.NORTH);
			Border bd = BorderFactory.createLineBorder(Color.BLUE);
			TitledBorder bdt2 = BorderFactory.createTitledBorder(bd, "Database ");
			jpn2.setBorder(bdt2);
			JPanel jp1 = new JPanel();
			jp1.setLayout(new FlowLayout(1000, 100, 300));
			DefaultTableModel dm=new DefaultTableModel();
			dm.addColumn("Họ và tên ");
			dm.addColumn("Quê quán ");
			dm.addColumn("Dia chi");
			dm.addColumn("CCCD");
			dm.addColumn("Tien tro");
			JTable jtb = new JTable(dm);
			dm.addRow(new String[]{"Trần Đức Vũ","Thừa Thiên Huế","Tứ Hạ","123456789","1.000.000"});
			dm.addRow(new String[]{"Trịnh Công Toàn","Thừa Thiên Huế","Tứ Hạ","123456789","1.000.000"});
			dm.addRow(new String[]{"Phan Thi Mỹ Linh","Quảng Trị","","123456789","1.000.000"});
			JScrollPane sc=new JScrollPane(jtb);
			jpn2.add(sc, BorderLayout.CENTER);
			
			
			
			btnAdd.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
				//	dm.addRow(new String [] {jtf1.getText(),(String)jcb.getSelectedItem(),jtf2.getText(),jtf3.getText(),jtf4.getText()});				
				}		
			});
			
			jtb.addMouseListener(new MouseListener() {

				
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					int row = jtb.getSelectedRow();
					String name = (String) jtb.getValueAt(row, 0);
				//	jtf1.setText(name);
				}

				@Override
				
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					
				} 

				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
			});
			f.add(jpnMain);
		}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
new tesst();
	}

			}
