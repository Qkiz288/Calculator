package com.calculator.buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.DefaultListModel;

import com.calculator.textfields.FormulaTextField;

public class CalculateButton extends CalculatorButton {

  private static final long serialVersionUID = 1L;
  private DefaultListModel<String> resultList;

  public CalculateButton(FormulaTextField formula, String label, DefaultListModel<String> resultList) {
    super(formula, label);
    addActionListener(new CalculateListener());
    setResultList(resultList);
  }

  private void setResultList(DefaultListModel<String> resultList) {
    this.resultList = resultList;
  }

  class CalculateListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent event) {
      ScriptEngineManager manager = new ScriptEngineManager();
      ScriptEngine engine = manager.getEngineByExtension("js");
      String formulaToBeCalculated = formula.getText();
      try {
        Object result = engine.eval(formulaToBeCalculated);
        formula.setText(result.toString());
        resultList.addElement(result.toString());
      } catch (ScriptException e) {
        e.printStackTrace();
        formula.setText("Invalid formula");
      }
    }
  }

}
