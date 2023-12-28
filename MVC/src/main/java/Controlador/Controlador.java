/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Modelo;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Alejandro.Pilligua
 */
public class Controlador implements ActionListener {
    
    private Vista view;
    private Modelo model;
    
    public Controlador(Vista view, Modelo model)
    {
        this.view=view;
        this.model=model;
        this.view.btnMultiplicar.addActionListener(this);
    }
    
    public void iniciar()
    {
        view.setTitle("MVC Multiplciar");
        view.setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        model.setNumeroUno(Integer.parseInt(view.txtNumeroUno.getText()));
        model.setNumeroDos(Integer.parseInt(view.txtNumeroDos.getText()));
        model.multiplicar();
        view.txtResultado.setText(String.valueOf(model.getResultado()));
    }
            
    
    
}
