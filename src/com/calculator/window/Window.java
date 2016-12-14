package com.calculator.window;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window {

  JFrame frame;
  CalculatorButton btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0, addition, subtraction, multiplication,
      division, calculate, dot, backspace, clear;
  JPanel digitsPanel, topPanel, rightPanel, bottomPanel;
  FormulaLabel formula;

  Dimension frameSize = new Dimension(400, 400);;

  public void setUpWindow() {
    frame = new JFrame();
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
    addition = new CalculatorButton("+");
    subtraction = new CalculatorButton("-");
    multiplication = new CalculatorButton("*");
    division = new CalculatorButton("/");
    dot = new CalculatorButton(".");
    backspace = new CalculatorButton("<-");
    calculate = new CalculatorButton("Calculate");
    clear = new CalculatorButton("Clear");
    formula = new FormulaLabel("");

    topPanel = new JPanel();
    topPanel.add(formula);
    topPanel.setBackground(Color.BLACK);
    topPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

    GridLayout digitsPanelLayout = new GridLayout(4, 3);
    digitsPanelLayout.setVgap(10);
    digitsPanelLayout.setHgap(10);
    digitsPanel = new JPanel();
    digitsPanel.setLayout(digitsPanelLayout);
    digitsPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    digitsPanel.setBackground(Color.BLACK);
    digitsPanel.add(btn_1);
    digitsPanel.add(btn_2);
    digitsPanel.add(btn_3);
    digitsPanel.add(btn_4);
    digitsPanel.add(btn_5);
    digitsPanel.add(btn_6);
    digitsPanel.add(btn_7);
    digitsPanel.add(btn_8);
    digitsPanel.add(btn_9);
    digitsPanel.add(btn_0);
    digitsPanel.add(dot);
    digitsPanel.add(backspace);

    GridLayout rightPanelLayout = new GridLayout(4, 3);
    rightPanelLayout.setVgap(10);
    rightPanelLayout.setHgap(10);
    rightPanel = new JPanel();
    rightPanel.setLayout(rightPanelLayout);
    rightPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    rightPanel.setBackground(Color.BLACK);
    rightPanel.add(clear);
    rightPanel.add(addition);
    rightPanel.add(subtraction);
    rightPanel.add(multiplication);
    rightPanel.add(division);

    bottomPanel = new JPanel();
    bottomPanel.setLayout(new GridLayout(1, 2));
    bottomPanel.setBackground(Color.BLACK);
    bottomPanel.add(calculate);
    bottomPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

    btn_1.addActionListener(new CharacterListener());
    btn_2.addActionListener(new CharacterListener());
    btn_3.addActionListener(new CharacterListener());
    btn_4.addActionListener(new CharacterListener());
    btn_5.addActionListener(new CharacterListener());
    btn_6.addActionListener(new CharacterListener());
    btn_7.addActionListener(new CharacterListener());
    btn_8.addActionListener(new CharacterListener());
    btn_9.addActionListener(new CharacterListener());
    btn_0.addActionListener(new CharacterListener());
    addition.addActionListener(new CharacterListener());
    subtraction.addActionListener(new CharacterListener());
    multiplication.addActionListener(new CharacterListener());
    division.addActionListener(new CharacterListener());
    dot.addActionListener(new CharacterListener());
    backspace.addActionListener(new BackspaceListener());
    calculate.addActionListener(new CalculateListener());
    clear.addActionListener(new ClearListener());

    frame.getContentPane().add(BorderLayout.CENTER, digitsPanel);
    frame.getContentPane().add(BorderLayout.NORTH, topPanel);
    frame.getContentPane().add(BorderLayout.EAST, rightPanel);
    frame.getContentPane().add(BorderLayout.SOUTH, bottomPanel);
    frame.setSize(frameSize);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("Calculator");
    // frame.setResizable(false);

  }

  class CharacterListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent event) {

      String buttonPressed = event.getActionCommand();
      System.out.println(buttonPressed);
      formula.setText(formula.getText() + buttonPressed);
    }
  }

  class CalculateListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent event) {
      ScriptEngineManager manager = new ScriptEngineManager();
      ScriptEngine engine = manager.getEngineByExtension("js");
      String formulaToBeCalculated = formula.getText();
      try {
        System.out.println(engine.eval(formulaToBeCalculated));
        Object result = engine.eval(formulaToBeCalculated);
        formula.setText(result.toString());
      } catch (ScriptException e) {
        e.printStackTrace();
        formula.setText("Invalid formula");
      }
    }
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

  class ClearListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent event) {
      formula.setText("");
    }
  }

}