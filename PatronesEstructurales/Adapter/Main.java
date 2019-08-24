package PatronesEstructurales.Adapter;

public class Main {
    public static void main(String[] args) {
        DbSQL mysql = new Adapter(new MongoDb());

        mysql.conectar();
        mysql.run();
    }
}
