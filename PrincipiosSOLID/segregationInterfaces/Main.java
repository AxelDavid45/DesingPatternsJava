package PrincipiosSOLID.segregationInterfaces;

public class Main {

    public static void main(String[] args) {
        IFelinoSalvaje x = new Jaguar();
        x.cazar();
    }
}
