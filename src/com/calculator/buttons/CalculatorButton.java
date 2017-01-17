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

  public CalculatorButton(String label) {
    super(label);
    setAppearance(buttonFont, Color.GREEN, buttonSize);
  }

  public CalculatorButton(FormulaTextField formula, String label) {
    super(label);
    setFormula(formula);
    setAppearance(buttonFont, Color.GREEN, buttonSize);
  }

  void setFormula(FormulaTextField formula) {
    this.formula = formula;
  }

  void setAppearance(Font font, Color color, Dimension buttonSize) {
    setFont(font);
    setBackground(color);
    setPreferredSize(buttonSize);
  }

}
