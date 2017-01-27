package com.calculator.buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;

import com.calculator.textfields.ResultList;

public class SaveButton extends IOButton {

  private static final long serialVersionUID = 1L;

  public SaveButton(String label, ResultList resultList) {
    super(label, resultList);
    addActionListener(new SaveListener());
  }

  class SaveListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      int returnVal = getSaveDialog().showSaveDialog(SaveButton.this);
      if (returnVal == JFileChooser.APPROVE_OPTION) {
        try (FileWriter writer = new FileWriter(getSaveDialog().getSelectedFile() + ".txt")) {
          writer.write(getResultList().getDefaultListModel().toString());
        } catch (IOException ex) {
          ex.printStackTrace();
        }

      }

    }
  }

}
