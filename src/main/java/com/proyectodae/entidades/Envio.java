/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectodae.entidades;

import java.util.List;

/**
 *
 * @author alvar
 */
public class Envio {
    private String localizador;
    private double importe;
    private String estado;
    private String situacion;
    private Paquete paquete;
    private List<PuntoControl> ruta;
    private String remitente, destinatario;
    
    public Envio() {
        localizador = "";
        importe = 0;
        estado = "";
        situacion = "";
        paquete = null;
        ruta = null;
        remitente = "";
        destinatario = "";
    }
    
    public Envio(String _localizador, double _importe, String _estado, String _situacion, Paquete _paquete, List _ruta, String _remitente, String _destinatario) {
        localizador = _localizador;
        importe = _importe;
        estado = _estado;
        situacion = _situacion;
        paquete = _paquete;
        ruta = _ruta;
        remitente = _remitente;
        destinatario = _destinatario;
    }
    
    public String getLocalizador(){
        return localizador;
    }
    
    public double getImporte(){
        return importe;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public String getSituacion(){
        return situacion;
    }
    
    public Paquete getPaquete(){
        return paquete;
    }
    
    public List getRuta(){
        return ruta;
    }
    
    public String getRemitente(){
        return remitente;
    }
    
    public String getDestinatario(){
        return destinatario;
    }
}
