package display;


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class RootFrame extends JFrame
					implements ActionListener ,ChangeListener {

	String MainFrame_Title = "Harapecco !";
	int MainFrame_width = 600;
	int MainFrame_height = 600;

	Container makeRootFrame(){

		JFrame RootFrame = new JFrame();
		RootFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		RootFrame.setTitle(MainFrame_Title);
		RootFrame.setSize(MainFrame_width, MainFrame_height);
		RootFrame.setLocationRelativeTo(null);

		display.RootFrame p = new display.RootFrame();

		//JMenuBar
		JMenuBar menuBar = new JMenuBar();
		menuBar = p.setupMenuBar(menuBar);
		RootFrame.setJMenuBar(menuBar);

		Container contentPane = RootFrame.getContentPane();
		contentPane = p.setPane(contentPane);

		RootFrame.setVisible(true);
		return contentPane;
	}

	Container setPane(Container contentPane){

		//JSplitPane
		JSplitPane splitpanel = new JSplitPane();
		contentPane.add(splitpanel,BorderLayout.CENTER);

		JPanel InfoPanel = new JPanel();

		InfoPanel.setMinimumSize(new Dimension(0,0));

		JPanel ActivePanel = new JPanel();
		ActivePanel.setMinimumSize(new Dimension(0,0));

		splitpanel.setLeftComponent(InfoPanel);
		splitpanel.setRightComponent(ActivePanel);
		splitpanel.setDividerLocation(150);

		display.Active a = new display.Active();
		InfoPanel.add(a.infoPanel(), BorderLayout.PAGE_START);
		ActivePanel.add(a.activePanel(), BorderLayout.PAGE_START);

		return contentPane;
	}

	JMenuBar setupMenuBar(JMenuBar menuBar){
		//JMenuBar
		JMenu menuFile = new JMenu("ファイル");
		JMenuItem menuItemOpen = new JMenuItem("開く(開発段階)");
		JMenuItem menuItemExit = new JMenuItem("閉じる");
		JMenu menuSetup = new JMenu("設定");
		JMenuItem menuItemSetup = new JMenuItem("設定");
		JMenuItem menuItemAboutForHarapecco = new JMenuItem("Harapeccoについて");

		menuBar.add(menuFile);
		menuFile.add(menuItemOpen);
		menuFile.add(menuItemExit);
		menuBar.add(menuSetup);
		menuSetup.add(menuItemSetup);
		menuSetup.add(menuItemAboutForHarapecco);
		return menuBar;
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("["+ e.getActionCommand() +"]");
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		/*
		JTabbedPane t = (JTabbedPane)e.getSource();
		if (t.getSelectedComponent() == tree) {
			System.out.println("ツリーマップ");
			} else {
				System.out.println("テーブル");
			}
		*/
		System.out.println("["+ e.getSource() +"]");
		}
}
