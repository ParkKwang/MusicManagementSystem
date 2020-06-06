package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.MainFrame;
import gui.ViewMusicListGUI;

public class ViewMusicBListener implements ActionListener {
	MainFrame frame;
	
	public ViewMusicBListener(MainFrame frame) {
		this.frame = frame;
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton button1 = (JButton)e.getSource();
		ViewMusicListGUI viewMusicList = frame.getViewMusicListGUI();
		frame.setTitle("View Music List");
		frame.setupPanel(viewMusicList);
	}
}
