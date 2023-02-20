package unam.fes.poo.tarea1;
public class Tarea1 {

    public static void main(String[] args) {
        // length() longitug
        String s = "Hola";
        int x = s.length();
        System.out.println(x);
        // isEmpty() cadena vacia
        String s1 = "Hola";
        boolean b1 = s1.isEmpty();
        boolean b2 = s1.isEmpty();
        System.out.println("b1 = "+ b1 + " b2 = " + b2);
        // equals() comparar cadenas
        String xe = "Hola";
        String ye = "Hola";
        if (xe.equals(ye)){
        System.out.println("Si pasa por aqui");
        }
        // indexOf() determinar posicion y char
        String sof = "Hola, como estas?";
        int p1 = sof.indexOf('a');
        System.out.println(p1);
        // lastindexOf()
        int p2 = sof.lastIndexOf('a');
        System.out.println(p2);
        String sin = "Hola, como estas? estas como querias?";
        int p1n = sin.indexOf("como");
        int p2n = sin.indexOf("estas");
        int p3n = sin.lastIndexOf("como");
        System.out.println(p1n + " , " + p2n + " , " + p3n);
        // upperCase()
        String su = "Hola, como estas?";
        String may = su.toUpperCase();
        System.out.println(may);
        // toLowerCase()
        String min = su.toLowerCase();
        System.out.println(min);
        // subString()
        String ss = "Hola, como estas?";
        String ss1 = ss.substring(0,4);
        String ss2 = ss.substring(6,10);
        String ss3 = ss.substring(11);
        System.out.println(ss1);
        System.out.println(ss2);
        System.out.println(ss3);
        // parseInt()
        String sp = "1234";
        int i = Integer.parseInt(sp);
        // toString
        String t1 = Integer.toString(i);
        System.out.println(i);
        System.out.println(t1);
        }
}
