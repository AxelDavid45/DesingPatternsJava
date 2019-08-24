package PatronesCreacionales.AbstractFactory;

public class AppleStore implements IAbstractFactory {
    @Override
    public IComputadora CrearComputadora() {
        return new IMac();
    }

    @Override
    public ITablet CrearTablet() {
        return new IPad();
    }
}
