public class Cliente {

    String Usuario;
    String Correo;
    int tel;
    String Contraseña;

    public Cliente (String nombre, String correo, int tel, String contraseña) {
        Usuario = nombre;
        Correo = correo;
        this.tel = tel;
        Contraseña = contraseña;
    }

    public String getNombre() {
        return Usuario;
    }

    public void setNombre(String nombre) {
        Usuario = nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }



}
