package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listeners.AddMusicBListener;
import listeners.ViewMusicBListener;

public class MenuSelection extends JPanel {
	MainFrame frame;
	
	public MenuSelection(MainFrame frame) {
		this.frame = frame;
		this.setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label1 = new JLabel("Menu Selection");
		JButton button1 = new JButton("Add Music");
		JButton button2 = new JButton("Delete Music");
		JButton button3 = new JButton("Edit Music");
		JButton button4 = new JButton("View Music List");
		JButton button5 = new JButton("Exit");
		
		button1.addActionListener(new AddMusicBListener(frame));
		button4.addActionListener(new ViewMusicBListener(frame));
		
		panel1.add(label1);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
	}
}
