package PatronesCreacionales.FactoryMethod;

public class Pizza {
    private int Rebanadas;
    private String Especialidad;

    public Pizza(int rebanadas, String especialidad) {
        this.Rebanadas = rebanadas;
        this.Especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Numero Rebanadas: " + this.Rebanadas + " Especialidad: " + this.Especialidad;
    }
}
