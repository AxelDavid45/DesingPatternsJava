package PatronesCreacionales.SimpleFactory;

public class Pizzeria {
    // the main function of a factory is create pizzas and do additional steps like insert into a db or request
    // an API

    public Pizza smallPizza() {
        return new Pizza(8);
    }

    public Pizza mediumPizza() {
        return new Pizza(10);
    }

    public Pizza largePizza() {
        return new Pizza(16);
    }

}
