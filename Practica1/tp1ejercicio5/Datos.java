package tp1ejercicio5;
public class Datos {
    private int maximo;
    private int minimo;
    private int promedio;

    public Datos (int a, int b, int c){
        this.maximo = a;
        this.minimo = b;
        this.promedio = c;
    }
    public int getMaximo() {
        return this.maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    public int getMinimo() {
        return this.minimo;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }

    public int getPromedio() {
        return this.promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

}
