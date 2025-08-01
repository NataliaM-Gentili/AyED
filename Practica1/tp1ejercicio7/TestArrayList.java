package tp1ejercicio7;
import java.util.*;
public class TestArrayList {
	public static List <Integer> getArrayList() {
		List <Integer> lista = new ArrayList <Integer>();
		Scanner s = new Scanner (System.in);
		System.out.println("Ingrese una secuencia de numeros, finalice con -888");
		int num = s.nextInt();
		while (num != -888) {
			lista.add(num);
			num = s.nextInt();
		}
		return lista;
	}

}

//0:00:00.223