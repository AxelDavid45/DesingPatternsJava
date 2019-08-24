package PatronesEstructurales.Decorator;

public class OrillaRellena implements IPizza {
    private IPizza pizza;

    public OrillaRellena(IPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String Descripcion() {
        return this.pizza.Descripcion() + " con Orilla Rellena";
    }

    @Override
    public int Precio() {
        return this.pizza.Precio() + 4;
    }
}
