package tp3ejercicio9;

import java.util.Iterator;
import tp3ejercicio1.GeneralTree;
import tp3ejercicio8.Navidad;

public class ParcialArboles {
	
	public static boolean esDeSeleccion (GeneralTree<Integer> arbol){
		if (arbol != null && !(arbol.isEmpty())) {
			if (arbol.getData().equals(verSeleccion(arbol))) return true;
		}
		return false;
	}
	
	private static int verSeleccion (GeneralTree<Integer> arbol) {
		if (arbol.isLeaf()) return arbol.getData();
		else {
			int minHijo = 99999;
			
			Iterator<GeneralTree<Integer>> it = arbol.getChildren().iterator();
			while ((minHijo != -99999) && (it.hasNext())) {
				int aux = verSeleccion(it.next());
				minHijo = Math.min(minHijo,  aux);
			}
			if (!(arbol.getData().equals(minHijo))) return -99999;
		}
		return arbol.getData();
	}
	
	public static void main (String[] args) {
		//nivel 0
		GeneralTree<Integer> root = new GeneralTree<Integer>(12);
		//nivel 1
		GeneralTree<Integer> n1 = new GeneralTree<Integer>(12);
		GeneralTree<Integer> n2 = new GeneralTree<Integer>(25);
		root.addChild(n1);
		root.addChild(n2);

		//nivel 2
		GeneralTree<Integer> n3 = new GeneralTree<Integer>(35);
		GeneralTree<Integer> n4 = new GeneralTree<Integer>(18);
		GeneralTree<Integer> n5 = new GeneralTree<Integer>(25);
		n1.addChild(n3);
		n1.addChild(n4);
		n2.addChild(n5);
		
		//nivel 3
		GeneralTree<Integer> n6 = new GeneralTree<Integer>(35);
		GeneralTree<Integer> n7 = new GeneralTree<Integer>(14);
		GeneralTree<Integer> n8 = new GeneralTree<Integer>(12);
		GeneralTree<Integer> n9 = new GeneralTree<Integer>(33);
		n3.addChild(n6);
		n4.addChild(n7);
		n4.addChild(n8);
		n4.addChild(n9);
			
		//nivel 4
		GeneralTree<Integer> n10 = new GeneralTree<Integer>(35);
		GeneralTree<Integer> n11 = new GeneralTree<Integer>(35);
		GeneralTree<Integer> n12 = new GeneralTree<Integer>(83);
		GeneralTree<Integer> n13 = new GeneralTree<Integer>(90);
		GeneralTree<Integer> n14 = new GeneralTree<Integer>(33);
		n6.addChild(n10);
		n9.addChild(n11);
		n9.addChild(n12);
		n9.addChild(n13);
		n9.addChild(n14);
		
		
		System.out.println(ParcialArboles.esDeSeleccion(root));
					
	}
}