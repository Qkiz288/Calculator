package com.calculator.panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JPanel;

import com.calculator.buttons.IOButton;
import com.calculator.textfields.FormulaTextField;
import com.calculator.textfields.ResultList;
import com.calculator.window.ResultScrollPane;

public class LeftPanel extends JPanel {

  private static final long serialVersionUID = 1L;
  private ResultList resultJList;
  private FormulaTextField formula;
  private ResultScrollPane scroller;
  private IOButton saveButton, loadButton;

  public LeftPanel(FormulaTextField formula, DefaultListModel<String> resultList) {
    super();
    setFormula(formula);
    setJListWithResults(resultList);
    setBorder(BorderFactory.createEmptyBorder(10, 5, 5, 10));
    setBackground(Color.BLACK);
    setPreferredSize(new Dimension(250, 200));

    scroller = new ResultScrollPane(resultJList);
    saveButton = new IOButton("Save", resultJList);
    loadButton = new IOButton("Load", resultJList);

    this.add(scroller);
    this.add(saveButton);
    this.add(loadButton);

    resultJList.addMouseListener(new ResultListListener());
  }

  private void setJListWithResults(DefaultListModel<String> list) {
    resultJList = new ResultList(list);
  }

  private void setFormula(FormulaTextField formula) {
    this.formula = formula;
  }

  public class ResultListListener implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent event) {
      String formulaString = formula.getText();
      String updatedFormula = formulaString + resultJList.getSelectedValue();
      formula.setText(updatedFormula);
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
  }

}
