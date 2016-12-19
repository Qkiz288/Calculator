package com.calculator.panels;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import com.calculator.buttons.CalculatorButton;
import com.calculator.buttons.CalculatorButton.CharacterListener;
import com.calculator.window.Calculator;

public class DigitsPanel extends JPanel {

  private static final long serialVersionUID = 1L;
  private CalculatorButton btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0, dot, backspace;

  CalculatorButton button = new CalculatorButton();
  CharacterListener characterListener = button.new CharacterListener();
  BackspaceListener backspaceListener = new BackspaceListener();

  public DigitsPanel() {
    btn_1 = new CalculatorButton("1");
    btn_2 = new CalculatorButton("2");
    btn_3 = new CalculatorButton("3");
    btn_4 = new CalculatorButton("4");
    btn_5 = new CalculatorButton("5");
    btn_6 = new CalculatorButton("6");
    btn_7 = new CalculatorButton("7");
    btn_8 = new CalculatorButton("8");
    btn_9 = new CalculatorButton("9");
    btn_0 = new CalculatorButton("0");
    dot = new CalculatorButton(".");
    backspace = new CalculatorButton("<-");

    GridLayout digitsPanelLayout = new GridLayout(4, 5, 10, 10);

    setLayout(digitsPanelLayout);
    setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 5));
    setBackground(Color.BLACK);

    add(btn_1);
    add(btn_2);
    add(btn_3);
    add(btn_4);
    add(btn_5);
    add(btn_6);
    add(btn_7);
    add(btn_8);
    add(btn_9);
    add(btn_0);
    add(dot);
    add(backspace);

    btn_1.addActionListener(characterListener);
    btn_2.addActionListener(characterListener);
    btn_3.addActionListener(characterListener);
    btn_4.addActionListener(characterListener);
    btn_5.addActionListener(characterListener);
    btn_6.addActionListener(characterListener);
    btn_7.addActionListener(characterListener);
    btn_8.addActionListener(characterListener);
    btn_9.addActionListener(characterListener);
    btn_0.addActionListener(characterListener);
    dot.addActionListener(characterListener);
    backspace.addActionListener(backspaceListener);
  }

  class BackspaceListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent event) {
      try {
        String formulaString = Calculator.formula.getText();
        String updatedFormula = formulaString.substring(0, formulaString.length() - 1);
        Calculator.formula.setText(updatedFormula);
      } catch (StringIndexOutOfBoundsException e) {
        e.printStackTrace();
      }
    }
  }

}
