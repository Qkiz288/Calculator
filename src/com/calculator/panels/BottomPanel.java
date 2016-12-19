package com.calculator.panels;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

import com.calculator.buttons.CalculatorButton;
import com.calculator.window.Calculator;

public class BottomPanel extends JPanel {

  private static final long serialVersionUID = 1L;
  private CalculatorButton calculate;
  CalculateListener calculateListener = new CalculateListener();

  public BottomPanel() {
    calculate = new CalculatorButton("Calculate");

    setLayout(new GridLayout(1, 2));
    setBackground(Color.BLACK);
    add(calculate);
    setBorder(BorderFactory.createEmptyBorder(5, 10, 10, 10));

    calculate.addActionListener(calculateListener);
  }

  class CalculateListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent event) {
      ScriptEngineManager manager = new ScriptEngineManager();
      ScriptEngine engine = manager.getEngineByExtension("js");
      String formulaToBeCalculated = Calculator.formula.getText();
      try {
        System.out.println(engine.eval(formulaToBeCalculated));
        Object result = engine.eval(formulaToBeCalculated);
        Calculator.formula.setText(result.toString());
      } catch (ScriptException e) {
        e.printStackTrace();
        Calculator.formula.setText("Invalid formula");
      }
    }
  }
}
