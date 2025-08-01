package tp1ejercicio2;
import java.util.Scanner;
public class Ejercicio2MC {
    public static void main (String[] args){
        Scanner s = new Scanner (System.in);
        System.out.println("Ingrese un numero");
        int num = s.nextInt();
        if (num<1) num = num*-1;
        for (int i= 0; i<num; i++){
        	System.out.println(Ejercicio2.crearArreglo(num)[i]); 
        }
        s.close();
    }
}