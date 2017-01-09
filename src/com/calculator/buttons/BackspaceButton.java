package com.calculator.buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.calculator.textfields.FormulaTextField;

public class BackspaceButton extends CalculatorButton {

  private static final long serialVersionUID = 1L;

  public BackspaceButton(FormulaTextField formula, final String label) {
    super(formula, label);
    addActionListener(new BackspaceListener());

  }

  class BackspaceListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent event) {
      try {
        String formulaString = formula.getText();
        String updatedFormula = formulaString.substring(0, formulaString.length() - 1);
        formula.setText(updatedFormula);
      } catch (StringIndexOutOfBoundsException e) {
        e.printStackTrace();
      }
    }
  }

}
