package PatronesEstructurales.Facade;

public class ComputadoraDell implements IComputadora {
    private IComponente mouse;
    private IComponente teclado;

    public ComputadoraDell(IComponente mouse, IComponente teclado) {
        this.mouse = mouse;
        this.teclado = teclado;
    }

    @Override
    public void encender() {
        System.out.println("Computadora encendida");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando computadora");
    }

    public void ConectarMouse() {
        this.mouse.conectar();
    }

    public void ConectarTeclado() {
        this.teclado.conectar();
    }
}
