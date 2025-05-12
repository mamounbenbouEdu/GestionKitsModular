package factory;

import builder.KitBuilder;
import composite.Kit;
import modelo.Mesa;
import modelo.Silla;

public class KitFactory {
    
    public static Kit crearKitOficina(int codigoBase) {
        return new KitBuilder()
                .setCodigo(codigoBase)
                .addComponente(new Mesa(codigoBase * 10 + 1, 120.0))
                .addComponente(new Silla(codigoBase * 10 + 2,  45.0))
                .addComponente(new Silla(codigoBase * 10 + 3,  45.0))
                .addComponente(new Silla(codigoBase * 10 + 4,  45.0))
                .addComponente(new Silla(codigoBase * 10 + 5,  45.0))
                .build();
    }


    public static Kit crearKitSalon(int codigoBase) {
        return new KitBuilder()
                .setCodigo(codigoBase)
                .addComponente(new Mesa(codigoBase * 10 + 1, 150.0))
                .addComponente(new Silla(codigoBase * 10 + 2,  60.0))
                .addComponente(new Silla(codigoBase * 10 + 3,  60.0))
                .build();
    }
}
