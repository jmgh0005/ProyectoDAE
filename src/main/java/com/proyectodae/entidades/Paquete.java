/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectodae.entidades;

/**
 *
 * @author alvar
 */
public class Paquete {
    private String id;
    private double dimensiones;
    private double peso;
    
    public Paquete(){
        id = "";
        dimensiones = 0;
        peso = 0;
    }
    
    public Paquete(String _id, double _dimensiones, double _peso) {
        id = _id;
        dimensiones = _dimensiones;
        peso = _peso;
    }
    
    public String getId(){
        return id;
    }
    
    public double getDimensiones(){
        return dimensiones;
    }
    
    public double getPeso(){
        return peso;
    }
}
