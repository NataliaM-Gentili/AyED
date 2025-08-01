package tp1ejercicio1;
import java.util.Scanner;
    public class Ejercicio1MC {
        public static void main (String[] args){
            Scanner scanner = new Scanner (System.in);
            System.out.println("Ingrese un numero 'a'");
            System.out.println();
            int a = scanner.nextInt();
            System.out.println("Ingrese un numero 'b'");
            System.out.println();
            int b = scanner.nextInt();
            
            System.out.println("Itero con for");
            Ejercicio1.iterarConFor(a,b);
            System.out.println("Itero sin estructura");
            Ejercicio1.iterarSinEstructura(a, b);
            System.out.println("Itero con while");
            Ejercicio1.iterarConWhile(a,b);
            scanner.close();
        }
}