package calculator;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator {
	public static void main(String[] args) {
		DataClass obj = new DataClass();
	}
}

class DataClass extends JFrame
{
	public DataClass()
	{
		JLabel j1 = new JLabel("Enter First Number : ");
		JTextField t1 = new JTextField(16);
		JLabel j2 = new JLabel("Enter Second Number : ");
		JTextField t2 = new JTextField(16);
		JButton b1 = new JButton("Add");
		JButton b2 = new JButton("Sub");
		JButton b3 = new JButton("Multi");
		JButton b4 = new JButton("Div");
		JLabel j3 = new JLabel("Result : ");
		
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				double num1 = Double.parseDouble(t1.getText());
				double num2 = Double.parseDouble(t2.getText());
				double value = num1 + num2;
				j3.setText(value + "");
			}
		});
		
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				double num1 = Double.parseDouble(t1.getText());
				double num2 = Double.parseDouble(t2.getText());
				double value = num1 - num2;
				j3.setText(value + "");
			}
		});
		
		b3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				double num1 = Double.parseDouble(t1.getText());
				double num2 = Double.parseDouble(t2.getText());
				double value = num1 * num2;
				j3.setText(value + "");
			}
		});
		
		b4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				double num1 = Double.parseDouble(t1.getText());
				double num2 = Double.parseDouble(t2.getText());
				double value = num1 / num2;
				j3.setText(value + "");
			}
		});
		
		add(j1);
		add(t1);
		add(j2);
		add(t2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(j3);
		
		setLayout(new FlowLayout());// FlowLayout,GridLayout,Null
		setVisible(true);
		setSize(350, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}