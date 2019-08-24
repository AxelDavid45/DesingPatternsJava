package PatronesEstructurales.Decorator;

public class Hawaiana implements IPizza {

    @Override
    public String Descripcion() {
        return "Pizza Hawaiana";
    }

    @Override
    public int Precio() {
        return 10;
    }
}
