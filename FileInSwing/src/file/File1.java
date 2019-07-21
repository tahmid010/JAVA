package file;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File1 {

	public static void main(String[] args) {
		SaveData obj = new SaveData();

	}

}

class SaveData extends JFrame
{
	public SaveData()
	{
		JLabel l1 = new JLabel("Name : ");
		JTextField j1 = new JTextField(10);
		JLabel l2 = new JLabel("Gender : ");
		JTextField j2 = new JTextField(10);
		JLabel l3 = new JLabel("Occupation : ");
		JTextField j3 = new JTextField(10);
		JLabel l4 = new JLabel("Institution : ");
		JTextField j4 = new JTextField(10);
		JLabel l5 = new JLabel("Dept. : ");
		JTextField j5 = new JTextField(10);
		JLabel l6 = new JLabel("Blood : ");
		JTextField j6 = new JTextField(10);
		//JLabel l7 = new JLabel("Mob No. : ");
	    //JTextField j7 = new JTextField(10);
		JButton b1 = new JButton("Save");
		JLabel l8 = new JLabel("");
		
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				String str1 = j1.getText();
				String str2 = j2.getText();
				String str3 = j3.getText();
				String str4 = j4.getText();
				String str5 = j5.getText();
				String str6 = j6.getText();
				//double num = Double.parseDouble(l7.getText());
				
				String strx = "Name : " + str1 + "\n" + "Gender :" + str2 + "\n" + "Occupation : " + str3 + "\n" + "Institution : " + str4 + "\n" + "Dept. :" + str5 +  "\n" + "Blood : " + str6 + "\n";
				
				File f = new File("Document.txt");
				FileOutputStream fos = null;
				try {
					fos = new FileOutputStream(f);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				DataOutputStream dos = new DataOutputStream(fos);
				try {
					dos.writeUTF(strx);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				l8.setText("Data Save is Successfull!");
			}
		});
		
		add(l1);
		add(j1);
		add(l2);
		add(j2);
		add(l3);
		add(j3);
		add(l4);
		add(j4);
		add(l5);
		add(j5);
		add(l6);
		add(j6);
		//add(l7);
		//add(j7);
		add(b1);
		add(l8);
	
		setLayout(new FlowLayout());// FlowLayout,GridLayout,Null
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}