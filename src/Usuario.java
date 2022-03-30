public class Usuario {

    String Nombre;
    String Correo;
    int tel;
    String Contraseña;

    public Usuario(String nombre, String correo, int tel, String contraseña) {
        Nombre = nombre;
        Correo = correo;
        this.tel = tel;
        Contraseña = contraseña;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
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
