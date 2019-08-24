package PatronesEstructurales.Adapter;

public class MongoDb implements DbNoSQL {

    @Override
    public void conectar() {
        System.out.println("Conexion MONGODB");
    }

    @Override
    public void executeSentence() {
        System.out.println("Consulta MONGODB");
    }
}
