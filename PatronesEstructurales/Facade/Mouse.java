package PatronesEstructurales.Facade;

public class Mouse implements IComponente {
    @Override
    public void conectar() {
        System.out.println("Mouse conectado USB");
    }
}
