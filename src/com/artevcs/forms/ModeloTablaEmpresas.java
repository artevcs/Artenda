package com.artevcs.forms;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.util.*;

public class ModeloTablaEmpresas extends AbstractTableModel {

    List<String> nombresDeColumna = new ArrayList<String>();
    List<Object[]>filas = new ArrayList<Object[]>();

    public  ModeloTablaEmpresas(){
        super();
        addColumn("Id");
        addColumn("Empresa");
        addColumn("");

        Object[] fila1 = new Object[3];
        fila1[0] = "AR";
        fila1[1] = "AGUILA REAL";
        fila1[2] = "Ver";
        addRow(fila1);

        Object[] fila2 = new Object[3];
        fila2[0] = "CU";
        fila2[1] = "CUSAEM";
        fila2[2] = "Ver";
        addRow(fila2);
    }

    @Override
    public int getRowCount() {
        return filas.size();
    }

    @Override
    public int getColumnCount() {
        return nombresDeColumna.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return filas.get(rowIndex)[columnIndex];
    }

    private void addColumn(String nombreColumna){
        nombresDeColumna.add(nombreColumna);
    }

    public void addRow(Object[] fila){
        filas.add(fila);
    }

    public String getColumnName(int column){
        return nombresDeColumna.get(column);
    }

    public Class getColumnClass(int column){
        return getValueAt(0, column).getClass();
    }
}
