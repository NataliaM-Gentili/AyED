package tp3ejercicio1;

import java.util.Iterator;
import java.util.LinkedList;
import tp1ejercicio8.Queue;
import java.util.List;

public class GeneralTree<T>{

	private T data;
	private List<GeneralTree<T>> children = new LinkedList<GeneralTree<T>>(); 

	public GeneralTree() {
		
	}
	public GeneralTree(T data) {
		this.data = data;
	}

	public GeneralTree(T data, List<GeneralTree<T>> children) {
		this(data);
		this.children = children;
	}	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public List<GeneralTree<T>> getChildren() {
		return this.children;
	}
	
	public void setChildren(List<GeneralTree<T>> children) {
		if (children != null)
			this.children = children;
	}
	
	public void addChild(GeneralTree<T> child) {
		this.getChildren().add(child);
	}

	public boolean isLeaf() {
		return !this.hasChildren();
	}
	
	public boolean hasChildren() {
		return !this.children.isEmpty();
	}
	
	public boolean isEmpty() {
		return this.data == null && !this.hasChildren();
	}

	public void removeChild(GeneralTree<T> child) {
		if (this.hasChildren())
			children.remove(child);
	}
	
	public int altura() {	 
		if (this.isEmpty()) return -1;	
		return calcularAltura();
	}
	private int calcularAltura() {
		if (this.isLeaf()) return 0;
		else {
			int altMax = -1;
			List<GeneralTree<T>> children = this.getChildren();
			for (GeneralTree<T> child : children) {
				altMax = Math.max(altMax, child.calcularAltura());
			}
			return altMax + 1;
		}
	}
	
	
	
	public int nivel (T dato) {
		if (this != null && !this.isEmpty()) return calcularNivel(dato, this)-1;
		else return 0;
	}
	
	private int calcularNivel(T dato, GeneralTree<T> ab) {
		if (ab.getData() == dato) return 1;
		
		if (ab.isLeaf()) return 0;
		
		int contador = 0;
		if (ab.hasChildren()) {
			Iterator<GeneralTree<T>> child = ab.getChildren().iterator();
			while ((contador == 0) && (child.hasNext())){
				contador = calcularNivel(dato, child.next());	
			}
			if (contador == 0) return contador;
		}
		return contador + 1;
	}
	
	/*
	public int nivel (T dato) {
		if (this.isEmpty()) return -1;
		return calcularNivel(dato);
	}
	
	private int calcularNivel(T dato){
		Queue<GeneralTree<T>> cola = new Queue<GeneralTree<T>>();
		cola.enqueue(this);
		cola.enqueue(null);
		GeneralTree<T> aux;
		int niveles = 0;
		
		while (!cola.isEmpty()) {
			aux = cola.dequeue();
			System.out.println(aux.getData());
			if (aux != null) {
				if (aux.getData() == dato) return niveles;
				else {
					List<GeneralTree<T>> children = aux.getChildren();
					for (GeneralTree<T> child: children) 
					cola.enqueue(child);
				}	
			}
			else if (!cola.isEmpty()) {
				niveles++;
				cola.enqueue(null);
			}
		}
		return -1;
	}*/

	public int ancho(){
		if (this == null || this.isEmpty()) return -1;
		else {
			if (this.isLeaf()) return 0;
			else return calcularAncho();
		}
	}
	
	private int calcularAncho() {
		int cantMax = 0;
		int cantAct = 0;
		GeneralTree<T> aux;
		Queue<GeneralTree<T>> cola = new Queue<GeneralTree<T>>();
		cola.enqueue(this);
		cola.enqueue(null);
		while (!cola.isEmpty()) {
			aux = cola.dequeue();
			if (aux != null) {
				List<GeneralTree<T>> children = aux.getChildren();
				for (GeneralTree<T> child: children) {
					cola.enqueue(child);
					cantAct++;
				}
			} else if (!cola.isEmpty()){
				cantMax = Math.max(cantMax, cantAct);
				cantAct = 0;
				cola.enqueue(null);
			}
		}
		return cantMax;	
	}
	
	
	
	public boolean esAncestro(T a, T b) {
		boolean listo = false;
		if (this != null && !this.isEmpty()) {
			System.out.println(this.getData());
			if (this.getData().equals(a)) return verAncestro(this, b);
			Iterator <GeneralTree<T>> it = this.getChildren().iterator();
			while (!(listo)&&(it.hasNext())) {
				if (it.next().esAncestro(a, b)) {
					listo = true;
					return true;
				}
			}
		}
		return listo;
	}

	private boolean verAncestro(GeneralTree<T> ab, T b) {
		System.out.println(ab.getData());
		if (ab.getData().equals(b)) return true;
		Iterator <GeneralTree<T>> it = ab.getChildren().iterator();
		while (it.hasNext()) {
			if (verAncestro(it.next(), b)) return true;
		}
		return false;
	}

	
	
}