package PatronesCreacionales.Builder;

public class Main {

    public static void main(String[] args) {
        UsuarioModel UsuarioNuevo =
                UsuarioModel.Make("Axel David", "Espinosa Meneses")
                        .setMedioContacto(true)
                        .setDireccion("Prueba")
                        .setEmail("prueba")
                        .setTelefono("prueba")
                        .setMetodoPago("Nada")
                        .setToken("191919191").Build();


        System.out.println(UsuarioNuevo);
    }
}
