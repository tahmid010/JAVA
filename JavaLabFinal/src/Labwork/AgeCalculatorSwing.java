package Labwork;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class AgeCalculatorSwing {

	public static void main(String[] args) {
		FileClass obj = new FileClass();
	}

}

class FileClass extends JFrame
{
	public FileClass()
	{ 
		JLabel l2 = new JLabel("BirthYear : ");
		JTextField t1 = new JTextField(15);
		JLabel l3 = new JLabel("BirthMonth : ");
		JTextField t2 = new JTextField(15);
		JLabel l4 = new JLabel("BirthDay : ");
		JTextField t3 = new JTextField(15);
		JLabel l5 = new JLabel("Age : ");
		JTextField t4 = new JTextField(15);
		JButton b1 = new JButton("Show Age");
		
		b1.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent ae)
					{
						int year = Integer.parseInt(t1.getText());
						int month = Integer.parseInt(t2.getText());
						int day = Integer.parseInt(t3.getText());
						
						LocalDate current = LocalDate.now();
				        LocalDate born = LocalDate.of(year, month, day);
				        long years = ChronoUnit.YEARS.between(born, current);
				        long months = ChronoUnit.MONTHS.between(born, current);
				        long days = ChronoUnit.DAYS.between(born, current);
				        long n = months%12;
				        int mon = (int)n;
				        
				        l5.setText(String.valueOf(years) + " year " + String.valueOf(mon) + " month");
					}
				});
		
		add(l2);
		add(t1);
		add(l3);
		add(t2);
		add(l4);
		add(t3);
		add(b1);
		add(l5);
		
		
		setLayout(new FlowLayout());// FlowLayout,GridLayout,Null
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}