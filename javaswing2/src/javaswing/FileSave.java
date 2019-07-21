package javaswing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FileSave {
	public static void main(String[] args) throws Exception
	{
		Unknown obj = new Unknown();
	}
}

class Unknown extends JFrame 
{
	JTextField t1,t2;
	JButton b;
	
	public Unknown() throws Exception
	{
		JLabel j = new JLabel("Name :");
		t1 = new JTextField(17);
		JLabel j1 = new JLabel("Roll :");
		t2 = new JTextField(17);
		b = new JButton("Save");
		JLabel j2 = new JLabel(" ");
		
		ActionListener al = new ActionListener()
		{		//Anonymus class
			public void ActionPerformed(ActionEvent ae)	        
			{
				String name = t1.getText();
				int roll = Integer.parseInt(t2.getText());
				
				String str = name + "\n" + String.valueOf(roll);
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
			}

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}			
		};
		
		add(j);
		add(t1);
		add(j1);
		add(t2);
		add(b);
		add(j2);
		
		setLayout(new FlowLayout());// FlowLayout,GridLayout,Null
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
	
}