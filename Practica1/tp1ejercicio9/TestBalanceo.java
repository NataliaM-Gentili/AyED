package tp1ejercicio9;
import java.util.*;
public class TestBalanceo {
	public static boolean validar(String expresion) {
		List<Character> finales = new LinkedList <Character>();
		finales.add(')'); 
		finales.add(']');
		finales.add('}');
		boolean contiene = (finales.contains(expresion.charAt(0)));
		if ((expresion.length()% 2 != 0) & (!(contiene))) 
			return false;
		else {
			List<Character> apertura = new LinkedList <Character>();
			apertura.add('('); 
			apertura.add('[');
			apertura.add('{');
			Stack <Character> stack = new Stack <Character>();
			for (int i=0; i< expresion.length(); i++) {	
				char actual = expresion.charAt(i); //tomo elemento actual
				if (apertura.contains(actual)) {
					System.out.println(actual + " ACTUAL");
					stack.push(actual);
				} else if (stack.isEmpty())
					return false;
				else { 
					char elem = stack.pop();
					System.out.println(elem+ " ELEMENTO POPEADO");
					if (apertura.indexOf(elem) != finales.indexOf(actual)) return false; 
				}		
			}
			return (stack.isEmpty());
		}
			
	}
	
}