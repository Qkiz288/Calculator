package com.calculator.textfields;

import java.awt.Color;
import java.awt.Font;
import java.io.Serializable;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

public class ResultList extends JList<String> implements Serializable {

  private static final long serialVersionUID = 1L;
  private final int fontSize = 12;
  private final String fontName = "Helvetica";
  private final Font font = new Font(fontName, Font.BOLD, fontSize);
  private DefaultListModel<String> resultList = new DefaultListModel<String>();

  public ResultList(DefaultListModel<String> list) {
    super(list);
    setDefaultListModel(list);
    setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
    setLayoutOrientation(HORIZONTAL_WRAP);
    setVisibleRowCount(-1);
    setFont(font);
    setBackground(Color.BLACK);
    setForeground(Color.GREEN);
  }

  private void setDefaultListModel(DefaultListModel<String> list) {
    resultList = list;
  }

  public DefaultListModel<String> getDefaultListModel() {
    return resultList;
  }
}
