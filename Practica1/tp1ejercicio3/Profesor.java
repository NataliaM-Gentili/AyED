package tp1ejercicio3;
public class Profesor {
    private String nombre;
    private String apellido;
    private String email;
    private String catedra;
    private String facultad;

    public Profesor(String nombre, String apellido, String email, String catedra, String facultad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.catedra = catedra;
        this.facultad = facultad;    
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCatedra() {
        return this.catedra;
    }

    public void setCatedra(String catedra) {
        this.catedra = catedra;
    }

    public String getFacultad() {
        return this.facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String tusDatos() {
        String aux ="";
        aux+= "Nombre: "+ this.getNombre()+ " Apellido: "+ this.getApellido()+
         " Email: "+ this.getEmail()+" Catedra: "+ this.getCatedra() + " Facultad: "+ this.getFacultad();
        return aux;
    }
}
