package gui;

import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import manager.MusicManager;
import music.MusicInput;

public class ViewMusicListGUI extends JPanel {
	MainFrame frame;
	MusicManager musicManager;
	
	public ViewMusicListGUI(MainFrame frame, MusicManager musicManager) {
		this.frame = frame;
		this.musicManager = musicManager;
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Title");
		model.addColumn("Singer");
		model.addColumn("Composer");
		model.addColumn("Released date");
		
		for (int i = 0; i < musicManager.size(); i++)
		{
			Vector row = new Vector();
			MusicInput mi = musicManager.get(i);
			row.add(mi.getTitle());
			row.add(mi.getSinger());
			row.add(mi.getComposer());
			row.add(mi.getDate3() + "." + mi.getDate2() + "." + mi.getDate1());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
}
