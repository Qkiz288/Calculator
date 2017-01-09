package com.calculator.window;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JScrollPane;

import com.calculator.textfields.ResultList;

public class ResultScrollPane extends JScrollPane {

  private static final long serialVersionUID = 1L;

  public ResultScrollPane(ResultList list) {
    super(list);
    setPreferredSize(new Dimension(125, 175));
    createVerticalScrollBar();
    createHorizontalScrollBar();
    getVerticalScrollBar().setBackground(Color.BLACK);
  }
}
