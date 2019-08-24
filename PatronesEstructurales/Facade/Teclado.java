package PatronesEstructurales.Facade;

public class Teclado implements IComponente {
    @Override
    public void conectar() {
        System.out.println("Teclado conectado USB");
    }
}
