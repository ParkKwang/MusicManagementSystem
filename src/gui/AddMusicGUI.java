package gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class AddMusicGUI extends JPanel {
	MainFrame frame;
	
	public AddMusicGUI(MainFrame frame) {
		this.frame = frame;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel label1 = new JLabel("Title: ", JLabel.TRAILING);
		JTextField field1 = new JTextField(10);
		label1.setLabelFor(field1);
		panel.add(label1);
		panel.add(field1);
		
		JLabel label2 = new JLabel("Singer: ", JLabel.TRAILING);
		JTextField field2 = new JTextField(10);
		label2.setLabelFor(field2);
		panel.add(label2);
		panel.add(field2);
		
		JLabel label3 = new JLabel("Composer: ", JLabel.TRAILING);
		JTextField field3 = new JTextField(10);
		label3.setLabelFor(field3);
		panel.add(label3);
		panel.add(field3);
		
		JLabel label4 = new JLabel("Released day: ", JLabel.TRAILING);
		JTextField field4 = new JTextField(10);
		label4.setLabelFor(field4);
		panel.add(label4);
		panel.add(field4);
		
		JLabel label5 = new JLabel("Released month: ", JLabel.TRAILING);
		JTextField field5 = new JTextField(10);
		label5.setLabelFor(field5);
		panel.add(label5);
		panel.add(field5);
		
		JLabel label6 = new JLabel("Released year: ", JLabel.TRAILING);
		JTextField field6 = new JTextField(10);
		label6.setLabelFor(field6);
		panel.add(label6);
		panel.add(field6);
		
		JButton button1 = new JButton("save");
		JButton button2 = new JButton("cancel");
		panel.add(button1);
		panel.add(button2);
		
		SpringUtilities.makeCompactGrid(panel, 7, 2, 6, 6, 6, 6);
		
		this.add(panel);
	}
}
