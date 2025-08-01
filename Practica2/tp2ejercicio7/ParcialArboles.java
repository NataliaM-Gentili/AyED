package tp2ejercicio7;
import tp2ejercicio2.BinaryTree;

public class ParcialArboles {
	private BinaryTree<Integer> ab;
	
	public ParcialArboles(BinaryTree<Integer> ab) {
		this.ab = ab;
	}
	
	public boolean isLeftTree(int num) {
		boolean ok= false;
		BinaryTree<Integer> arbolTruncado;
		if (!this.ab.isEmpty()) {
			arbolTruncado=truncarArbol(ab, num);
			System.out.println("\n ARBOL TRUNCADO  ");
			arbolTruncado.imprimirArbol();
			ok = recorrer(arbolTruncado);
		}
		return ok;
	}
		
	private BinaryTree<Integer> truncarArbol(BinaryTree<Integer> arbol, int num){
		if (!arbol.isEmpty()) {
			if (arbol.getData() == num) return arbol;
			else {
				BinaryTree<Integer> abIzq = null;
				BinaryTree<Integer> abDer = null;
				if (arbol.hasLeftChild()) abIzq = truncarArbol(arbol.getLeftChild(), num);
				if (arbol.hasRightChild()) abDer = truncarArbol(arbol.getRightChild(), num);
				
				if (abIzq != null) return abIzq;
				else if (abDer != null) return abDer;
				}
		}
		return null;

	}
	
	private boolean recorrer (BinaryTree<Integer> arbol) {
		int Izq = -1;
		int Der = -1;
		System.out.println();
		System.out.println("\n BRAZO IZQ");
		if (arbol.hasLeftChild()) Izq = recorrerArbol(arbol.getLeftChild());
		System.out.println("\n BRAZO Der");
		if (arbol.hasRightChild()) Der = recorrerArbol(arbol.getRightChild());
		
		
		System.out.println("cantidad IZQ: "+Izq);
		System.out.println("CANTIDAD DER: "+Der);
		if (Izq > Der) return true;
		else return false;
 	}
	
	private int recorrerArbol(BinaryTree<Integer> arbol) {
		
		if (!arbol.isEmpty())
			System.out.println("NODO ACTUAL: "+ arbol.getData());
		if (arbol.hasLeftChild() && !arbol.hasRightChild()) {
			System.out.println("SUMO 1\n");
			return (1 + recorrerArbol(arbol.getLeftChild()));
		}
		if (!arbol.hasLeftChild() && arbol.hasRightChild()) {
			System.out.println("SUMO 1\n");
			return (1 + recorrerArbol(arbol.getRightChild()));	
		}
		System.out.println("NO SUMO \n");
		if (arbol.hasLeftChild() && arbol.hasRightChild()) return (0 + recorrerArbol(arbol.getLeftChild()) + recorrerArbol(arbol.getRightChild()));
		return 0;
	}
	
	public static void main (String[] args) {
		BinaryTree<Integer> arbol = new BinaryTree<Integer>();
		arbol = arbol.generarArbolDeInteger();
		arbol.imprimirArbol();
		System.out.println("------------------------------------");
		ParcialArboles PA = new ParcialArboles(arbol);
		System.out.println(PA.isLeftTree(3));
		
	}
}