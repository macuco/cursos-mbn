package holamundo;

public class HolaMundo {

    public static void main(String[] args) {
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        //Modificamos el valor de la variable
        miVariableEntera = 5;
        System.out.println(miVariableEntera);
        
        String miVariableCadena = "Saludo";
        System.out.println(miVariableCadena);
        
        miVariableCadena = "Adio";
        System.out.println(miVariableCadena);
        
        //var - Inferencia de tipos en Java
               
       var miVariableEntera2 = 15.9;
        System.out.println(miVariableEntera2);
        
        var miVariableCadena2 = "Nueva Cadena";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        
    }

}
