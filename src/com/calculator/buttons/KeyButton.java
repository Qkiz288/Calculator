package com.calculator.buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.calculator.textfields.FormulaTextField;

public class KeyButton extends CalculatorButton {

  private static final long serialVersionUID = 1L;

  public KeyButton(FormulaTextField formula, final String label) {
    super(formula, label);
    addActionListener(new CharacterListener());
  }

  public class CharacterListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent event) {
      setFormula(formula);
      String buttonPressed = event.getActionCommand();
      formula.setText(formula.getText() + buttonPressed);
    }
  }
}
