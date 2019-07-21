package swingdemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddGUI {
    public static void main(String[] args) {
		Addition obj = new Addition();
	}
}

class Addition extends JFrame implements ActionListener
{
	JTextField f1,f2;
	JButton b;
	JLabel l1;
	
	public Addition()
	{
		
		f1 = new JTextField(15);
		f2 = new JTextField(15);
		b = new JButton("OK");
		l1 = new JLabel("Result");
		
		b.addActionListener(this);
		
		add(f1);
		add(f2);
		add(b);
		add(l1);
		
		setLayout(new FlowLayout());// FlowLayout,GridLayout,Null
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		int num1 = Integer.parseInt(f1.getText());
		int num2 = Integer.parseInt(f2.getText());
		int value = num1 + num2;
		
		l1.setText(value + "");
	}
}