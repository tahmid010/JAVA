package javawindow;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JavaWindow {
	public static void main(String[] args) {
		FileClass obj = new FileClass();
	}
}

class FileClass extends JFrame
{
	public FileClass()
	{ 
		JButton b1 = new JButton("New Window");
		
		b1.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent ae)
					{
						JFrame f1 = new JFrame("New Frame");
						JLabel l2 = new JLabel("Name : ");
						JTextField t1 = new JTextField(15);
						JLabel l3 = new JLabel("Roll : ");
						JTextField t2 = new JTextField(15);
						
						l2.setBounds(50, 50, 75, 20);
						t1.setBounds(125, 50, 100, 20);
						l3.setBounds(50, 125, 100, 20);
						t2.setBounds(125, 125, 100, 20);
						
						f1.add(l2);
						f1.add(t1);
						f1.add(l3);
						f1.add(t2);
						
						f1.setLayout(null);// FlowLayout,GridLayout,Null
						f1.setVisible(true);
						f1.setSize(600, 400);
						f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						
					}
					
				});
		
		
		add(b1);
		
		setLayout(new FlowLayout());// FlowLayout,GridLayout,Null
		setVisible(true);
		setLocationRelativeTo(null);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}