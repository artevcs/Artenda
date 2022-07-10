package com.artevcs;

import com.artevcs.forms.FrmEmpresas;

import java.awt.*;

public class Artenda {

    public static void main(String[] args) {
	    Artenda aplicacion = new Artenda();
        aplicacion.iniciar();
    }

    private void iniciar(){
        FrmEmpresas frmEmpresas = new FrmEmpresas();
        frmEmpresas.setVisible(true);
    }
}
