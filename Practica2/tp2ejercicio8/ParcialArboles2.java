package tp2ejercicio8;
import tp2ejercicio2.BinaryTree;

public class ParcialArboles2 {

	public boolean esPrefijo(BinaryTree<Integer> arbol1, BinaryTree<Integer>arbol2) {
		boolean ok = false;
		if (!arbol1.isEmpty()) {
			System.out.println("\n ARBOL 1: "+arbol1.getData()+"\n");
			System.out.println("ARBOL 2: "+arbol2.getData()+"\n");
			if (arbol1.getData()==arbol2.getData())
				ok = true;
			else return false;
			if (arbol1.hasLeftChild() && arbol2.hasLeftChild())
				ok  = (ok && esPrefijo(arbol1.getLeftChild(), arbol2.getLeftChild()));
			if (arbol1.hasRightChild()&& arbol2.hasRightChild()) 
				ok = ok && esPrefijo(arbol1.getRightChild(), arbol2.getRightChild());
 		}
		return ok;
	}
	
	public static void main (String[] args) {
		BinaryTree<Integer> ab = new BinaryTree<Integer>(10);
		//LADO IZQUIERDO
		BinaryTree<Integer> hijoIzq = new BinaryTree<Integer>(2);
		BinaryTree<Integer> segundoIzq = new BinaryTree<Integer>(5);
		segundoIzq.addLeftChild(new BinaryTree<Integer>(7));
		segundoIzq.addRightChild(new BinaryTree<Integer>(8));
		hijoIzq.addLeftChild(segundoIzq);
		BinaryTree<Integer> segundoIzqDer = new BinaryTree<Integer>(4);
		segundoIzqDer.addLeftChild(new BinaryTree<Integer>(5));
		segundoIzqDer.addRightChild(new BinaryTree<Integer>(6));
		hijoIzq.addRightChild(segundoIzqDer);
		ab.addLeftChild(hijoIzq);
		
		//LADO DERECHO
		BinaryTree<Integer> hijoDer = new BinaryTree<Integer>(3);
		BinaryTree<Integer> segundoDerIzq = new BinaryTree<Integer>(9);
		BinaryTree<Integer> tercerDerIzq = new BinaryTree<Integer>(12);
		BinaryTree<Integer> cuartoDerIzq = new BinaryTree<Integer>(11);
		cuartoDerIzq.addRightChild(new BinaryTree<Integer>(13));
		tercerDerIzq.addLeftChild(cuartoDerIzq);
		segundoDerIzq.addLeftChild(tercerDerIzq);
		segundoDerIzq.addRightChild(new BinaryTree<Integer>(8));
		hijoDer.addLeftChild(segundoDerIzq);
		BinaryTree<Integer> segundoDer = new BinaryTree<Integer>(8);
		BinaryTree<Integer> tercerDer = new BinaryTree<Integer>(2);
		tercerDer.addLeftChild(new BinaryTree<Integer>(1));
		segundoDer.addLeftChild(tercerDer);
		BinaryTree<Integer> CuartoDer = new BinaryTree<Integer>(0);
		CuartoDer.addLeftChild(new BinaryTree<Integer>(1));
		segundoDer.addLeftChild(CuartoDer);
		hijoDer.addRightChild(segundoDer);
		ab.addRightChild(hijoDer);
		
		
		BinaryTree<Integer> Aab = new BinaryTree<Integer>(10);
		//LADO IZQUIERDO
		BinaryTree<Integer> AhijoIzq = new BinaryTree<Integer>(2);
		BinaryTree<Integer> AsegundoIzq = new BinaryTree<Integer>(5);
		AsegundoIzq.addLeftChild(new BinaryTree<Integer>(7));
		AhijoIzq.addLeftChild(AsegundoIzq);
		BinaryTree<Integer> AsegundoIzqDer = new BinaryTree<Integer>(4);
		AhijoIzq.addRightChild(AsegundoIzqDer);
		Aab.addLeftChild(AhijoIzq);
		
		//LADO DERECHO
		BinaryTree<Integer> AhijoDer = new BinaryTree<Integer>(3);
		BinaryTree<Integer> AsegundoDerIzq = new BinaryTree<Integer>(9);
		AsegundoDerIzq.addLeftChild(new BinaryTree<Integer>(12));
		AsegundoDerIzq.addRightChild(new BinaryTree<Integer>(8));
		AhijoDer.addLeftChild(AsegundoDerIzq);
		Aab.addRightChild(AhijoDer);
		
		
		ab.imprimirArbol();
		System.out.println("\n PROX ARBOL \n");
		Aab.imprimirArbol();
		ParcialArboles2 PA2 = new ParcialArboles2();
		boolean ok = PA2.esPrefijo(ab, Aab);
		if (ok) System.out.println("\n ES PREFIJO");
		else System.out.println("\n NOO ES PREFIJO");
	}
}
