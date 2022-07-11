package com.artevcs.forms;

import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

public class FrmEmpresas extends JFrame {

    SpringLayout layout = new SpringLayout();

    public FrmEmpresas(){
        super("Empresas de seguridad");
        darFormato();
        agregarBarraDeHerramientas();
        agregarTabla();
    }

    private void darFormato(){
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(new Dimension(328,266));
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(layout);
    }

    private void agregarBarraDeHerramientas(){
        BotonCuadrado botonAgregar = new BotonCuadrado(BotonCuadrado.AGREGAR);
        add(botonAgregar);
        layout.putConstraint(SpringLayout.WEST, botonAgregar, 5, SpringLayout.WEST, this);
        layout.putConstraint(SpringLayout.NORTH, botonAgregar, 5, SpringLayout.NORTH, this);
    }

    private void agregarTabla(){
        JTable tabla = new JTable(new ModeloTablaEmpresas());

        tabla.setPreferredScrollableViewportSize(new Dimension(300, 150));
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabla.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabla.getColumnModel().getColumn(1).setPreferredWidth(190);
        tabla.getColumnModel().getColumn(2).setPreferredWidth(60);
        tabla.getColumnModel().getColumn(2).setCellRenderer(new ButtonRenderer());
        tabla.getColumnModel().getColumn(2).setCellEditor(new ButtonEditor(new JTextField()));

        JScrollPane panel = new JScrollPane(tabla);
        add(panel);
        layout.putConstraint(SpringLayout.WEST, panel, 5, SpringLayout.WEST, this);
        layout.putConstraint(SpringLayout.NORTH, panel, 50, SpringLayout.NORTH, this);
    }
}
