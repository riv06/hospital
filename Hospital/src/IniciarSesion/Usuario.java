
package IniciarSesion;


public class Usuario {
     private String nombre;
    private String password;
    private String nombreCompleto;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Usuario(String n, String p, String nc) {
        setNombre(n);
        setPassword(p);
        setNombreCompleto(nc);
    }
}
