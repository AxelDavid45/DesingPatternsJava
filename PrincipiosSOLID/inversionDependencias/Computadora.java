package PrincipiosSOLID.inversionDependencias;

public class Computadora {
    private ITeclado tec;
    private IMouse mous;

    public Computadora (ITeclado tec, IMouse mous) {
        this.tec = tec;
        this.mous =  mous;
    }

    public void encender () {
        this.mous.conectar();
        this.tec.conectar();
    }
}
