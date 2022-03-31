import java.util.ArrayList;

public class RegistroCliente{

    private  ArrayList<Cliente> clientes;

    public RegistroCliente() {
        clientes=new ArrayList<>();
    }

    public int buscar(String usuario){
        int n=-1;
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getNombre().equals(usuario)){
                n=i;
                break;
            }
        }
        return n;
    }

    public boolean ingresar(Cliente cliente){
        if (buscar(cliente.getNombre())==-1) {
            clientes.add(cliente);
            return true;
        }else {
            return false;
        }
    }

    public boolean modificar(Cliente cliente){
        if (buscar(cliente.getNombre())!= -1) {
            Cliente clienteaux=obtener(cliente.getNombre());

            clienteaux.setContraseña(cliente.getContraseña());
            clienteaux.setCorreo(cliente.getCorreo());
            clienteaux.setTel(cliente.getTel());
            clienteaux.setNombre(cliente.getNombre());

            return true;
        }else {
            return false;
        }
    }

    public boolean eliminar(String usuario){
        if (buscar(usuario)!= -1) {
            clientes.remove(buscar(usuario));

            return true;
        }else {
            return false;
        }
    }
    public Cliente obtener(String usuario){
        if (buscar(usuario)!=-1) {
            return clientes.get(buscar(usuario));
        }else{
            return null;
        }

    }

}
