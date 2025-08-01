package tp3ejercicio1;
import tp3ejercicio1.RecorridosAG.*;
//import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MCag {
	/*public static void main (String[] args) {
		GeneralTree<Integer> a1 = new GeneralTree<Integer>(1);
		List<GeneralTree<Integer>> children2 = new LinkedList<GeneralTree<Integer>>();
		List<GeneralTree<Integer>> children2B = new LinkedList<GeneralTree<Integer>>();
		children2B.add(new GeneralTree<Integer>(30));
		children2B.add(new GeneralTree<Integer>(31));
		GeneralTree<Integer> a2B = new GeneralTree<Integer>(21, children2B);
		children2.add(a2B);
		children2.add(new GeneralTree<Integer>(22));
		children2.add(new GeneralTree<Integer>(23));
		GeneralTree<Integer> a2 = new GeneralTree<Integer>(2, children2);
		List<GeneralTree<Integer>> children3 = new LinkedList<GeneralTree<Integer>>();
		children3.add(new GeneralTree<Integer>(7));
		children3.add(new GeneralTree<Integer>(56));
		children3.add(new GeneralTree<Integer>(88));
		GeneralTree<Integer> a3 = new GeneralTree<Integer>(3, children3);
		List<GeneralTree<Integer>> childen = new LinkedList<GeneralTree<Integer>>();
		childen.add(a1);childen.add(a2);childen.add(a3);
		GeneralTree<Integer> a = new GeneralTree<Integer>(0, childen);
		
		//System.out.print("Ingrese un numero N");
		//Scanner s = new Scanner(System.in);
		//Integer num = s.nextInt();
		//List<Integer> listaRetornada = new LinkedList<Integer>();
		//RecorridosAG ag = new RecorridosAG();
		//listaRetornada = ag.numerosImparesMayoresQuePorNiveles(a, num);

		//System.out.println("-----------------------------------");
		//System.out.println("Lista obtenida ");
		//for (Integer act : listaRetornada) {
		//	System.out.println(act); 
		//}
		
		
		System.out.println("La altura del arbol es "+a.altura());
		System.out.println("El nivel donde se encuentra el numero 23 es "+a.nivel(23));
		System.out.println("El ancho del arbol es "+a.ancho());
		
		
	}*/ 
	    public static void main(String[] args) {
	        // Nivel 0
	        GeneralTree<Integer> root = new GeneralTree<>(1);

	        // Nivel 1
	        GeneralTree<Integer> n2 = new GeneralTree<>(2);
	        GeneralTree<Integer> n3 = new GeneralTree<>(3);
	        root.addChild(n2);
	        root.addChild(n3);

	        // Nivel 2
	        GeneralTree<Integer> n4 = new GeneralTree<>(4);
	        GeneralTree<Integer> n5 = new GeneralTree<>(5);
	        n2.addChild(n4);
	        n2.addChild(n5);

	        GeneralTree<Integer> n6 = new GeneralTree<>(6);
	        GeneralTree<Integer> n8 = new GeneralTree<>(8);
	        n3.addChild(n6);
	        n3.addChild(n8);

	        // Nivel 3
	        GeneralTree<Integer> n9 = new GeneralTree<>(9);
	        n4.addChild(new GeneralTree<>(6)); // hijo 1 de 4
	        n4.addChild(n9);                   // hijo 2 de 4

	        n6.addChild(new GeneralTree<>(18));
	        n6.addChild(new GeneralTree<>(19));

	        GeneralTree<Integer> n25 = new GeneralTree<>(25);
	        n6.addChild(n25);

	        GeneralTree<Integer> n32 = new GeneralTree<>(32);
	        n8.addChild(n32);

	        // Nivel 4
	        n9.addChild(new GeneralTree<>(20));
	        n9.addChild(new GeneralTree<>(21));
	        n9.addChild(new GeneralTree<>(22));
	        n9.addChild(new GeneralTree<>(23));

	        n25.addChild(new GeneralTree<>(40));

	        GeneralTree<Integer> n63 = new GeneralTree<>(63);
	        n32.addChild(n63);

	        System.out.println("La altura del arbol es "+root.altura());
			System.out.println("El nivel donde se encuentra el numero 23 es "+root.nivel(23));
			System.out.println("El ancho del arbol es "+root.ancho());
	        
	        System.out.println("Ingrese datos numericos a y b ");
	        Scanner s = new Scanner(System.in);
	        Integer a = s.nextInt();
	        Integer b = s.nextInt();
	        System.out.println("Viendo si "+b+" es ancestro de "+a+"...");
	        System.out.println(root.esAncestro(a, b));
	    }
	}


