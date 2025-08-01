package tp3ejercicio8;
import tp3ejercicio1.GeneralTree;
import java.util.*;

public class Navidad {
	private GeneralTree<Integer> ab;
	
	public Navidad (GeneralTree<Integer> ab) {
		this.ab = ab;
	}
	
	public String esAbetoNavidenio() {
		String noEs = "No es abeto navidenio";
		
		if (this.ab != null && !(this.ab.isEmpty())) {
			boolean ok = (esAbeto(this.ab, true));
			System.out.println(ok);
			if (ok) return "Es abeto";
		}
		return noEs;
	}
	
	private boolean esAbeto(GeneralTree<Integer> ab, boolean encontre) { 
		Iterator<GeneralTree<Integer>> it = ab.getChildren().iterator();
		int cont = 0;
		while ((encontre) && (it.hasNext())) {
			GeneralTree<Integer> nodo = it.next();
			if (nodo.isLeaf()) cont++;
			else encontre = esAbeto(nodo, encontre);
		}
		if (encontre)
			if (!(cont >= 3)) encontre = false;
		System.out.println(encontre);
		return encontre;
	}
	
	
	
	public static void main (String [] args) {
		//nivel 0
		GeneralTree<Integer> root = new GeneralTree<Integer>(1);
		//nivel 1
		GeneralTree<Integer> n1 = new GeneralTree<Integer>(2);
		GeneralTree<Integer> n2 = new GeneralTree<Integer>(3);
		GeneralTree<Integer> n3 = new GeneralTree<Integer>(4);
		GeneralTree<Integer> n4 = new GeneralTree<Integer>(5);
		root.addChild(n1);
		root.addChild(n2);
		root.addChild(n3);
		root.addChild(n4);
		//nivel 2
		GeneralTree<Integer> n5 = new GeneralTree<Integer>(41);
		GeneralTree<Integer> n6 = new GeneralTree<Integer>(6);
		GeneralTree<Integer> n7 = new GeneralTree<Integer>(7);
		GeneralTree<Integer> n8 = new GeneralTree<Integer>(8);
		GeneralTree<Integer> n9 = new GeneralTree<Integer>(9);
		n3.addChild(n5);
		n3.addChild(n6);
		n3.addChild(n7);
		n3.addChild(n8);
		n3.addChild(n9);
		//nivel 3
		GeneralTree<Integer> n10 = new GeneralTree<Integer>(10);
		GeneralTree<Integer> n11 = new GeneralTree<Integer>(11);
		GeneralTree<Integer> n12 = new GeneralTree<Integer>(12);
		n8.addChild(n10);
		n8.addChild(n11);
		n8.addChild(n12);
		
		Navidad n = new Navidad(root);
		System.out.println(n.esAbetoNavidenio());
	}
}
