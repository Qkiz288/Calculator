package com.calculator.textfields;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.calculator.window.Calculator;

public class FormulaTextField extends JTextField {

  private static final long serialVersionUID = 1L;
  private final int fontSize = 18;
  private final Dimension textFieldSize = new Dimension(Calculator.topPanelWidth, 35);
  private final String fontName = "Helvetica";
  private final Font font = new Font(fontName, Font.BOLD, fontSize);

  public FormulaTextField() {
    setBackground(Color.GREEN);
    setFont(font);
    setPreferredSize(textFieldSize);
    setHorizontalAlignment(SwingConstants.CENTER);
    setFocusable(false);
  }

}
