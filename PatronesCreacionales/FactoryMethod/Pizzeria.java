package PatronesCreacionales.FactoryMethod;

public class Pizzeria implements IPizzeria {

    @Override
    public Pizza crearPizza(String Especialidad) {

        if (Especialidad.equals("Peperoni")) {
            return new Pizza(8, "Peperoni");
        }

        if (Especialidad.equals("Hawaiana")) {
            return new Pizza(8, "Hawaiana");
        }

        return null;

    }
}
