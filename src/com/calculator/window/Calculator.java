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
  private DefaultListModel<String> defaultResultList = new DefaultListModel<String>();

  private FormulaTextField formula;

  public Calculator() {
    frame = new JFrame();

    formula = new FormulaTextField();
    digitsPanel = new DigitsPanel(formula);
    rightPanel = new RightPanel(formula);
    bottomPanel = new BottomPanel(formula, defaultResultList);
    topPanel = new TopPanel();

    leftPanel = new LeftPanel(formula, defaultResultList);

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

    topPanel.add(formula);
  }

}