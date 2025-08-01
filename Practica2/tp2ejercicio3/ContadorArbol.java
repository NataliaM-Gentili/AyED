package tp2ejercicio3;
import java.util.*;

import tp2ejercicio2.BinaryTree;


public class ContadorArbol {
	BinaryTree <Integer> a;
	public ContadorArbol(BinaryTree<Integer> ab) {
		a = ab;
	}
	
	public List<Integer> numerosParesInOrden() {
		List<Integer> lista = new LinkedList<Integer>();
		if (!a.isEmpty()) this.verParesInOrden(lista, a);
		return lista;
	}
	
	private void verParesInOrden (List<Integer> lista, BinaryTree<Integer> a) {
		if (a.hasLeftChild()) verParesInOrden(lista, a.getLeftChild());
		if (a.getData()%2 == 0) lista.add(a.getData());
		if (a.hasRightChild()) verParesInOrden(lista, a.getRightChild());
	}
	
	public List<Integer> numerosParesPostOrden(){
		List<Integer> lista = new LinkedList<Integer>();
		if (!a.isEmpty()) this.verParesPostOrden(lista, a);
		return lista;
	}
	
	private void verParesPostOrden (List<Integer> lista, BinaryTree<Integer> a) {
		if (a.hasLeftChild()) verParesPostOrden(lista, a.getLeftChild());
		if (a.hasRightChild()) verParesPostOrden(lista, a.getRightChild());
		if (a.getData()%2 == 0) lista.add(a.getData());
	}
		
	
}