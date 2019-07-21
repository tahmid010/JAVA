package swingdemo;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FirstGUI2 {
	public static void main(String[] args)
	{
		ABC obj = new ABC();
	}
}

class ABC extends JFrame //by default CardLayout
{
	public ABC()
	{
		
		JLabel l = new JLabel("Hello Tahmid");
		JLabel l1 = new JLabel("Welcome to JAVA Swing");
		JLabel l2 = new JLabel("Let's get started");
		
		add(l);
		add(l1);
		add(l2);
		
	    setLayout(new FlowLayout());// FlowLayout,GridLayout,Null
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

