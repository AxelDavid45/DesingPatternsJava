package PrincipiosSOLID.inversionDependencias;

public class MainSegregacion {

    public static void main(String[] args) {
        Teclado tec = new Teclado();
        Mouse mouse = new Mouse();
        Computadora comp = new Computadora(tec, mouse);

        comp.encender();

    }
}
