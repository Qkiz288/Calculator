package com.calculator.buttons;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.calculator.window.Calculator;

public class CalculatorButton extends JButton {

  private static final long serialVersionUID = 1L;
  private final int fontSize = 15;
  private final String fontName = "Helvetica";
  private final Font buttonFont = new Font(fontName, Font.BOLD, fontSize);
  private final Dimension buttonSize = new Dimension(45, 45);

  public CalculatorButton() {

  }

  public CalculatorButton(final String label) {

    super(label);
    setFont(buttonFont);
    setBackground(Color.GREEN);
    setPreferredSize(buttonSize);
  }

  public class CharacterListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent event) {

      String buttonPressed = event.getActionCommand();
      Calculator.formula.setText(Calculator.formula.getText() + buttonPressed);
    }
  }
}
