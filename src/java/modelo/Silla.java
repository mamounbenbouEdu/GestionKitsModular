package modelo;


public class Silla extends Elemento {
    public Silla(int codigo, double precio) {
        super(codigo, precio);
    }

    @Override
    public double getPrecio() {
        return precio;
    }
}
