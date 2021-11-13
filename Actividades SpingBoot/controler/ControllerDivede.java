package co.com.ejercicio.spring.introduccion.controler;

import co.com.ejercicio.spring.introduccion.services.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerDivede {

    @Autowired
    private Calculator calculator;

    public ControllerDivede(){
        System.out.println("Creado Controlador Divede");
    }
    @GetMapping("/divede")
    public String divede(){
        int a = 5;
        int b = 10;

        //Calculator calculator = new Calculator();
       return "La divicion de los numeros: "+a+" y "+b+" es: "+calculator.divede(a,b);
    }

}
