package tp2ejercicio2;
public class Azar {
	public static BinaryTree<Integer> generarArbolInteger() {

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
		
		
		 System.out.println("ARBOL DE INTEGER CARGADO");

		
		return ab;
	}
}