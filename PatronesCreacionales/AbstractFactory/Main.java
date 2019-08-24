package PatronesCreacionales.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        AppleStore apple = new AppleStore();

        IComputadora imac = apple.CrearComputadora();
        ITablet ipad = apple.CrearTablet();

        ipad.Encender();
        imac.Encender();
    }
}
