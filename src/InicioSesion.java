public class InicioSesion {

    private static RegistroUsuario registroUsuario= new RegistroUsuario();

    public static boolean auntetificar(String nombre, String contraseña){
        if (obtener(nombre)!=null) {
            Usuario usuarioconsulta=obtener(nombre);
            if (usuarioconsulta.getNombre().equals(nombre)&&usuarioconsulta.getContraseña().equals(contraseña)){
                return true;
            }
            else{
                return false;

            }

        }else{
            return false;
        }
    }



    public static boolean agregar(Usuario usuario){
        return registroUsuario.ingresar(usuario);
    }
    public static boolean modificar(Usuario usuario){
        return registroUsuario.modificar(usuario);

    }
    public static boolean eliminar(String usuario){
        return registroUsuario.eliminar(usuario);

    }
    public static Usuario obtener(String usuario){
        return registroUsuario.obtener(usuario);

    }



}
