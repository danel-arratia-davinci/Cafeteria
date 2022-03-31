public class InicioSesion {

    private static RegistroCliente registroCliente= new RegistroCliente();

    public static boolean auntetificar(String correo, String contraseña){
        if (obtener(correo)!=null) {
            Cliente usuarioconsulta=obtener(correo);
            if (usuarioconsulta.getNombre().equals(correo)&&usuarioconsulta.getContraseña().equals(contraseña)){
                return true;
            }
            else{
                return false;

            }

        }else{
            return false;
        }
    }



    public static boolean agregar(Cliente cliente){
        return registroCliente.ingresar(cliente);
    }
    public static boolean modificar(Cliente cliente){
        return registroCliente.modificar(cliente);

    }
    public static boolean eliminar(String usuario){
        return registroCliente.eliminar(usuario);

    }
    public static Cliente obtener(String cliente){
        return registroCliente.obtener(cliente);

    }



}
