package tp1ejercicio7;
import tp1ejercicio3.Estudiante;
import java.util.*;
public class Ejercicio7 {
	public static void main (String[] args) {
		List <Estudiante> lista = new LinkedList<Estudiante>();
		Estudiante Lucio = new Estudiante ("Lucio", "Luque", "3A", "lucioluque", "c 20 n 746");
		lista.add(Lucio);
		Estudiante Ine = new Estudiante ("Ine", "Montalvo", "2B", "inemontalvo", "c 476 n 573");
		lista.add(Ine);
        Estudiante Valen = new Estudiante ("Valentino", "Gaston", "5C", "valengaston", "c 167 1434");
        lista.add(Valen);
        
        List <Estudiante> copiaLista = new LinkedList <Estudiante>();
        copiaLista = lista;
        
        for (Estudiante act : lista) {
        	System.out.println(act.tusDatos());
        }
        
        System.out.println();
        
        for (Estudiante act : copiaLista) {
        	System.out.println(act.tusDatos());
        }
        
        System.out.println();
        System.out.println("CAMBIO LISTA");
        System.out.println();
        lista.set(0, new Estudiante("Pauli", "Leoz,", "2b", "paulinaleoz","km 15"));
        
        for (Estudiante act : lista) {
        	System.out.println(act.tusDatos());
        }
        
        System.out.println();
        
        for (Estudiante act : copiaLista) {
        	System.out.println(act.tusDatos());
        }
        
        Estudiante Leban = new Estudiante("Pili","Leban","4E","pilile","c 454 345");
        if (!lista.contains(Leban)) {
        	lista.add(Leban);
        	System.out.println("El/La estudiante ha sido agregado/a");
        } else {
        	System.out.println("El alumno ya existe");   	
        }
        
        
	
	}
}