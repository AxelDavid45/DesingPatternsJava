package PatronesEstructurales.Facade;

public class Facade {
    private IComputadora computadora;

    public Facade() {
        IComponente mouse = new Mouse();
        IComponente teclado = new Teclado();
        this.computadora = new ComputadoraDell(mouse, teclado);
    }

    public void encender() {
        computadora.encender();
    }
}
