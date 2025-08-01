package tp2ejercicio2;
import tp1ejercicio8.Queue;

public class porNiveles<T> extends BinaryTree<T>{
	private T data;
	
	public porNiveles(int i) {
		super();
	}
	public void pruebaNiveles(int n, int m) {

    	BinaryTree<T> ab = null;
    	Queue<BinaryTree<T>> cola = new Queue<BinaryTree<T>>();
    	cola.enqueue(this);
    	cola.enqueue(null);
    	int nivelActual = 0;
    	while (!cola.isEmpty()) {
    		System.out.println("NIVEL ACTUAL: "+nivelActual);
    		if (nivelActual>= n && nivelActual<= m) {

    			int cantidadDeNodos = cola.size();
    			System.out.println("NODOS: "+cantidadDeNodos+"\n");
    			while (cantidadDeNodos > 0) {
        			ab = cola.dequeue();
        			if (ab != null) {
        				System.out.println("ACTUAL: "+ab.getData());
	        			if (ab.hasLeftChild()) {
	        				cola.enqueue(ab.getLeftChild());
	        				System.out.println("HIJO IZQ: "+ab.getLeftChild());
	        			}
	        			if (ab.hasRightChild()) {
	        				cola.enqueue(ab.getRightChild());
	        				System.out.println("HIJO DER: "+ab.getRightChild());
	        			}
	        			cantidadDeNodos--;
        			} else if (!cola.isEmpty()) {
        				System.out.println("PASANDO DE NIVEL... \n");
        				cola.enqueue(null);
        				cantidadDeNodos--;		
        				nivelActual++;
        			}
    			}
    		}
    	}
	}
}