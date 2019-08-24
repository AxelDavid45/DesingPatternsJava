package PatronesCreacionales.FactoryMethod;

public class MainFactoryMethod {

    public static void main(String[] args) {
        Pizzeria lasPizzas = new Pizzeria();

        Pizza Peperoni = lasPizzas.crearPizza("Peperoni");
        Pizza Hawaiana = lasPizzas.crearPizza("Hawaiana");

        System.out.println(Peperoni);
        System.out.println(Hawaiana);
    }
}
