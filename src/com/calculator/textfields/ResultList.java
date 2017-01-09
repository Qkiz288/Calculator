package com.calculator.textfields;

import java.awt.Color;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

public class ResultList extends JList<String> {

  private static final long serialVersionUID = 1L;
  private final int fontSize = 12;
  private final String fontName = "Helvetica";
  private final Font font = new Font(fontName, Font.BOLD, fontSize);

  public ResultList(DefaultListModel<String> list) {
    super(list);
    setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
    setLayoutOrientation(HORIZONTAL_WRAP);
    setVisibleRowCount(-1);
    setFont(font);
    setBackground(Color.BLACK);
    setForeground(Color.GREEN);

    // JScrollPane scroller = new JScrollPane(this);
    // scroller.setPreferredSize(new Dimension(250, 80));

  }

}
