package display;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

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
		TodaysInfo.add(TodaysDate,BorderLayout.NORTH);

		display.Active p = new display.Active();
		//
		JPanel ParsonalEvent = new JPanel();
		ParsonalEvent = p.ParsonalEvent();

		SpringLayout ActivePanelLayout = new SpringLayout();
		JPanel ActivePanel = new JPanel();

		ActivePanel.setLayout(ActivePanelLayout);

		ActivePanelLayout.putConstraint(SpringLayout.NORTH, TodaysInfo, 10, SpringLayout.NORTH, ActivePanel);
		ActivePanelLayout.putConstraint(SpringLayout.WEST, TodaysInfo, 10, SpringLayout.WEST, ActivePanel);
		ActivePanelLayout.putConstraint(SpringLayout.NORTH, ParsonalEvent, 0, SpringLayout.SOUTH, ActivePanel);
		ActivePanelLayout.putConstraint(SpringLayout.WEST, ParsonalEvent, 0, SpringLayout.WEST, ActivePanel);


		ActivePanel.add(TodaysInfo);
		ActivePanel.add(ParsonalEvent);


		ActivePanel.list();
		ActivePanel.setBackground(Color.blue);
		//SpringLayoutにすると表示されなくなる…どうして？

		return ActivePanel;
	}


	//ParsonalEvent
	int ParsonalEventRC = 3;

	JPanel ParsonalEvent(){
		JPanel ParsonalEvent = new JPanel();
		//
		SpringLayout ParsonalEventLayout = new SpringLayout();
		ParsonalEvent.setLayout(ParsonalEventLayout);

		JLabel Sectiontitle = new JLabel("今日の主な出来事");
		JLabel Summary = new JLabel("今日の自分の出来事を書き込む");

		JPanel EntrySheet = new JPanel();

		display.Active es = new display.Active();
		EntrySheet = es.ParsonalEventEntrySheetConstruct(ParsonalEventRC);

		ParsonalEventLayout.putConstraint(SpringLayout.NORTH, Sectiontitle, 5, SpringLayout.NORTH, ParsonalEvent);
		ParsonalEventLayout.putConstraint(SpringLayout.WEST, Sectiontitle, 5, SpringLayout.WEST, ParsonalEvent);
		ParsonalEventLayout.putConstraint(SpringLayout.NORTH, Summary, 5, SpringLayout.SOUTH, Sectiontitle);
		ParsonalEventLayout.putConstraint(SpringLayout.WEST, Summary, 20, SpringLayout.WEST, ParsonalEvent);
		ParsonalEventLayout.putConstraint(SpringLayout.NORTH, EntrySheet, 5, SpringLayout.SOUTH, Summary);
		ParsonalEventLayout.putConstraint(SpringLayout.WEST, EntrySheet, 20, SpringLayout.WEST, Summary);

		ParsonalEvent.add(Sectiontitle);
		ParsonalEvent.add(Summary);
		ParsonalEvent.add(EntrySheet);

		return ParsonalEvent;
	}

	JPanel ParsonalEventEntrySheetConstruct(int ParsonalEventRC){

		//-----------1--------------------
		JPanel cell_1 = new JPanel();
		SpringLayout layout_1 = new SpringLayout();
		cell_1.setLayout(layout_1);

		JLabel SheetIndex_1 = new JLabel("1:");
		//項
		JTextField Title_1 = new JTextField();
		JTextArea EntryBox_1 = new JTextArea("",1,20);
		EntryBox_1.setLineWrap(true);

		layout_1.putConstraint(SpringLayout.NORTH, SheetIndex_1, 0, SpringLayout.NORTH, cell_1);
		layout_1.putConstraint(SpringLayout.WEST, SheetIndex_1, 0, SpringLayout.WEST, cell_1);
		layout_1.putConstraint(SpringLayout.NORTH, Title_1, 0, SpringLayout.NORTH, SheetIndex_1);
		layout_1.putConstraint(SpringLayout.WEST, Title_1, 0, SpringLayout.WEST, SheetIndex_1);
		layout_1.putConstraint(SpringLayout.NORTH, EntryBox_1, 5, SpringLayout.SOUTH, Title_1);
		layout_1.putConstraint(SpringLayout.WEST, EntryBox_1, 20, SpringLayout.WEST, cell_1);

		cell_1.add(SheetIndex_1);
		cell_1.add(Title_1);
		cell_1.add(EntryBox_1);

		//-----------2--------------------
		JPanel cell_2 = new JPanel();
		SpringLayout layout_2 = new SpringLayout();
		cell_2.setLayout(layout_2);

		JLabel SheetIndex_2 = new JLabel("2:");
		//項
		JTextField Title_2 = new JTextField();
		JTextArea EntryBox_2 = new JTextArea("",1,20);
		EntryBox_2.setLineWrap(true);

		layout_2.putConstraint(SpringLayout.NORTH, SheetIndex_2, 0, SpringLayout.NORTH, cell_2);
		layout_2.putConstraint(SpringLayout.WEST, SheetIndex_2, 0, SpringLayout.WEST, cell_2);
		layout_2.putConstraint(SpringLayout.NORTH, Title_2, 0, SpringLayout.NORTH, SheetIndex_2);
		layout_2.putConstraint(SpringLayout.WEST, Title_2, 0, SpringLayout.WEST, SheetIndex_2);
		layout_2.putConstraint(SpringLayout.NORTH, EntryBox_2, 5, SpringLayout.SOUTH, Title_2);
		layout_2.putConstraint(SpringLayout.WEST, EntryBox_2, 20, SpringLayout.WEST, cell_2);

		cell_2.add(SheetIndex_2);
		cell_2.add(Title_2);
		cell_2.add(EntryBox_2);

		//-----------3--------------------
		JPanel cell_3 = new JPanel();
		SpringLayout layout_3 = new SpringLayout();
		cell_3.setLayout(layout_3);

		JLabel SheetIndex_3 = new JLabel("3:");
		//項
		JTextField Title_3 = new JTextField();
		JTextArea EntryBox_3 = new JTextArea("",1,20);
		EntryBox_3.setLineWrap(true);

		layout_3.putConstraint(SpringLayout.NORTH, SheetIndex_3, 0, SpringLayout.NORTH, cell_3);
		layout_3.putConstraint(SpringLayout.WEST, SheetIndex_3, 0, SpringLayout.WEST, cell_3);
		layout_3.putConstraint(SpringLayout.NORTH, Title_3, 0, SpringLayout.NORTH, SheetIndex_3);
		layout_3.putConstraint(SpringLayout.WEST, Title_3, 0, SpringLayout.WEST, SheetIndex_3);
		layout_3.putConstraint(SpringLayout.NORTH, EntryBox_3, 5, SpringLayout.SOUTH, Title_3);
		layout_3.putConstraint(SpringLayout.WEST, EntryBox_3, 20, SpringLayout.WEST, cell_3);

		cell_3.add(SheetIndex_3);
		cell_3.add(Title_3);
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
		/*
		SpringLayout sheetlayout = new SpringLayout();
		sheet.setLayout(sheetlayout);

		sheetlayout.putConstraint(SpringLayout.NORTH, cell_1, 0, SpringLayout.NORTH, sheet);
		sheetlayout.putConstraint(SpringLayout.WEST, cell_1, 0, SpringLayout.WEST, sheet);
		sheetlayout.putConstraint(SpringLayout.NORTH, cell_2, 0, SpringLayout.NORTH, cell_2);
		sheetlayout.putConstraint(SpringLayout.WEST, cell_2, 0, SpringLayout.WEST, sheet);
		sheetlayout.putConstraint(SpringLayout.NORTH, cell_3, 0, SpringLayout.NORTH, cell_3);
		sheetlayout.putConstraint(SpringLayout.WEST, cell_3, 0, SpringLayout.WEST, sheet);

		*/
		return sheet;
	}
}
