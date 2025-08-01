package tp1ejercicio3;
public class Estudiante {
    private String nombre;
    private String apellido;
    private String comision;
    private String email;
    private String direc;
    public Estudiante (String nom, String ap, String com, String email, String direc){
        this.nombre = nom;
        this.apellido = ap;
        this.comision = com;
        this.email = email;
        this.direc = direc;
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

    public String getComision() {
        return this.comision;
    }

    public void setComision(String comision) {
        this.comision = comision;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDirec() {
        return this.direc;
    }

    public void setDirec(String direc) {
        this.direc = direc;
    }

    public String tusDatos(){
        String aux ="";
        aux+= "Nombre: "+ this.getNombre()+ " Apellido: "+ this.getApellido() +
        " Email: "+ this.getEmail()+ " Comision: "+ this.getComision()+ " Direccion: "+ this.getDirec();
        return aux;

    }
}
