package holamundo;

/**
 *
 * @author Elvis
 */
public class hola_14 {
    
    public static void main(String[] args) {
        var a = 3;
        var b = 2;

        var c = (a == b);
        System.out.println("c = " + c);

        var d = a != b;
        System.out.println("d = " + d);

        var cadena = "Hola";
        var cadena2 = "Hola";
        var e = cadena == cadena2;
        System.out.println("e = " + e);

        var f = cadena.equals(cadena2);
        System.out.println("f = " + f);
    }
}
