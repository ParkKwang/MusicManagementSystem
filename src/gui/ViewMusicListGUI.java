package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ViewMusicListGUI extends JFrame {
	public ViewMusicListGUI() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Title");
		model.addColumn("Singer");
		model.addColumn("Composer");
		model.addColumn("Released date");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.setTitle("View Music List");
		this.add(sp);
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
