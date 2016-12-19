package com.calculator.panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import com.calculator.buttons.CalculatorButton;
import com.calculator.buttons.CalculatorButton.CharacterListener;
import com.calculator.window.Calculator;

public class RightPanel extends JPanel {

  private static final long serialVersionUID = 1L;
  private CalculatorButton addition, subtraction, multiplication, division, clear, leftParenthesis, rightParenthesis;
  CalculatorButton button = new CalculatorButton();
  CharacterListener characterListener = button.new CharacterListener();
  ClearListener clearListener = new ClearListener();

  public RightPanel() {
    addition = new CalculatorButton("+");
    subtraction = new CalculatorButton("-");
    multiplication = new CalculatorButton("*");
    division = new CalculatorButton("/");
    clear = new CalculatorButton("C");
    leftParenthesis = new CalculatorButton("(");
    rightParenthesis = new CalculatorButton(")");

    GridLayout rightPanelLayout = new GridLayout(4, 3, 10, 10);

    setLayout(rightPanelLayout);
    setBorder(BorderFactory.createEmptyBorder(10, 5, 5, 10));
    setBackground(Color.BLACK);
    setPreferredSize(new Dimension(150, 200));

    add(clear);
    add(addition);
    add(subtraction);
    add(multiplication);
    add(division);
    add(leftParenthesis);
    add(rightParenthesis);

    addition.addActionListener(characterListener);
    subtraction.addActionListener(characterListener);
    multiplication.addActionListener(characterListener);
    division.addActionListener(characterListener);
    clear.addActionListener(clearListener);
    leftParenthesis.addActionListener(characterListener);
    rightParenthesis.addActionListener(characterListener);
  }

  class ClearListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent event) {
      Calculator.formula.setText("");
    }
  }
}
