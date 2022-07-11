package com.artevcs.forms;

import javax.swing.*;
import java.awt.*;

public class ButtonEditor extends DefaultCellEditor {

    protected JButton button;
    String label;

    public ButtonEditor(JTextField textField) {
        super(textField);
        button = new JButton();
        button.setOpaque(true);
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column){
        label = (value == null) ? "" : value.toString();
         button.setText(label);
        return button;
    }

    @Override
    public Object getCellEditorValue(){
        return new String(label);
    }
}
