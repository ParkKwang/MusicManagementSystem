package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.AddMusicGUI;
import gui.MainFrame;

public class AddMusicBListener implements ActionListener{
	MainFrame frame;
	
	public AddMusicBListener(MainFrame frame) {
		this.frame = frame;
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton button1 = (JButton)e.getSource();
		AddMusicGUI addMusic = frame.getAddMusicGUI();
		frame.setTitle("Add Music");
		frame.setupPanel(addMusic);
	}
}
