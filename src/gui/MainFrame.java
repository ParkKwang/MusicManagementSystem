package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.MusicManager;

public class MainFrame extends JFrame {
	MusicManager musicManager;
	MenuSelection menuSelection;
	AddMusicGUI addMusicGUI;
	ViewMusicListGUI viewMusicListGUI;
	
	public MainFrame(MusicManager musicManager) {
		this.musicManager = musicManager;
		this.menuSelection = new MenuSelection(this);
		this.addMusicGUI = new AddMusicGUI(this);
		this.viewMusicListGUI = new ViewMusicListGUI(this, this.musicManager);
		
		this.setTitle("Menu Selection");
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setupPanel(menuSelection);
		
		this.setVisible(true);
	}
	
	public MenuSelection getMenuSelection() {
		return menuSelection;
	}

	public void setMenuSelection(MenuSelection menuSelection) {
		this.menuSelection = menuSelection;
	}

	public AddMusicGUI getAddMusicGUI() {
		return addMusicGUI;
	}

	public void setAddMusicGUI(AddMusicGUI addMusicGUI) {
		this.addMusicGUI = addMusicGUI;
	}

	public ViewMusicListGUI getViewMusicListGUI() {
		return viewMusicListGUI;
	}

	public void setViewMusicListGUI(ViewMusicListGUI viewMusicListGUI) {
		this.viewMusicListGUI = viewMusicListGUI;
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
}
