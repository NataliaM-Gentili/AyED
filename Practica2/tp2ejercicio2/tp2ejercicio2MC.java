package tp2ejercicio2;
import java.util.*;
public class tp2ejercicio2MC {
	public static void main (String[]args ) {
		BinaryTree <Integer> arbolPrueba = new BinaryTree<Integer>(1);
		BinaryTree<Integer> hijoIzq = new BinaryTree<Integer>(2);
		hijoIzq.addLeftChild(new BinaryTree<Integer>(4));
		hijoIzq.addRightChild(new BinaryTree<Integer>(5));
		BinaryTree<Integer> hijoDer = new BinaryTree<Integer>(3);
		hijoDer.addLeftChild(new BinaryTree<Integer>(6));
		arbolPrueba.addLeftChild(hijoIzq);
		arbolPrueba.addRightChild(hijoDer);
		
		arbolPrueba.imprimirArbol();
		System.out.println("----------------- ESPEJO ------------------ \n");
		arbolPrueba.espejo();
		System.out.println();
		System.out.println("----------------- CONTAR HOJAS ------------------ \n");
		arbolPrueba.contarHojas();
		System.out.println();
		System.out.println("----------------- ENTRE NIVELES ------------------ \n");
		
		
		arbolPrueba.entreNiveles(0,2);
	}
}