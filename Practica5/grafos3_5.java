

private int verConCombustible (Graph<String> grafo, String ciudad1, String ciudad2, int i, int paradas, int minimoParadas, boolean[] marca, Vertex<String> anterior) {
	
	marca[i] = true;
	Vertex<String> actual = grafo.getVertex(i);
	
	int arista = weight(anterior,actual);
	if (arista <= capacidad) {
		listaAux.add(actual.getData());
		
		tanqueActual -= arista;
		
		if (tanqueActual < arista) {
			tanqueActual = constante;
			paradas += 1;
			
		}
		
		if (actual.getData().equals(ciudad2)) {
			if (paradas < minimoParadas) {
				listaRetorno.clear();
				listaRetorno.addAll(listaAux);
				minimoParadas = paradas;
			}
		}
		else {
			Iterator <Edge<String>> it = grafo.getEdge(actual).iterator();
			while (it.hasNext()) {
				i = it.next().getTarget().getPosition();
				if (!(marca[i])){
					minimoParadas = verConCombustible();
					marca[i] = false;
				}
			}
		}
		listaAux.remove(listaAux.size()-1);	
	}
	return minimoParadas;
}