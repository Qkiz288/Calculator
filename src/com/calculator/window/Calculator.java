package com.calculator.window;

import java.awt.BorderLayout;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;

import com.calculator.panels.BottomPanel;
import com.calculator.panels.DigitsPanel;
import com.calculator.panels.LeftPanel;
import com.calculator.panels.RightPanel;
import com.calculator.panels.TopPanel;
import com.calculator.textfields.FormulaTextField;

public class Calculator {

  private JFrame frame;
  private DigitsPanel digitsPanel;
  private TopPanel topPanel;
  private RightPanel rightPanel;
  private BottomPanel bottomPanel;
  private LeftPanel leftPanel;
  public static DefaultListModel<String> list = new DefaultListModel<String>();

  public static FormulaTextField formula;

  public static int topPanelWidth;

  public Calculator() {
    frame = new JFrame();
    digitsPanel = new DigitsPanel();
    rightPanel = new RightPanel();
    bottomPanel = new BottomPanel();
    topPanel = new TopPanel();

    leftPanel = new LeftPanel();

    frame.getContentPane().add(BorderLayout.CENTER, digitsPanel);
    frame.getContentPane().add(BorderLayout.NORTH, topPanel);
    frame.getContentPane().add(BorderLayout.EAST, rightPanel);
    frame.getContentPane().add(BorderLayout.SOUTH, bottomPanel);
    frame.getContentPane().add(BorderLayout.WEST, leftPanel);
    frame.pack();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("Calculator");
    frame.setResizable(false);

    topPanelWidth = topPanel.getWidth();
    formula = new FormulaTextField();
    topPanel.add(formula);

    System.out.println(topPanelWidth);
  }

  public int getFrameWidth() {
    return frame.getWidth();
  }

}