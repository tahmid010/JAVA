package swing1;

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

public class SwingFile {

	public static void main(String[] args) {
		FileClass obj = new FileClass();
	}

}

class FileClass extends JFrame
{
	public FileClass()
	{ 
		JLabel l2 = new JLabel("Name : ");
		JTextField t1 = new JTextField(15);
		JLabel l3 = new JLabel("Roll : ");
		JTextField t2 = new JTextField(15);
		JButton b1 = new JButton("Save");
		
		b1.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent ae)
					{
						String s3 = t1.getText();
						String s4 = t2.getText();
						
						String str = s3 + "\n" + s4;
						File f = new File("Data.txt");
						FileOutputStream fos = null;
						try {
							fos = new FileOutputStream(f);
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						DataOutputStream dos = new DataOutputStream(fos);
						
						try {
							dos.writeUTF(str);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}	
					}
				});
		
		add(l2);
		add(t1);
		add(l3);
		add(t2);
		add(b1);
		
		setLayout(new FlowLayout());// FlowLayout,GridLayout,Null
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}