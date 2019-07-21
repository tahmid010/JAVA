package swingdemo;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FirstGUI {
	public static void main(String[] args)
	{
		ABC obj = new ABC();
		
	}
}

class ABC extends JFrame //by default CardLayout
{
	public ABC()
	{
		setLayout(new FlowLayout());// FlowLayout,GridLayout,Null
		JPanel p1 = new JPanel();
		JLabel l = new JLabel("Hello Swing");
		JTextField t1 = new JTextField("Type here",15);
		JLabel l1 = new JLabel("Welcome to JAVA Swing");
		JLabel l2 = new JLabel("Let's get started");
		JButton b1 = new JButton("Test");
		b1.setBorderPainted(false);
		b1.setToolTipText("click here");
		p1.add(l);	
		p1.add(t1);
		p1.add(l1);
		p1.add(l2);
		p1.add(b1);
		add(p1);
		
		setVisible(true);
		setSize(800,800);
		setLocationRelativeTo(null);
	}
}