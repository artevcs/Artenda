package com.artevcs.forms;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

public class BotonCuadrado extends JButton {
    public static String AGREGAR = "add.png";

    public BotonCuadrado(String tipo){
        super();
        setPreferredSize(new Dimension(40,40));
        try {
            Image imagen = ImageIO.read(getClass().getResource("images/" + tipo));
            setIcon(new ImageIcon(imagen));
        }catch (Exception exception){
            setText("+");
        }
    }
}
