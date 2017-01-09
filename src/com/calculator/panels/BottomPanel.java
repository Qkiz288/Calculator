package com.calculator.panels;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JPanel;

import com.calculator.buttons.CalculateButton;
import com.calculator.textfields.FormulaTextField;

public class BottomPanel extends JPanel {

  private static final long serialVersionUID = 1L;
  private CalculateButton calculate;

  public BottomPanel(FormulaTextField formula, DefaultListModel<String> resultList) {
    super();
    calculate = new CalculateButton(formula, "Calculate", resultList);

    setLayout(new GridLayout(1, 2));
    setBackground(Color.BLACK);
    add(calculate);
    setBorder(BorderFactory.createEmptyBorder(5, 10, 10, 10));

  }

}
