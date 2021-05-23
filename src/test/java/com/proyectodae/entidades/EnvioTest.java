package com.proyectodae.entidades;

import com.proyectodae.entidades.Oficina;
import java.util.ArrayList;

import javax.validation.OverridesAttribute.List;
import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * Test unitario para clase Cuenta
 * @author ajrueda
 */
public class EnvioTest {
    
    @Test
    public void testNuevoEnvio() {
        Oficina oficina = new Oficina(
                "ofic3993", 
                "Jaen",
                "España");
        
        Paquete paquete = new Paquete(
            "paq3432", 
            34.56,
            5);
                    
        List<PuntoControl> ruta = new ArrayList<>();
        
        Envio envio = new Envio(
            "45466778676",
            7.37,
            "pendiente",
            "almacen",
            paquete,
            ruta,
            "Juanma",
            "Álvaro"
        );
        
        
         
    }    
}
