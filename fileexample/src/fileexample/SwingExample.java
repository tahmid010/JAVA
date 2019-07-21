package fileexample;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingExample 
{
	public static void main(String[] args) {
		SwingExample obj = new SwingExample();
	}
}

class SwingDemo extends JFrame
{
	public SwingDemo()
	{
		JLabel l1 = new JLabel ("Hello Swing");
		
		add(l1);
		
		setLayout(new FlowLayout());// FlowLayout,GridLayout,Null
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}