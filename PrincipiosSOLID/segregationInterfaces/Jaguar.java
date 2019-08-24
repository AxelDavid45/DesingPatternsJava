package PrincipiosSOLID.segregationInterfaces;

public class Jaguar implements IFelinoSalvaje{

    @Override
    public void rugir() {
        System.out.println("El jaguar ruge");
    }

    @Override
    public void cazar() {
        System.out.println("El jaguar caza");
    }
}
