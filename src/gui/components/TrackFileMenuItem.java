package gui.components;

import gui.GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JMenuItem;
import javax.swing.border.Border;

public class TrackFileMenuItem extends JMenuItem implements ActionListener {
	private static final long serialVersionUID = 5717623182741787772L;
	private Color textGray = GUI.TEXT_GRAY;
	private Color borderGray = GUI.BORDER_GRAY;
	private Frame parent;

	public TrackFileMenuItem(Frame parent, Dimension size) {
		super("Add file");
		this.parent = parent;
		setBackground(Color.white);
		setBorder(BorderFactory.createEmptyBorder());
		setForeground(textGray);
		setBorder(BorderFactory.createEmptyBorder(5, 26, 5, 26));
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		FileDialog dialog = new FileDialog(parent, "Add file");
		dialog.setEnabled(true);
		dialog.setVisible(true);
	}
}