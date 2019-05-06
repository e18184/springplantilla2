/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1.tercero.primero;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author alumno
 */
@Controller 
public class Primero {
    @GetMapping({"/","/primero"})
    public String primero(Model modelo) {
        String cadena = "Esta es mi primera cadena";
        String[] vector = {"uno","dos","tres","cuatro","cinco","seis"};
        modelo.addAttribute("mivariable",vector);
        
        return "primero";
    }
}
