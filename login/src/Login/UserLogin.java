package Login;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JTextField;

public class UserLogin {
	public static void main(String[] args) throws Exception {
		SwingClass obj = new SwingClass();
	}
}


class SwingClass extends JFrame 
{
	private JTextField t1,t2;
	private JButton b;
	
	public SwingClass() throws Exception
	{
		JLabel j = new JLabel("User :");
		t1 = new JTextField(17);
		JLabel j1 = new JLabel("Password : ");
		t2 = new JTextField(17);
		b = new JButton("login");
		b.setBounds(10, 80, 80, 25);
		JLabel j2 = new JLabel(" ");
		//JScrollBar s1 = new JScrollBar();
		
		ActionListener al = ( ae->	        
			{
				String name = t1.getText();
				String roll = t2.getText();
				
				String str = name + "\n" + roll;
				File f = new File("document2.txt");
				FileOutputStream fos = null;
				try {
					fos = new FileOutputStream(f);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				DataOutputStream dos = new DataOutputStream(fos);
				try {
					dos.writeUTF(str);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				j2.setText("Data Save is Successfull");
			});
		
		 b.addActionListener(al);				
		
		add(j);
		add(t1);
		add(j1);
		add(t2);
		add(b);
		add(j2);
		
		
		setLayout(new FlowLayout());// FlowLayout,GridLayout,Null
		setVisible(true);
		setSize(300, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
	
}