package PatronesEstructurales.Adapter;

public class Mysql implements DbSQL {
    @Override
    public void conectar() {
        System.out.println("Conexion SQL");
    }

    @Override
    public void run() {
        System.out.println("Consulta SQL");
    }
}
