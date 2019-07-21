package labwork;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;


import javafx.scene.paint.Color;

public class LabWork1 {
	public static void main(String[] args)
	{
		LabWork2 obj = new LabWork2();
	}
}

class LabWork2 extends JFrame
{
	public LabWork2()
	{
		JLabel l1 = new JLabel("facebook");
		l1.setOpaque(true);
		l1.setBackground(java.awt.Color.PINK);
		l1.setForeground(java.awt.Color.WHITE);
		l1.setBounds(175,20,60,25);
		l1.setBorder(new BevelBorder(BevelBorder.LOWERED));
		JLabel l2 = new JLabel("User ");
		l2.setBounds(25,60,75,20);
		JTextField t1 = new JTextField(20);
		t1.setBounds(100,60,200,20);
		JLabel l3 = new JLabel("Password ");
		l3.setBounds(25,90,75,20);
		JPasswordField t2 = new JPasswordField(20);
		t2.setEchoChar('*');
		t2.setBounds(100,90,200,20);
		JButton b1 = new JButton("Login");
		b1.setBounds(30,120,75,20);
		JButton b2 = new JButton("Forget Password? ");
		b2.setBounds(130,120,150,20);
		JLabel l4 = new JLabel(" ");
		l4.setBounds(30,140,150,20);
		JLabel l5 = new JLabel(" ");
		l5.setBounds(150,140,200,20);
		JButton b3 = new JButton("Cancel");
		b3.setBounds(300,120,100,20);
		
		b1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent ae)
				{
					l4.setText("Login Successfull!");
				}
		});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae1)
			{
				l5.setText("Go To Recover Password");
			}
	});
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae2)
			{
	             System.exit(0);
	        }			
	});
		
		add(l1);
		add(l2);
		add(t1);
		add(l3);
		add(t2);
		add(b1);
		add(b2);
		add(l4);
		add(l5);
		add(b3);
		
		setLayout(null);// FlowLayout,GridLayout,Null
		setVisible(true);
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}