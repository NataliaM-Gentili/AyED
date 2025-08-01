package tp1ejercicio7;
import java.util.*;
public class p1ejercicio7MC{
	//----------------------------- F -----------------------------
	public void incisoF () {
		List <Integer> listaNum = new ArrayList <Integer>(TestArrayList.getArrayList());		
		 for (Integer act : listaNum) {
	        	System.out.println(act);
	        }
		 boolean ok = p1ejercicio7incisoFGHIJ.esCapicua(listaNum);
		 System.out.println(ok); 
	}
	//----------------------------- G -----------------------------
	public void incisoG () {
		List <Integer> listaNum;
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		listaNum = new ArrayList<Integer>();
		p1ejercicio7incisoFGHIJ p7 = new p1ejercicio7incisoFGHIJ();
		listaNum = p7.calcularSucesion(s.nextInt());
		
		for (int i=0; i<listaNum.size(); i++) {
			System.out.println(listaNum.get(i));
		}
		s.close();
	}
	//----------------------------- H -----------------------------
	public static void incisoH () {
		ArrayList <Integer> listaNum = new ArrayList <Integer>(TestArrayList.getArrayList());
		System.out.println();
		System.out.println("---- LISTA ORIGINAL ----");
		System.out.println();		
		for (Integer actual : listaNum) System.out.println(actual);
		System.out.println();
		System.out.println();
		p1ejercicio7incisoFGHIJ p7 = new p1ejercicio7incisoFGHIJ();
		listaNum = p7.invertirArrayList(listaNum);
		System.out.println();
		System.out.println("---- LISTA INVERTIDA ----");
		System.out.println();		
		for (Integer actual : listaNum) System.out.println(actual);
		System.out.println();
		System.out.println();
	}
	//----------------------------- I -----------------------------
	public static int incisoI () {
		LinkedList <Integer> listaNum = new LinkedList <Integer>(TestArrayList.getArrayList());
		System.out.println();
		System.out.println("-----------------------");
		System.out.println();
		p1ejercicio7incisoFGHIJ p7 = new p1ejercicio7incisoFGHIJ();
		int n = p7.sumarLinkedList(listaNum);
		System.out.println(n +" es la suma total de la LinkedList");
		return n;

	}
	//------------------------------ J ----------------------------------
	public static void incisoJ() {
		ArrayList <Integer> lista1 = new ArrayList <Integer>(TestArrayList.getArrayList());
		ArrayList <Integer> lista2 = new ArrayList <Integer>(TestArrayList.getArrayList());
		ArrayList <Integer> listaNum;
		p1ejercicio7incisoFGHIJ p7 = new p1ejercicio7incisoFGHIJ();
		listaNum = p7.combinarOrdenado(lista1, lista2);
		System.out.println();
		System.out.println("---- LISTA FUSIONADA ----");
		System.out.println();		
		for (Integer actual : listaNum) System.out.println(actual);
		System.out.println();
		System.out.println();
	}
	public static void main (String[] args) {
		incisoJ();
		
	}
	
}