
import java.awt.FlowLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class ComboBox 
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
		JComboBox c1 = new JComboBox();
		
		DefaultComboBoxModel mod = new DefaultComboBoxModel();
		mod.addElement("Student");
		mod.addElement("Employee");
		mod.addElement("Freelancer");
		mod.addElement("Retired");
	    c1.setModel(mod);
		
		add(l1);
		add(c1);
		
		setLayout(new FlowLayout());// FlowLayout,GridLayout,Null
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}