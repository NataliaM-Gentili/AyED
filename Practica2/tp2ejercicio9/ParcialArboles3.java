package tp2ejercicio9;
import tp2ejercicio2.BinaryTree;
import java.util.*;

public class ParcialArboles3 {
	public BinaryTree<LinkedList<Integer>> sumAndDif(BinaryTree<Integer> arbol) {
		LinkedList<Integer> elementos = new LinkedList<Integer>();
		BinaryTree<LinkedList<Integer>> nuevoArbol = new BinaryTree<LinkedList<Integer>>();
		if (!arbol.isEmpty()) {
			elementos.add(arbol.getData());
			elementos.add(arbol.getData());
			nuevoArbol.setData(elementos);
			recorrer(arbol, nuevoArbol, 0, 0);
		}
		return nuevoArbol;
	}
	
	private BinaryTree<LinkedList<Integer>> recorrer(BinaryTree<Integer> ab, BinaryTree<LinkedList<Integer>> nuevo, int total, int padre) {
		LinkedList<Integer> actLista = new LinkedList<Integer>();
		if (!ab.isEmpty()) {
			//if(ab.isLeaf()) {
				actLista.add(total);
				actLista.add(ab.getData()-padre);
				nuevo.setData(actLista);
				
			//}
		
			if (ab.hasLeftChild()) {
				recorrer(ab.getLeftChild(), nuevo.getLeftChild(), (total+ab.getData()), ab.getData());	
			}
			if (ab.hasRightChild()) {
				recorrer(ab.getRightChild(), nuevo.getRightChild(), (total+ab.getData()), ab.getData());
			}
			actLista.add(total);
			actLista.add(ab.getData()-padre);
			nuevo.setData(actLista);	
		}
		return nuevo;
	}
	
	public static void main (String[] args) {
		BinaryTree<Integer> arbol = new BinaryTree<Integer>();
		arbol = arbol.generarArbolDeInteger();
		arbol.imprimirArbol();
		System.out.println("------------------------------------");
		ParcialArboles3 PA = new ParcialArboles3();
		BinaryTree<LinkedList<Integer>> nue = PA.sumAndDif(arbol);
		nue.imprimirArbol();
		
	}
	
}