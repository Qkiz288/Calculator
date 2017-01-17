package com.calculator.buttons;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.calculator.textfields.ResultList;

public class IOButton extends CalculatorButton {

  private final int fontSize = 12;
  private final String fontName = "Helvetica";
  private final Font buttonFont = new Font(fontName, Font.BOLD, fontSize);
  private final Dimension buttonSize = new Dimension(105, 30);
  private ResultList resultList;

  public IOButton(String label, ResultList resultList) {
    super(label);
    setResultList(resultList);
    setAppearance(buttonFont, Color.GREEN, buttonSize);
    addActionListener(new SaveListener());
  }

  private void setResultList(ResultList resultList) {
    this.resultList = resultList;
  }

  public class SaveListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent event) {
      try {
        FileOutputStream fileStream = new FileOutputStream("results.ser");
        ObjectOutputStream output = new ObjectOutputStream(fileStream);
        output.writeObject(resultList);
        output.close();
      } catch (FileNotFoundException e) {
        e.printStackTrace();
      } catch (IOException e) {
        e.printStackTrace();
      }

    }
  }

}
