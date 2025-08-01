package tp2ejercicio2;
import java.util.*;
import tp2ejercicio2.Azar;
//import Practica1.tp1ejercicio7.TestLinkedList;

public class BinaryTree <T> {
	
	private T data;
	private BinaryTree<T> leftChild;   
	private BinaryTree<T> rightChild; 

	
	public BinaryTree() {
		super();
	}

	public BinaryTree(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T elementos) {
		this.data = elementos;
	}

	 //Preguntar antes de invocar si hasLeftChild()

	public BinaryTree<T> getLeftChild() {
		return leftChild;
	}
	
	 //Preguntar antes de invocar si hasRightChild()

	public BinaryTree<T> getRightChild() {
		return rightChild;
	}

	public void addLeftChild(BinaryTree<T> child) {
		this.leftChild = child;
	}

	public void addRightChild(BinaryTree<T> child) {
		this.rightChild = child;
	}

	public void removeLeftChild() {
		this.leftChild = null;
	}

	public void removeRightChild() {
		this.rightChild = null;
	}

	public boolean isEmpty(){
		return (this.isLeaf() && this.getData() == null);
	}

	public boolean isLeaf() {
		return (!this.hasLeftChild() && !this.hasRightChild());

	}
		
	public boolean hasLeftChild() {
		return this.leftChild!=null;
	}

	public boolean hasRightChild() {
		return this.rightChild!=null;
	}
	@Override
	public String toString() {
		return this.getData().toString();
	}
	
	public BinaryTree<Integer> generarArbolDeInteger(){
		BinaryTree<Integer> actual;
		actual = Azar.generarArbolInteger();
		return actual;
	}

	public  int contarHojas() {
		int result = 0;
		if ((this.isEmpty())) return 0;
		else {
			if(!this.isLeaf()) {
				if (this.hasLeftChild()) {
					result = result + this.getLeftChild().contarHojas();
				}
				if (this.hasRightChild()) {
					result = result + this.getRightChild().contarHojas();
				}
			}
			else result ++;
		}
		return result; 
	}
	
	private BinaryTree<T> recorrerEspejo(BinaryTree<T> nuevo, BinaryTree<T> viejo){
		if (viejo != null) {
			if (viejo.hasLeftChild()) {
				nuevo.addRightChild(viejo.getLeftChild());
				recorrerEspejo(nuevo.getLeftChild(), viejo.getRightChild());
			} 
			if (this.hasRightChild()) {
				nuevo.addLeftChild(viejo.getRightChild());
				recorrerEspejo(viejo.getRightChild(), nuevo.getLeftChild());
			}
			
		}
		return nuevo;
	}
	
    public BinaryTree<T> espejo(){
		BinaryTree<T> nuevoArbol = new BinaryTree<T>(this.getData());
		if (this.isEmpty()) return null;
		else {
			if (this.hasLeftChild()) {
				nuevoArbol.addRightChild(this.getLeftChild());
				recorrerEspejo(nuevoArbol.getRightChild(), this.getLeftChild());
				System.out.println(nuevoArbol.getRightChild());
			}
			if (this.hasRightChild()) {
				nuevoArbol.addLeftChild(this.getRightChild());
				recorrerEspejo(nuevoArbol.getLeftChild(), this.getRightChild());
			}
			return nuevoArbol;
		}
    }
    public void imprimirArbol() {
        if(this.hasLeftChild()) this.getLeftChild().imprimirArbol();
        System.out.print(this.getData() + " ");
        if(this.hasRightChild()) this.getRightChild().imprimirArbol();
    }
    
    public void entreNiveles(int n, int m) {
    	BinaryTree<T> ab = null;
    	Queue<BinaryTree<T>> cola = new LinkedList<>();
    	cola.offer(this);
    	cola.offer(null);
    	int nivelActual = 0;
    	while (!cola.isEmpty()) {
    		System.out.println("NIVEL ACTUAL: "+nivelActual);
    		if (nivelActual>= n && nivelActual<= m) {

    			int cantidadDeNodos = cola.size();
    			System.out.println("NODOS: "+cantidadDeNodos+"\n");
    			while (cantidadDeNodos > 0) {
        			ab = cola.poll();
        			if (ab != null) {
        				System.out.println("ACTUAL: "+ab.getData());
	        			if (ab.hasLeftChild()) {
	        				cola.offer(ab.getLeftChild());
	        				System.out.println("HIJO IZQ: "+ab.getLeftChild());
	        			}
	        			if (ab.hasRightChild()) {
	        				cola.offer(ab.getRightChild());
	        				System.out.println("HIJO DER: "+ab.getRightChild());
	        			}
	        			cantidadDeNodos--;
        			} else if (!cola.isEmpty()) {
        				System.out.println("PASANDO DE NIVEL... \n");
        				cola.offer(null);
        				cantidadDeNodos--;		
        				nivelActual++;
        			}
    			}
    		}
    		
    		
    	}
    }
	// 0<=n<=m
	/*public void entreNiveles(int n, int m){
		if (this.isEmpty() || n<0 || m<n) return;
		Queue<BinaryTree<T>> cola = new LinkedList(); 
		cola.add(this);
		cola.add(null);
		int nivel = 0;
		while (!cola.isEmpty()) {
			int nodoNivel = cola.size();
			if (nivel >= n && nivel <= m) {
				System.out.println("TAMAÑO DE COLA "+nodoNivel);
				System.out.println("NIVEL ACTUAL "+nivel+"\n");
				for (int i=0; i<nodoNivel; i++) {
					BinaryTree<T> nodo = cola.remove();
					//if (nodo != null) {

						if (nodo != null ) System.out.println("ELEMENTO ACTUAL: "+nodo.getData()+ " ");
						if (nodo!= null && nodo.hasLeftChild()) {
							cola.add(nodo.getLeftChild());
							System.out.println("HIJO IZQ " + nodo.getLeftChild());
						}
						if (nodo != null && nodo.hasRightChild()) {
							cola.add(nodo.getRightChild());
							System.out.println("HIJO DER " + nodo.getRightChild());
						}
					
						System.out.println();
					//} else {
					//	System.out.println("NODO VACIO, FIN DEL NIVEL "+ "\n");
					//	cola.add(null);
					//}
					}

				} else {
					for (int i=0; i<nodoNivel; i++) {
						cola.remove();
					}
				}
				nivel++;		
		}
		System.out.println("LISTO");
	} */ // 4 5 6 null 

			
				/*ab = cola.dequeue();
				if (ab != null) System.out.println(ab.getData()+ " | ");
				else System.out.println("ab esta vacio | ");
				if (ab != null) {
					if (ab.hasLeftChild())
						cola.enqueue(ab.getLeftChild());
					if (ab.hasRightChild())
						cola.enqueue(ab.getRightChild());
				}  else {
					cola.enqueue(null);
					nivel++;
				}*/
			
			
		

	
	
		
}

