package co.com.ejercicio.spring.introduccion.config;

import co.com.ejercicio.spring.introduccion.services.Calculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public Calculator configCalculator(){
        System.out.println("Creando bean Calculator");
        return new Calculator();
    }

}
