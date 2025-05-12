package modelo;


public class Mesa extends Elemento {
    public Mesa(int codigo, double precio) {
        super(codigo, precio);
    }

    @Override
    public double getPrecio() {
        return precio;
    }
}
