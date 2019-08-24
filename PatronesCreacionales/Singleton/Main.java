package PatronesCreacionales.Singleton;

public class Main {
    public static void main(String[] args) {
//        Database conexion1 = Database.ObtenerConexion();
//        Database conexion2 = Database.ObtenerConexion();
//        System.out.println(conexion1.hashCode());
//        System.out.println(conexion2.hashCode());
        // Hacemos singleton de manera concurrente
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Database conexion1 = Database.ObtenerConexion();
                System.out.println(conexion1.hashCode());
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Database conexion2 = Database.ObtenerConexion();
                System.out.println(conexion2.hashCode());
            }
        });

        t1.start();
        t2.start();

    }
}
