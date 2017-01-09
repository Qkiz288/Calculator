package com.calculator.panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import com.calculator.buttons.ClearButton;
import com.calculator.buttons.KeyButton;
import com.calculator.textfields.FormulaTextField;

public class RightPanel extends JPanel {

  private static final long serialVersionUID = 1L;
  private KeyButton addition, subtraction, multiplication, division, leftParenthesis, rightParenthesis;
  private ClearButton clear;

  public RightPanel(FormulaTextField formula) {
    super();
    addition = new KeyButton(formula, "+");
    subtraction = new KeyButton(formula, "-");
    multiplication = new KeyButton(formula, "*");
    division = new KeyButton(formula, "/");
    clear = new ClearButton(formula, "C");
    leftParenthesis = new KeyButton(formula, "(");
    rightParenthesis = new KeyButton(formula, ")");

    GridLayout rightPanelLayout = new GridLayout(4, 3, 10, 10);

    setLayout(rightPanelLayout);
    setBorder(BorderFactory.createEmptyBorder(10, 5, 5, 10));
    setBackground(Color.BLACK);
    setPreferredSize(new Dimension(150, 200));

    add(clear);
    add(addition);
    add(subtraction);
    add(multiplication);
    add(division);
    add(leftParenthesis);
    add(rightParenthesis);
  }

}
