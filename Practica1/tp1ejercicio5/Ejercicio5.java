package tp1ejercicio5;

public class Ejercicio5{
    public static Datos conRetorno(int[] numeros){
        int min = 9999, max = 0, prom, total = 0;
        
        for (int i= 0; i<numeros.length; i++){
            if (numeros[i]< min) {
                min = numeros[i];
            }
            if (numeros[i]> max) {
                max = numeros[i];
            }
            total += numeros[i];
        }
        prom = total / numeros.length;
        Datos info = new Datos (min, max, prom);
        return info;
    }
    public static void conParametros(int[] numeros, Datos info){
        int min = 9999, max = 0, prom, total = 0;
        
        for (int i= 0; i<numeros.length; i++){
            if (numeros[i]< min) {
                min = numeros[i];
            }
            if (numeros[i]> max) {
                max = numeros[i];
            }
            total += numeros[i];
        }
        prom = total / numeros.length;
        info = new Datos (min, max, prom);
    }
    public static void sinNada (int[] numeros){
        int min = 9999, max = 0, prom, total = 0;
        
        for (int i= 0; i<numeros.length; i++){
            if (numeros[i]< min) {
                min = numeros[i];
            }
            if (numeros[i]> max) {
                max = numeros[i];
            }
            total += numeros[i];
        }
        prom = total / numeros.length;
        System.out.println("MINIMO: "+ min);
        System.out.println("MAXIMO: "+max);
        System.out.println("PROMEDIO: "+prom);
    }
}
