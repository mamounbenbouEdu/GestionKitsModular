import modelo.Mesa;
import modelo.Silla;
import composite.Kit;
import builder.KitBuilder;
import factory.KitFactory;

public class Main {
    public static void main(String[] args) {

        KitBuilder builder = new KitBuilder()
                .setCodigo(100)
                .addComponente(new Mesa(1, 200.0))
                .addComponente(new Silla(2,  50.0))
                .addComponente(new Silla(3,  50.0));
        Kit kitPersonalizado = builder.build();
        System.out.println("Kit personalizado (código "
                + kitPersonalizado.getCodigo() + "): Precio = "
                + kitPersonalizado.getPrecio());


        Kit kitOficina = KitFactory.crearKitOficina(200);
        System.out.println("Kit oficina (código "
                + kitOficina.getCodigo() + "): Precio = "
                + kitOficina.getPrecio());

        Kit kitSalon = KitFactory.crearKitSalon(300);
        System.out.println("Kit salón (código "
                + kitSalon.getCodigo() + "): Precio = "
                + kitSalon.getPrecio());
    }
}
