
package holamundo;
 * @author liz
 */
public class hola_2 {
    
    public static void main(String[] args){
      var usuario = "Anais";
      var titulo = "Ingeniera";
      
      var union = titulo + " " +usuario;
      System.out.println("union = " + union);
      
      var i = 3;
      var j = 4;
      
      System.out.println( i + j);
      System.out.println( i + j + usuario);
      System.out.println(usuario + i + j );
      System.out.println(usuario + (i + j) );
    }
}

