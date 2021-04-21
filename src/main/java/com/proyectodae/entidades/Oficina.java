/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectodae.entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alvar
 */
public class Oficina extends PuntoControl{
    public Oficina(){
        id = "";
        provincia = "";
        region = "";
    }
    
    public Oficina(String _id, String _provincia, String _region) {
        id = _id;
        provincia = _provincia;
        region = _region;
    }
    
    public String getId(){
        return id;
    }
    
    public String getProvincia(){
        return provincia;
    }
    
    public String getRegion(){
        return region;
    }
    
    /** Dimensiones del paquete en cm
     * @return  medidas del paquete (suponemos que todos los lados miden igual)**/
    public double medirPaquete(){
        return Math.random()*80.0+10.0;
    }
    
    /** Peso del paquete en g
     * @return  peso del paquete (suponemos que puede pesar mas de 20kg)*/
    public double pesarPaquete(){
        return Math.random()*20000.0+10000.0;
    }
    
    public double calcularPrecioEnvio(){
        /** Precio inicial del envio (en euros) */
        int tarifaBase = 5; 
        /** Precio añadido por cada kg que pese el paquete */
        double tarifaVariable = 0.5;
        
        return (pesarPaquete()*tarifaVariable) + tarifaBase;
    }
    
    /** Crea un envio con los datos del paquete
     * @param remitente cliente que envia el paquete
     * @param destinatario cliente que recibe el paquete*/
    public void crearEnvio(String remitente, String destinatario){
        /** Localizador del envio */
        String localizador = Integer.toString((int)(Math.random()*1000000000));
        /** Importe total del envio */
        double importe = calcularPrecioEnvio();
        /** Estado actual del envio (En gestion, Enviado, En reparto) */
        String estado = "En gestion";
        /** Localizacion actual del paquete */
        String localizacion = provincia;
        /** Id del paquete */
        String id = Integer.toString((int)(Math.random()*1000000000));
        /** Paquete asociado al envio */
        Paquete paquete = new Paquete(id, medirPaquete(), pesarPaquete());
        /** Creamos el envio */
        Envio envio = new Envio(localizador, importe, estado, localizacion, paquete, crearRuta(), remitente, destinatario);
    }
    
    /** Crea una ruta para hacer un envio */
    public List crearRuta(){
        List<PuntoControl> ruta = new ArrayList<PuntoControl>();
        
        return ruta;
    }
}
