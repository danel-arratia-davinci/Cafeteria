import java.util.ArrayList;

 public class RegistroUsuario{

    public ArrayList<Usuario> usuarios;

    public RegistroUsuario() {
        usuarios=new ArrayList<>();
    }

    public int buscar(String usuario){
        int n=-1;
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getNombre().equals(usuario)){
                n=i;
                break;
            }
        }
        return n;
    }

    public boolean ingresar(Usuario usuario){
        if (buscar(usuario.getNombre())==-1) {
            usuarios.add(usuario);
            return true;
        }else {
            return false;
        }
    }

    public boolean modificar(Usuario usuario){
        if (buscar(usuario.getNombre())!= -1) {
            Usuario usuarioaux=obtener(usuario.getNombre());

            usuarioaux.setContraseña(usuario.getContraseña());
            usuarioaux.setCorreo(usuario.getCorreo());
            usuarioaux.setTel(usuario.getTel());
            usuarioaux.setNombre(usuario.getNombre());

            return true;
        }else {
            return false;
        }
    }

    public boolean eliminar(String usuario){
        if (buscar(usuario)!= -1) {
            usuarios.remove(buscar(usuario));

            return true;
        }else {
            return false;
        }
    }
    public Usuario obtener(String usuario){
        if (buscar(usuario)!=-1) {
        return usuarios.get(buscar(usuario));
        }else{
            return null;
        }

    }

}
