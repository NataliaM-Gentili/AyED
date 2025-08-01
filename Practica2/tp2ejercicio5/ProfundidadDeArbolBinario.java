package tp2ejercicio5;
import tp2ejercicio2.BinaryTree;
import java.util.*;
public class ProfundidadDeArbolBinario {
	private BinaryTree<Integer> ab;
	public ProfundidadDeArbolBinario(BinaryTree<Integer> ab) {
		this.ab = ab;
	}
	
	public int sumaElementosProfundidad(int p) {
		int suma = 0;
		if (this.ab != null) suma = privateSuma (p);
		return suma;
	}
	
	public int privateSuma(int p) {
		int nivel = 0;
		int suma = 0;
		BinaryTree<Integer> nodo = null;
		Queue<BinaryTree<Integer>> cola = new LinkedList<>();
		cola.offer(this.ab);
		cola.offer(null);
		
		while (!cola.isEmpty()) {
			nodo = cola.poll();
			if (nodo != null) {
				if (nivel == p) {
					suma += nodo.getData();
				}
				else {
					if (nodo.hasLeftChild()) cola.offer(nodo.getLeftChild());
					if (nodo.hasRightChild()) cola.offer(nodo.getRightChild());
				}
			} else {
					if (!cola.isEmpty()) {
						nivel++;
						cola.offer(null);
					}
			}
		}
		return suma;	
	}
	
	public static void main (String[] args) {
		BinaryTree<Integer> ab = new BinaryTree<Integer>();
		ab = ab.generarArbolDeInteger();
		ab.imprimirArbol();
		System.out.println("--------------- SUMAR LOS ELEMENTOS PARA UNA DETERMINADA PROFUNDIDAD- ---------------------");
		ProfundidadDeArbolBinario nue = new ProfundidadDeArbolBinario(ab);
		System.out.println(nue.sumaElementosProfundidad(1));;
		

		
	}
	
}