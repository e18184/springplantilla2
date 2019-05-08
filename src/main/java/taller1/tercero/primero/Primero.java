/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1.tercero.primero;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import modelo.Estudiante;
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
    @GetMapping("/matriz")
    public String matriz(Model modelo){
        String[][] tmatriz = {{"f11","f12","f13","f14","f15","f16","f17","f18"},
        {"f21","f22","f23","f24","f25","f26","f27","f28"},
        {"f31","f32","f33","f34","f35","f36","f37","f38"}
        };
        modelo.addAttribute("mivariable",tmatriz);
        return "matriz";
    }
    // visualizar el contenido de una clase
       @GetMapping("/clase")
       public String clase(Model modelo) {
           Estudiante e1 = new Estudiante("123" ," laura"," Sanchez","Lopez",19);
           modelo.addAttribute("mivariable",e1);
           
           return "clase";
           
     
           
       }
}
