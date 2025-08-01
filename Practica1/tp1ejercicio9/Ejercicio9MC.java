package tp1ejercicio9;
import java.util.*;

public class Ejercicio9MC {
	public static void main (String[] args) {
		System.out.print("Ingrese una secuencia de simbolos de apertura y cierre");
		System.out.print("para ver si estan balanceados");
		Scanner s = new Scanner(System.in);
		String secuencia = s.nextLine();
		System.out.println(secuencia + " SECUENCIA INGRESADA");
		System.out.println();
		boolean ok = TestBalanceo.validar(secuencia);
		if (ok) System.out.println("La secuencia esta balanceada");
		else System.out.println("La secuencia no esta balanceada");
		System.out.println();
		System.out.println();
		s.close();
	}
}
