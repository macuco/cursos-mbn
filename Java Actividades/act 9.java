package holamundo;


 * @author liz
 */
public class hola_9 {

 public static void main(String[] args) {
 
      boolean varBoolean = true;
       System.out.println("varBoolean = " + varBoolean);
        
       if(varBoolean){
           System.out.println("La bandera es verdadera");
       } 
       else{
           System.out.println("La bandera es falsa");
       }
       
       var edad = 10;
       //var esAdulto = edad >= 19;
       if( edad >= 19 ){
           System.out.println("Eres mayor de edad");
       }
       else{
           System.out.println("Eres menor de edad");
       }
 }
    
}
