package com.calculator.buttons;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;

import com.calculator.textfields.FormulaTextField;

public class CalculatorButton extends JButton {

  private static final long serialVersionUID = 1L;
  private final int fontSize = 15;
  private final String fontName = "Helvetica";
  private final Font buttonFont = new Font(fontName, Font.BOLD, fontSize);
  private final Dimension buttonSize = new Dimension(45, 45);
  FormulaTextField formula;

  public CalculatorButton(FormulaTextField formula, String label) {
    super(label);
    setFormula(formula);
    setFont(buttonFont);
    setBackground(Color.GREEN);
    setPreferredSize(buttonSize);
  }

  void setFormula(FormulaTextField formula) {
    this.formula = formula;
  }

}
