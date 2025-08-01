package tp5;
import practicaGrafos.adjList.*;

public class implementacionMain {
	public static void main (String [] args) {
		
		Graph<String> grafo = new AdjListGraph<String>();
		
		Vertex<String> abuelita = grafo.createVertex("casa abuelita");
		Vertex<String> caperucita = grafo.createVertex("casa caperucita");
		Vertex<String> uno = grafo.createVertex("claro 1");
		Vertex<String> dos = grafo.createVertex("claro 2");
		Vertex<String> tres = grafo.createVertex("claro 3");
		Vertex<String> cuatro = grafo.createVertex("claro 4");
		Vertex<String> cinco = grafo.createVertex("claro 5");
		
		grafo.connect(caperucita, tres, 4);
		grafo.connect(caperucita, uno, 3);
		grafo.connect(caperucita, dos, 4);
		grafo.connect(tres, cinco, 15);
		grafo.connect(uno, cinco, 3);
		grafo.connect(uno, dos, 4);
		grafo.connect(dos, cinco, 11);
		grafo.connect(dos, cuatro, 10);
		grafo.connect(cinco, abuelita, 4);
		grafo.connect(cuatro, abuelita, 9);
		
	}
}