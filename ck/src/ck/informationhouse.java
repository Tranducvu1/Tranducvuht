package ck;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
 class informationhouse extends JFrame{
		JFrame f1 = new JFrame();
		JLabel lb = new JLabel("Information house");
		JLabel lbID = new JLabel("ID House");
		JTextField tfID = new JTextField(10);
		JLabel lbaddressh = new JLabel("Address House");
		JTextField tfaddressh = new JTextField(10);
		JLabel lbarea = new JLabel("House Area");
		JTextField tfarea = new JTextField(10);
		JLabel lbdeposits = new JLabel("Deposits");
		JTextField tfdeposits = new JTextField(10);
		JButton btnadd = new JButton("Thêm");
		JButton btnedit = new JButton("Sửa");
		JButton btndel  = new JButton("Xoá");
		JButton btnback = new JButton("Trở lại");
		JLabel lbsearch = new JLabel("🔍Search");
		JButton btnsearch = new JButton("Search");
		JButton btnexit = new JButton("Exit");
		JTextField tfsearch = new JTextField(10);
		JLabel lbtools = new JLabel("Tools");
		JLabel btnMenu = new JLabel("Meuu");
		public informationhouse() {
			JPanel jpnMain = new JPanel();
			jpnMain.setLayout(new BorderLayout());
			jpnMain.setLayout(new GridLayout(1,1));
			jpnMain.setSize(1400,1500);
			f1.setLayout(null);
			lb.setBounds(175,30,500,30);
			lb.setFont(new Font("Tahoma", Font.BOLD, 20));
			lb.setForeground(Color.BLUE);
			//ĐỔI MÀU CHỮ
			f1.add(lb);
			lbID.setBounds(40,80,500,30);
			lbID.setFont(new Font("Tahoma", Font.BOLD, 12));
			f1.add(lbID);
			tfID.setBounds(140,80,300,20);
			tfID.setFont(new Font("Tahoma", Font.BOLD, 12));
			f1.add(tfID);
			lbaddressh.setBounds(40,120,500,30);
			lbaddressh.setFont(new Font("Tahoma", Font.BOLD, 12));
			f1.add(lbaddressh);
			tfaddressh.setBounds(140,125,300,20);
			tfaddressh.setFont(new Font("Tahoma", Font.BOLD, 12));
			f1.add(tfaddressh);
			lbarea.setBounds(40,160,500,30);
			lbarea.setFont(new Font("Tahoma", Font.BOLD, 12));
			f1.add(lbarea);
			tfarea.setBounds(140,165,300,20);
			tfarea.setFont(new Font("Tahoma", Font.BOLD, 12));
			f1.add(tfarea);
			lbdeposits.setBounds(40,200,300,30);
			lbdeposits.setFont(new Font("Tahoma", Font.BOLD, 12));
			f1.add(lbdeposits);
			tfdeposits.setBounds(140,205,300,30);
			tfdeposits.setFont(new Font("Tahoma", Font.BOLD, 12));
			f1.add(tfdeposits);
			btnadd.setBounds(55,450,80,34);
			btnadd .setFont(new Font("Tahoma", Font.BOLD, 12));
			f1.add(btnadd);
			btnedit.setBounds(155,450,65,34);
			btnedit.setFont(new Font("Tahoma", Font.BOLD, 10));
			f1.add(btnedit);
			btndel.setBounds(235,450,95,34);
			btndel.setFont(new Font("Tahoma", Font.BOLD, 10));
			f1.add(btndel);
			btnback.setBounds(350,450,85,34);
			btnback.setFont(new Font("Tahoma", Font.BOLD, 10));
			f1.add(btnback);
			lbsearch.setBounds(60,300,100,30);
			lbsearch.setFont(new Font("Tahoma", Font.BOLD, 13));
			lbsearch.setForeground(Color.RED);
			f1.add(lbsearch);
			btnsearch.setBounds(70,350,75,34);
			btnsearch.setFont(new Font("Tahoma", Font.BOLD, 10));
			f1.add(btnsearch);
			tfsearch.setBounds(200,355,240,30);
			tfsearch.setFont(new Font("Tahoma", Font.BOLD, 10));
			f1.add(tfsearch);
			lbtools.setBounds(60,400,100,30);
			lbtools.setFont(new Font("Tahoma", Font.BOLD, 13));
			lbsearch.setForeground(Color.BLUE);
			f1.add(lbtools);
				f1.add(btnexit);
				btnback.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						f1.dispose();
						new choose();
					}
				});
				f1.add(jpnMain);
			f1.pack();
			f1.setSize(1200,700);
		f1.setVisible(true);
		JPanel jpn2 = new JPanel();
		jpnMain.add(jpn2,BorderLayout.NORTH);
		Border bd = BorderFactory.createLineBorder(Color.BLUE);
		TitledBorder bdt2 = BorderFactory.createTitledBorder(bd, "Database ");
		jpn2.setBorder(bdt2);
		DefaultTableModel dm=new DefaultTableModel();
		dm.addColumn("ID lanlord ");
		dm.addColumn("Full name");
		dm.addColumn("Birthday");
		dm.addColumn("Phone number");
		JTable jtb = new JTable(dm);
		dm.addRow(new String[]{"214A","213 Tran Hung Dao","2.600","5.000.000"});
		JScrollPane sc=new JScrollPane(jtb);
		jpn2.add(sc, BorderLayout.SOUTH);
		
		
		
		btnadd.addActionListener(new ActionListener() {

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
		f1.add(jpnMain);
	
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new informationhouse();
	}

}
