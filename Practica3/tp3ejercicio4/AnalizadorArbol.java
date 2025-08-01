package tp3ejercicio4;
import tp3ejercicio1.GeneralTree;
import tp1ejercicio8.Queue;
import java.util.*;
public class AnalizadorArbol {
	public double devolverMaximoPromedio(GeneralTree<AreaEmpresa> arbol) {
		if (arbol != null && !arbol.isEmpty()) return calcularPromedio(arbol);
		return -1;
	}
	public double calcularPromedio(GeneralTree<AreaEmpresa> ab) {
		Queue<GeneralTree<AreaEmpresa>> cola = new Queue<GeneralTree<AreaEmpresa>>();
		GeneralTree<AreaEmpresa> aux;
		double maxNivel = 0, prom = 0;
		int suma= 0, cant = 0;
		
		cola.enqueue(ab);
		cola.enqueue(null);
		
		while (!cola.isEmpty()) {
			aux = cola.dequeue();
			if (aux != null) {
				System.out.println("ELEMETO ACTUAL "+aux.getData().getID() + " " +aux.getData().getTardanza());
				suma += aux.getData().getTardanza();
				cant ++;
				List<GeneralTree<AreaEmpresa>> children = aux.getChildren();
				for (GeneralTree<AreaEmpresa> child : children) cola.enqueue(child);
			} else if (cant > 0){
				System.out.println("SUMA "+ suma + " CANT "+cant);
				prom = suma / cant;
				cant = 0;
				suma = 0;
				System.out.println("PROMEDIO "+prom);
				maxNivel = Math.max(prom, maxNivel);
				cola.enqueue(null);
				} else if (!cola.isEmpty()){
				System.out.println("NULL");
				cola.enqueue(null);
			}
			
		}
		return maxNivel;	
	}
	
	public static void main (String[] args) {
		
		GeneralTree<AreaEmpresa> a = new GeneralTree<AreaEmpresa>(new AreaEmpresa("A", 4));
		GeneralTree<AreaEmpresa> b = new GeneralTree<AreaEmpresa>(new AreaEmpresa("B", 7));
		GeneralTree<AreaEmpresa> c = new GeneralTree<AreaEmpresa>(new AreaEmpresa("C", 5));

		GeneralTree<AreaEmpresa> d = new GeneralTree<AreaEmpresa>(new AreaEmpresa("D", 6));
		GeneralTree<AreaEmpresa> e = new GeneralTree<AreaEmpresa>(new AreaEmpresa("E", 10));
		GeneralTree<AreaEmpresa> f = new GeneralTree<AreaEmpresa>(new AreaEmpresa("F", 18));

		GeneralTree<AreaEmpresa> g = new GeneralTree<AreaEmpresa>(new AreaEmpresa("G", 9));
		GeneralTree<AreaEmpresa> h = new GeneralTree<AreaEmpresa>(new AreaEmpresa("H", 12));
		GeneralTree<AreaEmpresa> i = new GeneralTree<AreaEmpresa>(new AreaEmpresa("I", 19));

		// Crear nodos nivel 1 y asignar hijos
		GeneralTree<AreaEmpresa> j = new GeneralTree<AreaEmpresa>(new AreaEmpresa("J", 13));
		List<GeneralTree<AreaEmpresa>> hijosJ = new LinkedList<GeneralTree<AreaEmpresa>>();
		hijosJ.add(a);
		hijosJ.add(b);
		hijosJ.add(c);
		j.setChildren(hijosJ);

		GeneralTree<AreaEmpresa> k = new GeneralTree<AreaEmpresa>(new AreaEmpresa("K", 25));
		List<GeneralTree<AreaEmpresa>> hijosK = new LinkedList<GeneralTree<AreaEmpresa>>();
		hijosK.add(d);
		hijosK.add(e);
		hijosK.add(f);
		k.setChildren(hijosK);

		GeneralTree<AreaEmpresa> l = new GeneralTree<AreaEmpresa>(new AreaEmpresa("L", 10));
		List<GeneralTree<AreaEmpresa>> hijosL = new LinkedList<GeneralTree<AreaEmpresa>>();
		hijosL.add(g);
		hijosL.add(h);
		hijosL.add(i);
		l.setChildren(hijosL);

		// Crear nodo raíz y asignar hijos
		GeneralTree<AreaEmpresa> m = new GeneralTree<AreaEmpresa>(new AreaEmpresa("M", 14));
		List<GeneralTree<AreaEmpresa>> hijosM = new LinkedList<GeneralTree<AreaEmpresa>>();
		hijosM.add(j);
		hijosM.add(k);
		hijosM.add(l);
		m.setChildren(hijosM);
		
		
		AnalizadorArbol AA = new AnalizadorArbol();
		System.out.println("EL promedio maximo es" + AA.devolverMaximoPromedio(m));
		
	}
}