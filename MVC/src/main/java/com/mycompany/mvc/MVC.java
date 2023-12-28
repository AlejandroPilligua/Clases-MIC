/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mvc;

import Controlador.Controlador;
import Modelo.Modelo;
import Vista.Vista;

/**
 *
 * @author Alejandro.Pilligua
 */
public class MVC {

    public static void main(String[] args) {
        Modelo mod=new Modelo();
        Vista view=new Vista ();
        
        Controlador ctrl=new Controlador(view,mod);
        ctrl.iniciar();
        view.setVisible(true);
        
    }
}
