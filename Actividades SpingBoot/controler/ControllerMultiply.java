package co.com.ejercicio.spring.introduccion.controler;

import co.com.ejercicio.spring.introduccion.services.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerAdd {

    @Autowired
    private Calculator calculator;

    public ControllerMultiply(){
        System.out.println("Creado Controlador Multiply");
    }
    @GetMapping("/multiply")
    public String multiply(){
        int a = 5;
        int b = 10;
      //  Calculator calculator = new Calculator();
        return "La multiplicacion de los numeros: "+a+" y "+b+" es: "+calculator.multiply(a,b);
    }

}
