package ck;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
	class choose extends JFrame{
		JFrame fc1 = new JFrame();
		JFrame fc = new JFrame("Choose");
		JLabel lbchoose = new JLabel("QUAN LY CHO THUE NHA ");
		JLabel lbchoose1 = new JLabel("DO AN JAVA CUOI KI  SINH VIEN THUC HIEN TRAN DUC VU 21IT324 ");
		JButton btcustomer = new JButton("Choose Customers");
		JButton btlandlords = new JButton("Choose Landlords");
		JButton bthouse = new JButton("Choose House");
		JButton btdx = new JButton("Đăng xuất");
		JButton btexit = new JButton("Exit");
		public choose() {
			fc.setLocation(300,20);
			fc.setLayout(null);
			//fc1 = new JFrame();
			JLabel lbLogo = new JLabel("");
			lbLogo.setIcon(new ImageIcon("D:\\VideoTranducvu\\nhà1.png"));
			lbLogo.setBounds(50, 150, 1000, 500);
			fc.getContentPane().add(lbLogo);
		//	Container cont3 =  f.getContentPane();
			lbchoose.setBounds(500,0,330,100);
			lbchoose.setFont(new Font("Tahoma", Font.BOLD, 12));
			
			fc.add(lbchoose);
			lbchoose1.setBounds(500,50,450,100);
			lbchoose1.setFont(new Font("Tahoma", Font.BOLD, 12));
			fc.add(lbchoose1);
			btcustomer.setBounds(700,180,200,100);
			btcustomer.setFont(new Font("Tahoma", Font.BOLD, 12));
			btcustomer.setBackground(Color.RED);
			fc.add(btcustomer);
			btlandlords.setBounds(700,340,200,100);
			btlandlords.setFont(new Font("Tahoma", Font.BOLD, 12));
			btlandlords.setBackground(Color.BLUE);
			fc.add(btlandlords);
			bthouse.setBounds(700,500,200,100);
			bthouse.setFont(new Font("Tahoma", Font.BOLD, 12));
			bthouse.setBackground(Color.YELLOW);
			fc.add(bthouse);
			btdx.setBounds(1000,270,150,80);
			btdx.setFont(new Font("Tahoma", Font.BOLD, 12));
			fc.add(btdx);
			btexit.setBounds(1000,400,150,80);
			btexit.setFont(new Font("Tahoma", Font.BOLD, 12));
			fc.add(btexit);
			fc.pack();
			fc.setSize(2000,2000);
			fc.setVisible(true);
			btcustomer.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					new Customer();
					fc.dispose();
				}
			});
			btlandlords.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					new lanlord().setVisible(true);
					fc.dispose();
				}
			});
			bthouse.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					new informationhouse();
					fc.dispose();
				}
			});
			btdx.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e) {
							new SignUp();
							fc.dispose();
						}
			});
				
						btexit.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent e) {
								fc.dispose();
							
							}	});
				}
			
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new choose();
	}
			
			}
