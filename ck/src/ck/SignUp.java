package ck;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp extends JFrame {
	JFrame fc= new JFrame();
	JLabel lbsignup = new JLabel("SIGN UP");
//	JLabel lb = new JLabel("SIGN UP");
	
	JLabel lbusername = new JLabel("USERNAME");
	JTextField tfusername = new JTextField(15);
	JLabel lbpassword = new JLabel("PASSWORD");
	JTextField tfpassword = new JTextField(15);
	JButton btforget = new JButton("Forgotten");
	JButton btsignup = new JButton("Sign Up");
	JButton btcreateacA = new JButton("Create Account");
	JButton btcancel = new JButton("Cancel");
	JLabel lbq = new JLabel("QUYEN");
	String gender[] = {"Quản trị","Khách"};
	JComboBox cbq = new JComboBox(gender);
	public SignUp() {
		lbsignup.setLayout(null);
		lbsignup.setBounds(750,120,100,30);
		lbsignup.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbsignup.setForeground(Color.BLUE);
		fc.setLocation(500,200);
		fc.setLayout(null);
	//	lb.setBounds(50,0,500,30);
	//	lb.setFont(new Font("Tahoma", Font.BOLD, 20));
	//	lb.setForeground(Color.BLUE);
		fc.add(lbsignup);
	
	//	lb.setBounds(750,120,100,20);
	//	lb.setFont(new Font("Tahoma", Font.BOLD, 12));
	//	fc.add(lb);
		lbusername.setBounds(450,120,300,210);
		lbusername.setFont(new Font("Tahoma", Font.BOLD, 12));
		fc.add(lbusername);
		tfusername.setBounds(550,213,500,30);
		tfusername.setFont(new Font("Tahoma", Font.BOLD, 12));
		fc.add(tfusername);
		lbpassword.setBounds(450,180,300,210);
		lbpassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		fc.add(lbpassword);
		tfpassword.setBounds(550,270,500,30);
		tfpassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		fc.add(tfpassword);
		lbq.setBounds(650,320,100,20);
		lbq.setFont(new Font("Tahoma", Font.BOLD, 12));
		fc.add(lbq);
		cbq.setBounds(750,320,100,20);
		cbq.setFont(new Font("Tahoma", Font.BOLD, 12));
		fc.add(cbq);
		btforget.setBounds(400,420,100,50);
		btforget.setFont(new Font("Tahoma", Font.BOLD, 12));
		fc.add(btforget);
		btsignup.setBounds(600,420,100,50);
		btsignup.setFont(new Font("Tahoma", Font.BOLD, 12));
		fc.add(btsignup);
		btcreateacA.setBounds(800,420,200,50);
		btcreateacA.setFont(new Font("Tahoma", Font.BOLD, 12));
		fc.add(btcreateacA);
		btcancel.setBounds(1100,420,100,50);
		btcancel.setFont(new Font("Tahoma", Font.BOLD, 12));
		fc.add(btcancel);
	
		    fc.pack();
			fc.setSize(1500,600);
			fc.setVisible(true);
			btcancel.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					fc.dispose();
				}
			});
			btsignup.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					new choose();
					JOptionPane.showMessageDialog( null, " Dang nhap thanh cong");
					fc.dispose();
				}
			});
			btcreateacA.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					new Createaccount();
					fc.dispose();
					
				}
			});
			btforget.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					new forgotpass();
					fc.dispose();
					
				}
			});
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SignUp();
	}
}
