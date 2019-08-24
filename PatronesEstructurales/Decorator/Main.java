package PatronesEstructurales.Decorator;

public class Main {

    public static void main(String[] args) {
        IPizza Hawaiana = new Hawaiana();
        IPizza Peperoni = new Peperoni();

        System.out.println("Peperoni = " + Peperoni.Descripcion());
        System.out.println("Peperoni = " + Peperoni.Precio());

        System.out.println("Hawaiana = " + Hawaiana.Descripcion());
        System.out.println("Hawaiana = " + Hawaiana.Precio());

        IPizza HawaianaRellena = new OrillaRellena(new Hawaiana());

        System.out.println("HawaianaRellena = " + HawaianaRellena.Descripcion());
    }
}
