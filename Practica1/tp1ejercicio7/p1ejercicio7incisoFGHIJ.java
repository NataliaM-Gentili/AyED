package tp1ejercicio7;
import java.util.*;
public class p1ejercicio7incisoFGHIJ {
	//---------------------------- F ---------------------
	public static boolean esCapicua (List <Integer> lista) {
		int size = (lista.size()-1);
		List <Integer> listaInvertida = new ArrayList <Integer> ();
		for (int i = size; i>1; i--) {
			listaInvertida.add(lista.get(i));
		}
		
		boolean iguales = true;
		for (int i = 0; i<(lista.size()/2); i++) {
			System.out.println();
			System.out.println(lista.get(i)+ " NORMAL");
			System.out.println(listaInvertida.get(i)+ " INVERTIDA");
			
			if (lista.get(i) == listaInvertida.get(i)) {
				System.out.println("IGUALES");
			} else {
				iguales = false;
				System.out.println("NO SON 	IGUALES");
			}
		}
		return iguales;
	}
	//------------------------------ G --------------------------
	List <Integer> lista = new ArrayList <Integer>();
	public List <Integer> calcularSucesion (int n) {
		if (n>0) {
			lista.add(n);
			if (n>1) {
				if (n % 2 == 0) { //par
					calcularSucesion(n/2);
				} else {
					calcularSucesion(3*n + 1);
				}	
			}
			
		} else System.out.println("El numero debe ser positivo!!");
		return lista;	
	}
	//----------------------------- H -----------------------------
	public ArrayList <Integer> invertirArrayList (ArrayList <Integer> lista){
		if (!lista.isEmpty())
			return verFin(lista, 0, 0, lista.size()-1);
		else
			return lista;
	}
	private Integer aux;
	private ArrayList <Integer> verFin (ArrayList <Integer> lista, int act, int pos, int tam) {
		if (tam < pos)  return lista;
		if (act == tam) {
			aux = lista.get(tam);
			lista.set(tam, lista.get(pos));
			lista.set(pos, aux);
			return verFin(lista, 0, pos+1, tam-1);
		} else {
			return verFin(lista, act+1, pos, tam);
		}
	//----------------------------- I -----------------------------
	}
	public int sumarLinkedList (LinkedList <Integer> lista) {
		if (!lista.isEmpty())
			return sumar(lista, 0);
		else
			return 0;
	}
	
	private static int sumar (LinkedList <Integer> lista, int index) {
		if (index == lista.size()) return 0;
		return lista.get(index) + sumar(lista, index+1);
	}
	//----------------------------- J -----------------------------
	private ArrayList <Integer> listaOrdenada = new ArrayList <Integer>();
	public ArrayList <Integer> combinarOrdenado (ArrayList <Integer> lista1, ArrayList <Integer> lista2){
		int i = 0, min1 = 999, min2 = 999;
		boolean sigo1 = true, sigo2 = true;
		while ((sigo1) & (sigo2)) {
			if (!lista1.isEmpty()) {
				System.out.println(lista1.get(i) + " LISTA 1");
				min1 = lista1.get(i);
			} else sigo1 = false;
			if (!lista2.isEmpty()) {
				System.out.println(lista2.get(i)+ " LISTA 2");
				min2 = lista2.get(i);
			} else sigo2 = false;
			if (min1 > min2) listaOrdenada.add(min2);
			else if (min2 > min1) listaOrdenada.add(min1);
			i++;	 
		}
		return listaOrdenada;
		
	}

	
	
}