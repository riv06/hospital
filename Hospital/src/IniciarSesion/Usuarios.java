package IniciarSesion;

import java.util.ArrayList;
import java.util.List;

public class Usuarios {

    public static List<Usuario> usuarios;

    public static Usuario usuarioActual;

    public static void crearUsuarios() {
        usuarios = new ArrayList<>();
        usuarios.add(new Usuario("admin", "admin", "Administrador"));
    }

}
