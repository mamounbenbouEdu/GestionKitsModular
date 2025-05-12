package modelo;

public abstract class Elemento {
    protected int codigo;
    protected double precio;

    public Elemento(int codigo, double precio) {
        this.codigo = codigo;
        this.precio  = precio;
    }

    public int getCodigo() {
        return codigo;
    }


    public abstract double getPrecio();
}
