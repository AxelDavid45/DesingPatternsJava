package PatronesCreacionales.SimpleFactory;

public class MainSimpleFactory {

    public static void main(String[] args) {
        //Create a pizza with the factory
        Pizzeria factory = new Pizzeria();
        // Order a pizza in any size
        Pizza pizzaPeperoni = factory.mediumPizza();

        System.out.println(pizzaPeperoni);
    }
}
