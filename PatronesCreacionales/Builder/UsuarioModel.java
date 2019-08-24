package PatronesCreacionales.Builder;


public class UsuarioModel {
    //Como vemos nuestro modelo contiene varios atributos por lo tanto aplicaremmos el
    //patron builder que nos ayudara a crear un objeto complejo de una forma elegante

    private String nombres, apellidos; // Estos son los mas basicos que debemos tener
    private String email, direccion, edad, telefono, ocupacion; //Estos los llamaremos opcionales
    private boolean medioContacto; //opcional

    // Agregarle
    private String metodoPago; // Si y solo si email, telefono y direccion tienen valores
    private String token;

    //Nuestro constructor tiene que ser privado
    private UsuarioModel(String Nombres, String Apellidos) {
        this.nombres = Nombres;
        this.apellidos = Apellidos;
        this.medioContacto = false;
    }


    //Creamos el metodo que nos crea un nuevo objeto basico
    public static UsuarioModel Make(String Nombres, String Apellidos) {
        return new UsuarioModel(Nombres, Apellidos);
    }


    // Creamos los getters y setters de los opcionales
    // En los setters necesitamos que aparte de asignar el valor nos retorne el mismo objeto
    // Para asi poder seguir asignando mas valores si lo deseamos

    public Builder setMedioContacto(boolean MedioContacto) {

        if (!MedioContacto) {
            throw new IllegalArgumentException("No es posible asignar falso a medio de contacto");
        }

        this.medioContacto = MedioContacto;
        return new Builder(this);
    }


    public UsuarioModel setEdad(String edad) {
        this.edad = edad;
        return this;
    }


    public UsuarioModel setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
        return this;
    }

    // Por ultimo necesitamos tener un metodo que finalice la construccion
    public UsuarioModel Build() {
        return this;
    }

    @Override
    public String toString() {
        return "" + this.nombres + " " + this.apellidos + " " + this.edad + " " + this.direccion;

    }



    public static class Builder {

        private UsuarioModel usuario;

        public Builder(UsuarioModel usuario) {
            this.usuario = usuario;
        }

        public tokenUsuario setMetodoPago(String metodo) {
            if (usuario.telefono == null || usuario.email == null || usuario.direccion == null) {
                throw new IllegalArgumentException("Necesitas llenar direccion, telefono y email para asignar metodo " +
                        "paago");
            }
            usuario.metodoPago = metodo;
            return new tokenUsuario(this);
        }


        public Builder setTelefono(String telefono) {
            usuario.telefono = telefono;
            return this;
        }


        public Builder setEmail(String email) {
            usuario.email = email;
            return this;
        }

        public Builder setDireccion(String direccion) {
            usuario.direccion = direccion;
            return this;
        }

        public UsuarioModel Build() {
            return usuario;
        }
    }

    public static class tokenUsuario {
        private Builder metodo;

        public tokenUsuario(Builder metodos) {
            this.metodo = metodos;
        }

        public tokenUsuario setToken(String token) {
            this.metodo.usuario.token = token;
            return this;
        }

        public UsuarioModel Build() {
            return this.metodo.usuario;
        }
    }


}
