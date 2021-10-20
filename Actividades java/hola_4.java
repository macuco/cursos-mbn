package holamundo;
import java.util.Scanner;

public class hola_4 {
     public static void main(String[] args){
     
     System.out.println("Escribe tu nombre:");
     Scanner consola = new Scanner(System.in); 
     var usuario = consola.nextLine();
     System.out.println("usuario = " + usuario);
     System.out.println("Escribe el titulo:");
     var titulo = consola.nextLine();
     System.out.println("Resultado: " + titulo + " " + usuario);
     
     }
     
}

