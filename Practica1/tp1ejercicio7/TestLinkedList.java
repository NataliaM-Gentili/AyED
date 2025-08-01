package tp1ejercicio7;
import java.util.*;
public class TestLinkedList {
	public static List <Integer> main (String[] args) {
		LinkedList<Integer> lista = new LinkedList<>();
		int num = 2;
		for (int i=1; i<10; i++) {
			num = 2*i;
			lista.add(num);
		}
		
		
		return lista;

	}
}
//0:00:00.224