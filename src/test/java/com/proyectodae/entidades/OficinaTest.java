package com.proyectodae.entidades;

import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Test unitario para clase Oficina
 * @author jmait
 */
public class OficinaTest {
    
    public OficinaTest() {
    }

    @Test
    void testValidacionOficina() {
        String clave = "ofijaen120";
        
        Oficina oficina = new Oficina(
                "ofic3993", 
                "Jaen",
                "España");
        
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<Oficina>> violations = validator.validate(oficina);
                
        Assertions.assertThat(violations).isEmpty();
    }
        
    
    
}
