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
public class CentroLogistico extends PuntoControl{
    public CentroLogistico(){
        id = "";
        provincia = "";
        region = "";
    }
    
    public CentroLogistico(String _id, String _provincia, String _region) {
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
}
