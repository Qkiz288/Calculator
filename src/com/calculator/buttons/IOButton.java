package com.calculator.buttons;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import com.calculator.textfields.ResultList;
import com.calculator.window.SaveDialog;

public class IOButton extends CalculatorButton {

  private final int fontSize = 12;
  private final String fontName = "Helvetica";
  private final Font buttonFont = new Font(fontName, Font.BOLD, fontSize);
  private final Dimension buttonSize = new Dimension(105, 30);
  private ResultList resultList;
  private SaveDialog fileChooser = new SaveDialog();

  public IOButton(String label, ResultList resultList) {
    super(label);
    setResultList(resultList);
    setAppearance(buttonFont, Color.GREEN, buttonSize);
  }

  private void setResultList(ResultList resultList) {
    this.resultList = resultList;
  }

  public ResultList getResultList() {
    return resultList;
  }

  public SaveDialog getSaveDialog() {
    return fileChooser;
  }

}
