package com.calculator.buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.calculator.textfields.FormulaTextField;

public class ClearButton extends CalculatorButton {

  private static final long serialVersionUID = 1L;

  public ClearButton(FormulaTextField formula, String label) {
    super(formula, label);
    addActionListener(new ClearListener());
  }

  class ClearListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent event) {
      formula.setText("");
    }
  }

}
