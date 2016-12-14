package com.calculator.window;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class CalculatorButton extends JButton {

  private static final long serialVersionUID = 1L;
  private final int fontSize = 18;
  private final String fontName = "Helvetica";
  private final Font buttonFont = new Font(fontName, Font.BOLD, fontSize);

  public CalculatorButton(final String label) {

    super(label);
    setFont(buttonFont);
    setBackground(Color.GREEN);
    setAlignmentX(40);
  }
}
