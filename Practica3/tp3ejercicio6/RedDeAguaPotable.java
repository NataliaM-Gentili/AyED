package tp3ejercicio6;
import tp3ejercicio1.GeneralTree;

public class RedDeAguaPotable {
	private GeneralTree<Character> ab;
	
	public RedDeAguaPotable(GeneralTree<Character>a) {
		this.ab = a;
	}
	public double minimoCaudal(double caudal) {
		if (this.ab != null && !(this.ab.isEmpty())){
			return verCaudal(this.ab, caudal);
		}
		return -1;
	}
		
	private double verCaudal (GeneralTree<Character> ab, double caudal) {
		if (ab.isLeaf()) return caudal;
		double min = 99999;
		if (ab.hasChildren()) {
			caudal = caudal / ab.getChildren().size();
			for (GeneralTree<Character> child : ab.getChildren()) {
				min = Math.min(min, verCaudal(child, caudal));
			}
		}
		return min;
	}

	 
	  public static void main(String[] args) {
	        // Nivel 0
	        GeneralTree<Character> A = new GeneralTree<>('A');

	        // Nivel 1
	        GeneralTree<Character> B = new GeneralTree<>('B'); // hoja
	        GeneralTree<Character> C = new GeneralTree<>('C');
	        GeneralTree<Character> D = new GeneralTree<>('D');
	        GeneralTree<Character> E = new GeneralTree<>('E');

	        A.addChild(B);
	        A.addChild(C);
	        A.addChild(D);
	        A.addChild(E);

	        // Nivel 2 - hijos de C
	        GeneralTree<Character> F = new GeneralTree<>('F');
	        GeneralTree<Character> G = new GeneralTree<>('G');
	        C.addChild(F);
	        C.addChild(G);

	        // Nivel 3 - hijo de G
	        GeneralTree<Character> L = new GeneralTree<>('L');
	        G.addChild(L);

	        // Nivel 2 - hijos de D
	        GeneralTree<Character> H = new GeneralTree<>('H');
	        GeneralTree<Character> I = new GeneralTree<>('I');
	        GeneralTree<Character> J = new GeneralTree<>('J');
	        GeneralTree<Character> K = new GeneralTree<>('K');
	        GeneralTree<Character> P = new GeneralTree<>('P');
	        D.addChild(H);
	        D.addChild(I);
	        D.addChild(J);
	        D.addChild(K);
	        D.addChild(P);

	        // Nivel 3 - hijos de J
	        GeneralTree<Character> M = new GeneralTree<>('M');
	        GeneralTree<Character> N = new GeneralTree<>('N');
	        J.addChild(M);
	        J.addChild(N);
	        
	        
	        RedDeAguaPotable RA = new RedDeAguaPotable(A);
	        System.out.println("El caudal minimo hasta una casa es de "+RA.minimoCaudal(1000));
	    }
}
