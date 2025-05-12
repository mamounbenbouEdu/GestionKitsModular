package builder;

import composite.Kit;
import modelo.Elemento;

import java.util.ArrayList;
import java.util.List;

public class KitBuilder {
    private int codigo;
    private List<Elemento> componentes = new ArrayList<>();

    public KitBuilder setCodigo(int codigo) {
        this.codigo = codigo;
        return this;
    }

    public KitBuilder addComponente(Elemento e) {
        componentes.add(e);
        return this;
    }

    public Kit build() {
        Kit kit = new Kit(codigo);
        for (Elemento e : componentes) {
            kit.agregarComponente(e);
        }
        return kit;
    }
}
