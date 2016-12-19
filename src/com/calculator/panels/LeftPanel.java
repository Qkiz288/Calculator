package com.calculator.panels;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import com.calculator.textfields.ResultList;
import com.calculator.window.Calculator;

public class LeftPanel extends JPanel {

  private static final long serialVersionUID = 1L;

  public LeftPanel() {
    // BoxLayout leftPanelLayout = new BoxLayout();

    // setLayout(leftPanelLayout);
    setBorder(BorderFactory.createEmptyBorder(10, 5, 5, 10));
    setBackground(Color.BLACK);
    setPreferredSize(new Dimension(150, 200));

    // DefaultListModel<String> list = new DefaultListModel<String>();

    Calculator.list.addElement("Test3");
    ResultList resultList = new ResultList(Calculator.list);
    this.add(resultList);
  }
}
