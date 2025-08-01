package tp2ejercicio6;
import java.util.*;
import tp2ejercicio2.*;
import tp2ejercicio5.ProfundidadDeArbolBinario;
public class Transformacion {
	BinaryTree<Integer> ab;
	public Transformacion(BinaryTree<Integer>ab){
		this.ab = ab;
	}
	
	public BinaryTree<Integer> suma(){
		if (!this.ab.isEmpty()) 
			privateSuma(this.ab);
		return this.ab;
	}
	
	
	private int privateSuma (BinaryTree<Integer> arbol) {
		int HI = 0;
		int HD = 0;
		int actual;
		actual = arbol.getData();
		if (arbol.hasLeftChild()) HI = privateSuma(arbol.getLeftChild());
		else HI = 0;
		if (arbol.hasRightChild()) HD = privateSuma(arbol.getRightChild());
		else HD = 0;
		int total = (HI + HD);
		arbol.setData(total);
		return (total+actual);
	}
	
	public static void main (String[] args) {
		BinaryTree<Integer> ab = new BinaryTree<Integer>();
		ab = ab.generarArbolDeInteger();
		ab.imprimirArbol();
		System.out.println("---------------ARBOL REEMPLAZADO ---------------------");
		Transformacion T = new Transformacion(ab);
		T.suma();
		ab.imprimirArbol();
	}
} 