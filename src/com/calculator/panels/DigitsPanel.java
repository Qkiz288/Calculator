package com.calculator.panels;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import com.calculator.buttons.BackspaceButton;
import com.calculator.buttons.KeyButton;
import com.calculator.textfields.FormulaTextField;

public class DigitsPanel extends JPanel {

  private static final long serialVersionUID = 1L;
  private KeyButton btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0, dot;
  private BackspaceButton backspace;

  public DigitsPanel(FormulaTextField formula) {
    super();

    btn_1 = new KeyButton(formula, "1");
    btn_2 = new KeyButton(formula, "2");
    btn_3 = new KeyButton(formula, "3");
    btn_4 = new KeyButton(formula, "4");
    btn_5 = new KeyButton(formula, "5");
    btn_6 = new KeyButton(formula, "6");
    btn_7 = new KeyButton(formula, "7");
    btn_8 = new KeyButton(formula, "8");
    btn_9 = new KeyButton(formula, "9");
    btn_0 = new KeyButton(formula, "0");
    dot = new KeyButton(formula, ".");
    backspace = new BackspaceButton(formula, "<-");

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
  }

}
