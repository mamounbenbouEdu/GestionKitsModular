package composite;

import modelo.Elemento;

import java.util.ArrayList;
import java.util.List;

public class Kit extends Elemento {
    private List<Elemento> componentes;

    public Kit(int codigo) {
        super(codigo, 0.0);
        this.componentes = new ArrayList<>();
    }

    public void agregarComponente(Elemento e) {
        componentes.add(e);
    }

    public List<Elemento> getComponentes() {
        return componentes;
    }

    @Override
    public double getPrecio() {
        double total = 0;
        for (Elemento e : componentes) {
            total += e.getPrecio();
        }

        return total * 0.9;
    }
}
