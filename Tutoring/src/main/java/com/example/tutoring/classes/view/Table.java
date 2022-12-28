package com.example.tutoring.classes.view;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Table {
    public int x;
    public int y;
    public int width;
    public int height;
    public int rowHeight;
    public List<List<Label>> theRowList;

    public Table() {
        x = 0;
        y = 0;
        width = 0;
        height = 0;
        rowHeight = 0;
        theRowList = new ArrayList<>();
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setRowHeight(int rowHeight) {
        this.rowHeight = rowHeight;
    }

    public void addRow() {
        theRowList.add(new ArrayList<>());
        height+=rowHeight;
    }

    public void addColumn(int rowIndex, Label label) {
        int colNumber = theRowList.get(rowIndex).size();
        label.setBounds( x + (50 * colNumber), y + (rowHeight * rowIndex), 50, rowHeight);
        theRowList.get(rowIndex).add(label);
    }

    public Label getElement(int rowIndex, int columnIndex) {
        return theRowList.get(rowIndex).get(columnIndex);
    }

    public void setElement(int rowIndex, int columnIndex, Label label) {
        width-=theRowList.get(rowIndex).get(columnIndex).getWidth();
        theRowList.get(rowIndex).set(columnIndex, label);
        width+=label.getWidth();
    }

    public void addToFrame(Frame frame) {
        for (List<Label> row : theRowList) {
            for (Label col : row) {
                frame.add(col);
            }
        }
    }
}

//1. Zrobić trójkąt z Labelami.
