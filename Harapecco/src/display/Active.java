package display;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Active extends JFrame{

	public JPanel infoPanel(){

		JLabel label = new JLabel("Harapecco !");

		JPanel InfoPanel = new JPanel();
		InfoPanel.add(label, BorderLayout.WEST);
		return InfoPanel;
	}

	public JPanel activePanel(){
		//
		JPanel TodaysInfo = new JPanel();

		JLabel TodaysDate = new JLabel("X月X日の日記を編集しています...");
		TodaysInfo.add(TodaysDate,BorderLayout.WEST);

		display.Active p = new display.Active();
		//
		JPanel ParsonalEvent = new JPanel();
		ParsonalEvent = p.ParsonalEvent();

		GridBagLayout gbLayout = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		JPanel ActivePanel = new JPanel();

		ActivePanel.setLayout(gbLayout);

		gbc.gridx = 0;
		gbc.gridy = 0;
		gbLayout.setConstraints(TodaysInfo, gbc);

		gbc.gridx = 0;
		gbc.gridy = 1;
		gbLayout.setConstraints(ParsonalEvent, gbc);

		ActivePanel.add(TodaysInfo);
		ActivePanel.add(ParsonalEvent);

		ActivePanel.list();
		//ActivePanel.setBackground(Color.GRAY);

		return ActivePanel;
	}


	//ParsonalEvent
	int ParsonalEventRC = 3;

	JPanel ParsonalEvent(){

		JPanel ParsonalEvent = new JPanel();

		JLabel Sectiontitle = new JLabel("今日の主な出来事");
		JLabel Summary = new JLabel("今日の自分の出来事を書き込む");

		JPanel EntrySheet = new JPanel();

		display.Active es = new display.Active();
		EntrySheet = es.ParsonalEventEntrySheetConstruct(ParsonalEventRC);

		GridBagLayout gbLayout = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();

		ParsonalEvent.setLayout(gbLayout);

		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbLayout.setConstraints(Sectiontitle, gbc);

		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbLayout.setConstraints(Summary, gbc);

		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbLayout.setConstraints(EntrySheet, gbc);

		ParsonalEvent.add(Sectiontitle);
		ParsonalEvent.add(Summary);
		ParsonalEvent.add(EntrySheet);

		return ParsonalEvent;
	}

	JPanel ParsonalEventEntrySheetConstruct(int ParsonalEventRC){

		//-----------1--------------------

		JLabel SheetIndex_1 = new JLabel("1 : ");
		//項
		JTextField Title_1 = new JTextField();
		Title_1.setColumns(15);
		JTextArea EntryBox_1 = new JTextArea("",1,20);
		EntryBox_1.setLineWrap(true);

		GridBagLayout gbLayout = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();

		JPanel minicell_1 = new JPanel();
		minicell_1.setLayout(gbLayout);

		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.insets = new Insets(5, 5, 5, 5);
		gbLayout.setConstraints(SheetIndex_1, gbc);

		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.insets = new Insets(5, 5, 5, 5);
		gbLayout.setConstraints(Title_1, gbc);

		minicell_1.add(SheetIndex_1);
		minicell_1.add(Title_1);

		JPanel cell_1 = new JPanel();
		cell_1.setLayout(gbLayout);

		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.insets = new Insets(5, 5, 5, 5);
		gbLayout.setConstraints(minicell_1, gbc);

		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.insets = new Insets(5, 5, 5, 5);
		gbLayout.setConstraints(EntryBox_1, gbc);

		cell_1.add(minicell_1);
		cell_1.add(EntryBox_1);

		//-----------1--------------------

		JLabel SheetIndex_2 = new JLabel("2 : ");
		//項
		JTextField Title_2 = new JTextField();
		Title_2.setColumns(15);
		JTextArea EntryBox_2 = new JTextArea("",1,20);
		EntryBox_2.setLineWrap(true);

		JPanel minicell_2 = new JPanel();
		minicell_2.setLayout(gbLayout);

		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.insets = new Insets(5, 5, 5, 5);
		gbLayout.setConstraints(SheetIndex_2, gbc);

		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.insets = new Insets(5, 5, 5, 5);
		gbLayout.setConstraints(Title_2, gbc);

		minicell_2.add(SheetIndex_2);
		minicell_2.add(Title_2);

		JPanel cell_2 = new JPanel();
		cell_2.setLayout(gbLayout);

		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.insets = new Insets(5, 5, 5, 5);
		gbLayout.setConstraints(minicell_2, gbc);

		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.insets = new Insets(5, 5, 5, 5);
		gbLayout.setConstraints(EntryBox_2, gbc);

		cell_2.add(minicell_2);
		cell_2.add(EntryBox_2);

		//-----------1--------------------

		JLabel SheetIndex_3 = new JLabel("3 : ");
		//項
		JTextField Title_3 = new JTextField();
		Title_3.setColumns(15);
		JTextArea EntryBox_3 = new JTextArea("",1,20);
		EntryBox_3.setLineWrap(true);

		JPanel minicell_3 = new JPanel();
		minicell_3.setLayout(gbLayout);

		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.insets = new Insets(5, 5, 5, 5);
		gbLayout.setConstraints(SheetIndex_3, gbc);

		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.insets = new Insets(5, 5, 5, 5);
		gbLayout.setConstraints(Title_3, gbc);

		minicell_3.add(SheetIndex_3);
		minicell_3.add(Title_3);

		JPanel cell_3 = new JPanel();
		cell_3.setLayout(gbLayout);

		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.insets = new Insets(5, 5, 5, 5);
		gbLayout.setConstraints(minicell_3, gbc);

		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.insets = new Insets(5, 5, 5, 5);
		gbLayout.setConstraints(EntryBox_3, gbc);

		cell_3.add(minicell_3);
		cell_3.add(EntryBox_3);

		//--------------------------------
		JPanel sheet = new JPanel();
		/*   */
		GridLayout gridLayout = new GridLayout();
		gridLayout.setRows(3);
		sheet.setLayout(gridLayout);

		sheet.add(cell_1);
		sheet.add(cell_2);
		sheet.add(cell_3);

		GridBagLayout sheetlayout = new GridBagLayout();
		GridBagConstraints SheetGbc = new GridBagConstraints();

		sheet.setLayout(sheetlayout);

		SheetGbc.gridx = 0;
		SheetGbc.gridy = 0;
		SheetGbc.anchor = GridBagConstraints.NORTHWEST;
		sheetlayout.setConstraints(cell_1, SheetGbc);

		SheetGbc.gridx = 0;
		SheetGbc.gridy = 1;
		SheetGbc.anchor = GridBagConstraints.NORTHWEST;
		sheetlayout.setConstraints(cell_2, SheetGbc);

		SheetGbc.gridx = 0;
		SheetGbc.gridy = 2;
		SheetGbc.anchor = GridBagConstraints.NORTHWEST;
		sheetlayout.setConstraints(cell_3, SheetGbc);

		return sheet;
	}
}
