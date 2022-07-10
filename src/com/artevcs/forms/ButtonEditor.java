package com.artevcs.forms;

import javax.swing.*;
import java.awt.*;

public class ButtonEditor extends DefaultCellEditor {

    String label;

    public ButtonEditor(JCheckBox checkBox) {
        super(checkBox);
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column){
        label = (value == null) ? "" : value.toString();
         JButton button = new JButton(label);
        return button;
    }

    @Override
    public Object getCellEditorValue(){
        return new String(label);
    }
}
