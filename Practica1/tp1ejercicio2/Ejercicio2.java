package tp1ejercicio2;
public class Ejercicio2 { 
    
    public static int[] crearArreglo (int n){
    	if (n<1) n = n*-1;
    		int[] numeros = new int[n];
        for (int i=1; i<=n; i++){    
            numeros[i-1] = (i*n);
        }
        return numeros;
    }
}
