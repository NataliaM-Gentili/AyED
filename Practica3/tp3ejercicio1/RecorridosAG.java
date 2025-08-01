package tp3ejercicio1;
import tp3ejercicio1.GeneralTree;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import tp1ejercicio8.Queue;

public class RecorridosAG {

	public List<Integer> numerosImparesMayoresQuePreOrden (GeneralTree<Integer> a, Integer n){
		List<Integer> lista = new LinkedList<Integer>();
		if (!a.isEmpty()) recorridoPreOrden(a, n, lista);
		return lista;
	}
	private static List<Integer> recorridoPreOrden(GeneralTree<Integer> ab, Integer n, List<Integer> lista) {
		System.out.println(ab.getData());
		if ((ab.getData() > n)&&(ab.getData() % 2 != 0)) lista.add(ab.getData());
		List<GeneralTree<Integer>> children = ab.getChildren();
		for (GeneralTree<Integer> child: children) {
			recorridoPreOrden(child, n, lista);
		}
		return lista;
	}
	
	
	public List<Integer> numerosImparesMayoresQueInOrden (GeneralTree<Integer> a, Integer n){
		List<Integer> list = new LinkedList<Integer>();
		if (!a.isEmpty()) recorridoInOrden(a, n ,list);
		return list;
	}
	private static List<Integer> recorridoInOrden(GeneralTree<Integer> ab, Integer n, List<Integer> list){
		if (ab.hasChildren()) {
			recorridoInOrden(ab.getChildren().get(0), n, list);
		}
		System.out.println("ELEMENTO ACTUAL "+ab.getData());
		if ((ab.getData() % 2 != 0)&&(ab.getData() > n)) {
			list.add(ab.getData());
		}
		for (int i= 1; i<ab.getChildren().size(); i++) {
			recorridoInOrden(ab.getChildren().get(i), n, list);
		}
		return list;
	}
	
	
	public List<Integer> numerosImparesMayoresQuePostOrden(GeneralTree<Integer> a, Integer n){
		List<Integer> list = new LinkedList<Integer>();
		if (!a.isEmpty()) recorridoPostOrden(a, n, list);
		return list;
	}
	private static List<Integer> recorridoPostOrden(GeneralTree<Integer> ab, Integer n, List<Integer> lista){
		if (ab.hasChildren()) {
			recorridoInOrden(ab.getChildren().get(0), n, lista);
			for (int i=1; i<ab.getChildren().size(); i++) {
				recorridoInOrden(ab.getChildren().get(i), n, lista);
			}
		}
		System.out.println("ELEMENTO ACT "+ab.getData());
		if ((ab.getData() % 2 != 0)&&(ab.getData() > n)) lista.add(ab.getData());
		return lista;
	}
	
	public List<Integer> numerosImparesMayoresQuePorNiveles (GeneralTree<Integer> a, Integer n){
		List<Integer> list = new LinkedList <Integer>();
		if (!a.isEmpty()) recorridoPorNiveles(a, n ,list);
		return list;
	}
	private static List<Integer> recorridoPorNiveles(GeneralTree<Integer> ab, Integer n, List<Integer> list){
		GeneralTree<Integer> aux;
		Queue<GeneralTree<Integer>> queue = new Queue<GeneralTree<Integer>>();
		queue.enqueue(ab);
		while(!queue.isEmpty()) {
			aux = queue.dequeue();
			System.out.println("ELEMENTO ACTUAL "+aux.getData());
			if ((aux.getData() % 2 != 0)&&(aux.getData() > n)) list.add(aux.getData());
			List<GeneralTree<Integer>> children = aux.getChildren();
			for (GeneralTree<Integer> child: children) {
				queue.enqueue(child);
			}
		}
		return list;
	}
	
	
	

}