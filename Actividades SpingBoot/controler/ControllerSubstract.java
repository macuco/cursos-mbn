package co.com.ejercicio.spring.introduccion.controler;

import co.com.ejercicio.spring.introduccion.services.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerSubstract {

    @Autowired
    private Calculator calculator;

    public ControllerSubstract(){
        System.out.println("Creado Controlador Substract");
    }
    @GetMapping("/restar")
    public String restar(){
        int a = 5;
        int b = 10;

        //Calculator calculator = new Calculator();
       return "La resta de los numeros: "+a+" y "+b+" es: "+calculator.subtract(a,b);
    }

}
