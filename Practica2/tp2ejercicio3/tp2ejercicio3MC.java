package tp2ejercicio3;

import tp2ejercicio2.BinaryTree;

public class tp2ejercicio3MC {
	public static void main (String[] args) {
		BinaryTree<Integer> ab = new BinaryTree<Integer>(2);
		ab.addLeftChild(new BinaryTree<Integer> (2));
		ab.addRightChild(new BinaryTree<Integer> (8));
		ab.getLeftChild().addLeftChild(new BinaryTree<Integer>(3));
		ab.getLeftChild().addRightChild(new BinaryTree<Integer>(4));
		ab.getRightChild().addLeftChild(new BinaryTree<Integer>(6));
		
		ContadorArbol c = new ContadorArbol(ab);
		ab.imprimirArbol();
		System.out.println();
		System.out.println("------------ PARES IN ORDER --------- \n");
		System.out.println(c.numerosParesInOrden()+"\n");
		System.out.println("------------ PARES POST ORDER --------- \n");
		System.out.println(c.numerosParesPostOrden()+"\n");
	}
}