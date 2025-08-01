package tp2ejercicio4;
import java.util.*;
import tp2ejercicio2.BinaryTree;


public class RedBinariaLlena {
	BinaryTree<Integer> a;
	
	/*public int retardoReenvioPorNiveles(BinaryTree<Integer> ab) {
		int num = 0;
		if (!ab.isEmpty()) num = retardoPorNiveles(ab);
		return num;
	}
	
	public int retardoPorNiveles(BinaryTree<Integer> ab) {
		Queue<BinaryTree<Integer>> cola = new LinkedList<>();
		Queue<Integer> retardosAcumulados = new LinkedList<>();
		BinaryTree<Integer> nodo = null;
		int mayorRetardo = 0;
		int aux = 0;
		cola.offer(ab);
		retardosAcumulados.add(ab.getData());
		
		while (!cola.isEmpty()) {
			nodo = cola.poll();
			int retardoAcumulado = retardosAcumulados.poll();
			if (nodo.isLeaf()) mayorRetardo = Math.max(mayorRetardo, retardoAcumulado);

			if (nodo.hasLeftChild()) {
				cola.offer(nodo.getLeftChild());
				nodo.
				retardosAcumulados.add(retardoAcumulado + nodo.getLeftChild();
			}
			if (nodo.hasRightChild()) cola.offer(nodo.getRightChild());	
			} 
			else {
				if (!cola.isEmpty()) {
					cola.enqueue(null);
				}
			}
		}
		return mayorRetardo;
	}*/
	
	public int retardoPorProfundidad (BinaryTree<Integer> ab) {
		int num = 0;
		if (!ab.isEmpty()) num = privateProfundidad(ab);
		return num;
	}
	
	private int privateProfundidad (BinaryTree<Integer> ab) {
		int HI = 0;
		int HD = 0;
		if (ab.hasLeftChild()) HI=privateProfundidad(ab.getLeftChild());
		if (ab.hasRightChild()) HD=privateProfundidad(ab.getRightChild());
		return (Math.max(HI, HD)+ab.getData());	
	} 
}