package gui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ViewMusicListGUI extends JPanel {
	MainFrame frame;
	
	public ViewMusicListGUI(MainFrame frame) {
		this.frame = frame;
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Title");
		model.addColumn("Singer");
		model.addColumn("Composer");
		model.addColumn("Released date");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
}
