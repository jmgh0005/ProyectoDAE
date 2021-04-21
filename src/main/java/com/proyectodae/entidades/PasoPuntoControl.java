/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectodae.entidades;

import java.time.LocalDate;

/**
 *
 * @author alvar
 */
public class PasoPuntoControl {
    LocalDate fechaSalida;
    LocalDate fechaLlegada;
    PuntoControl punto;
    
    public void anotarFechaSalida() {
        fechaSalida = LocalDate.now().plusDays((int)(Math.random()*6));
    }
    
    public void anotarFechaLlegada() {
        fechaLlegada = LocalDate.now().plusDays((int)(Math.random()*6));
    }
    
    public void anotarPuntoControl(PuntoControl puntoControl){
        punto = puntoControl;
    }
}
