package PatronesEstructurales.Decorator;

public class Peperoni implements IPizza {
    @Override
    public String Descripcion() {
        return "Pizza Peperoni";
    }

    @Override
    public int Precio() {
        return 10;
    }
}
