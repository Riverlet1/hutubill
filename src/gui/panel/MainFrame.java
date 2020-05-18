package gui.panel;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	public static MainFrame instance = new MainFrame();
	
	private MainFrame() {
		//��������
		this.setSize(500,500);
		this.setTitle("һ����Ϳ��wk");
		this.setContentPane(MainPanel.instance);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
