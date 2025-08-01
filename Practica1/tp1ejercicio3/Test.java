package tp1ejercicio3;

public class Test {
    public static void main (String[] args){
        Estudiante[] estudiantes = new Estudiante[2];
        Estudiante Lucio = new Estudiante ("Lucio", "Luque", "3A", "lucioluque", "c 20 n 746");
        Estudiante Ine = new Estudiante ("Ines", "Montalvo", "2B", "inemontalvo", "c 476 n 573");
        estudiantes[0] = Lucio;
        estudiantes[1] = Ine;

        Profesor[] profesores = new Profesor[3];
        Profesor Gonza = new Profesor ("Gonza", "CADP", "gonzacadp", "Informatica", "UNLP");
        Profesor Juani = new Profesor("Juani","Taller","juanitaller", "Informatica", "UNLP");
        Profesor Vero = new Profesor("Vero", "Java", "verojava", "Informatica", "UNLP");
        profesores[0] = Gonza;
        profesores[1] = Juani;
        profesores[2] = Vero;
        for (int i=0; i<2; i++) {
            System.out.println(estudiantes[i].tusDatos());
        }
        for (int i=0; i<3; i++){
            System.out.println(profesores[i].tusDatos());
        }
    }

}
