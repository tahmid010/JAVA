package project01;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class DocClass {
	public static void main(String[] args) throws Exception
	{
		Unknown obj = new Unknown();
	}
}

class Unknown extends JFrame 
{
	JTextField t1,t2,t3,t4,t5,t6;
	JButton b;
	JRadioButton r1,r2;
	
	public Unknown() throws Exception
	{
		JLabel j1 = new JLabel("Name    :");
		t1 = new JTextField(17);
		JLabel j2 = new JLabel("Roll    :");
		t2 = new JTextField(17);
		JLabel j3 = new JLabel("Dept.   :");
		t3 = new JTextField(17);
		JLabel j4 = new JLabel("Session :");
		t4 = new JTextField(17);
		JLabel j5 = new JLabel("Year    :");
		t5 = new JTextField(17);
		JLabel j6 = new JLabel("Semister:");
		t6 = new JTextField(17);
		JLabel j7 = new JLabel("Gender :");
		r1 = new JRadioButton("Male");
		r2 = new JRadioButton("Female");
		
		b = new JButton("Save");
		//b.setBorder();
		JLabel j8 = new JLabel(" ");
		
		j1.setBounds(50,50,100,20);
		t1.setBounds(120,50,150,20);
		j2.setBounds(50,75,100,20);
		t2.setBounds(120,75,150,20);
		j3.setBounds(50,100,100,20);
		t3.setBounds(120,100,150,20);
		j4.setBounds(50,125,100,20);
		t4.setBounds(120,125,150,20);
		j5.setBounds(50,150,100,20);
		t5.setBounds(120,150,150,20);
		j6.setBounds(50,175,150,20);
		t6.setBounds(120,175,150,20);
		j7.setBounds(50,200,150,20);
		r1.setBounds(120,200,150,20);
		r2.setBounds(160,200,150,20);
		
		b.setBounds(150,225,75,20);
		j7.setBounds(140,250,200,20);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		ActionListener al = new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)	        
			{
				String name = t1.getText();
				int roll = Integer.parseInt(t2.getText());
				String dept = t3.getText();
				String sess = t4.getText();
				String yr = t5.getText();
				String sem = t6.getText();

				String str = name + "\n" + String.valueOf(roll) + "\n" + dept + "\n" + sess + "\n" + yr + "\n" + sem;
				File f = new File("document2.txt");
				FileOutputStream fos = null;
				try {
					fos = new FileOutputStream(f);
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
				DataOutputStream dos = new DataOutputStream(fos);
				try {
					dos.writeUTF(str);
				} catch (IOException e) {
					e.printStackTrace();
				}
				j8.setText("Data Save is Successfull");
			}	
		};
		
		b.addActionListener(al);
		
		add(j1);
		add(t1);
		add(j2);
		add(t2);
		add(j3);
		add(t3);
		add(j4);
		add(t4);
		add(j5);
		add(t5);
		add(j6);
		add(t6);
		add(j7);
		add(r1);
		add(r2);
		add(b);
		add(j8);
		
		setLayout( null);
		setVisible(true);
		setLocationRelativeTo(null);
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
	
}