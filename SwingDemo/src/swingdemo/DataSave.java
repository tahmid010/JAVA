package swingdemo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class DataSave {
	public static void main(String[] args)
	{
		Unknown obj = new Unknown();
	}
}

class Unknown extends JFrame
{
	JTextField t1,t2;
	JButton b;
	JLabel l;
	
	public Unknown()
	{
		JLabel j = new JLabel("Name :");
		t1 = new JTextField(17);
		JLabel j1 = new JLabel("Roll :");
		t2 = new JTextField(17);
		b = new JButton("Show");
		l = new JLabel("Data");
		
		//ActionListener al = new ActionListener()//Anonymus class
				ActionListener al =( ae->      //Lamda Expression
			{
				String name = t1.getText();
				int roll = Integer.parseInt(t2.getText());
				
				String str = name + String.valueOf(roll);
				
				l.setText(str);
			});
		
		b.addActionListener(al);
		
		add(j);
		add(t1);
		add(j1);
		add(t2);
		add(b);
		add(l);
		
		
		setLayout(new FlowLayout());// FlowLayout,GridLayout,Null
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
}