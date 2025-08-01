package tp1ejercicio5;

public class Ejercicio5MC {
    public static void main (String[] args){
        int[] numeros = {1,2,3,4,5,6};
        Datos o = Ejercicio5.conRetorno(numeros);
        System.out.println(o);
        Datos obj = new Datos(0,0,0);
        Ejercicio5.conParametros(numeros, obj);
        System.out.println(obj);
        Ejercicio5.sinNada(numeros);

    }
}