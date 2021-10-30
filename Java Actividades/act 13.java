package holamundo;

/**
 *
 * @author liz
 */
public class hola_13 {
    public static void main(String[] args) {
        var a = 3;
        var b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        var c = true;
        var d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        
        //1.preincremento (simbolo antes de la variable)
        var e = 3;
        var f = ++e;
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        
        var g = 5;
        var h = g++;
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        
        //decremento
        //1.predecremento
        var i = 2;
        var j = --i;
        System.out.println("i = " + i);//ya esta drecrementada
        System.out.println("j = " + j);
        
        //2.postdecremento
        var k = 4;
        var l = k--;//primero se usa el valor de la variable y queda pendiente decremento
        System.out.println("k = " + k);//tenia pendiente un drecremento
        System.out.println("l = " + l);
    }
}
