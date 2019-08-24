package PatronesCreacionales.Singleton;

class Database {
    //Para aplicar el patron singleton no debemos permitir que se hagan multiples instancias de la clase

    private static Database conexion;

    private Database() {

    }

    static synchronized Database ObtenerConexion() {
        if (Database.conexion == null) {
            conexion = new Database();
        }
        return conexion;
    }

}
