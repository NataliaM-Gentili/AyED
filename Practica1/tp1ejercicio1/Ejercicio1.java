package tp1ejercicio1;
public class Ejercicio1 {

  public static void iterarConFor(int a, int b){
        if (a>b) {
            for (int i=a; i>=b; i--) {
                System.out.println(i);
            } 
        } else {
            for (int i=a; i<=b; i++) {
                System.out.println(i);
            }
        }
    }

    public static void iterarConWhile(int a, int b){
        if (a > b) {
            while (a >= b) {
                System.out.println(a);
                a--;
            }
        } else {
            while (b >= a) {
                System.out.println(a);
                a++;
            }
        }
    }

    public static void iterarSinEstructura(int a, int b){
        System.out.println(a);
        if (a == b) {
            return;
        } else if (a > b) {
           iterarSinEstructura(a-1, b);
            } else {
                iterarSinEstructura(a+1, b);
            }      
    }
} 