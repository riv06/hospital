package registro;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.print.DocFlavor;
import javax.swing.JOptionPane;

public class Guardar implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private static final String pacientes = "datos.dat";

    List<Paciente> guardar = new ArrayList<>();
    public List<Integer> darHabitacion = new ArrayList<>();

    public void inserta(String n, int e, String p, String o) {
        Paciente paciente = new Paciente(n, e, p, o);
        guardar.add(paciente);
    }

    public String motrar() {
        String salida = "";
        for (Paciente paciente : guardar) {
            salida += paciente;
        }
        return salida;
    }

    public int NumHabita(String n) {
        if (n.length() > 0) {

            int a = (int) (Math.random() * 10);
            if (a == 0) {
                return NumHabita(n);
            }
            if (!A(a)) {
                return NumHabita(n);
            } else {
                darHabitacion.add(a);
            }
            return 0;
        } else {
            return 0;
        }
    }

    public boolean A(int o) {
        if (o > 0) {
            for (int i = 0; i < darHabitacion.size(); i++) {
                if (darHabitacion.get(i) == 0) {
                }
            }
        }
        return true;
    }

    public String comprobar(String n) {
        if (n.length() > 0) {
            int a = 0;
            for (int tem : darHabitacion) {
                a += tem;
            }
            return n + " en habitacion " + a;
        } else {
            return "Ocurrio un error";
        }
    }

    public boolean bucarEnfermo(String nombre, int index) {
        index = 0;
        if (index >= guardar.size()) {
            return false;
        }
        Paciente paciente = guardar.get(index);
        if (paciente.Nombre.equals(nombre)) {
            JOptionPane.showMessageDialog(null, "Paciente " + nombre + " fue " + index + "º en ser registrado",
                    "Infirmacion", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else {
            return bucarEnfermo(nombre, index + 1);
        }
    }

    public void ordenarPorEdad() {
        guardar.sort(Comparator.comparingInt(Paciente::getEdad));
    }

    public void guardarEnArchivo(String nombreArchivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            oos.writeObject(guardar);
            System.out.println("Datos guardados en el archivo.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public void cargarDesdeArchivo(String nombreArchivo) {
         try {
            File archivo = new File(pacientes);

            if (!archivo.exists()) {
                // Si el archivo no existe, crearlo
                archivo.createNewFile();
                System.out.println("Se creó el archivo " + pacientes);
            }

            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
                guardar = (List<Paciente>) ois.readObject();
                System.out.println("Datos cargados desde el archivo.");
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public List<Paciente> obtenerListaPacientes() {
        return guardar;
    }
}
