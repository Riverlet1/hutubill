package gui.panel;

import javax.swing.JButton;
import gui.listener.BackupListener;
import util.ColorUtil;
import util.GUIUtil;

public class BackupPanel extends WorkingPanel{
	private static final long serialVersionUID = 1L;
	
	static {
		GUIUtil.useLNF();
	}
	
	public static BackupPanel instance = new BackupPanel();
	
	JButton bBackup = new JButton("Backup");
	
	private BackupPanel() {
		GUIUtil.setColor(ColorUtil.blueColor, bBackup);
		this.add(bBackup);
		addListener();
	}

	@Override
	public void updateData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addListener() {
		BackupListener listener = new BackupListener();
		bBackup.addActionListener(listener);
		
	}
	
	public static void main(String[] args){
		GUIUtil.showPanel(BackupPanel.instance);
	}
}
