/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registro;

import java.util.ArrayList;
import java.util.List;
import javax.print.DocFlavor;

/**
 *
 * @author AA
 */
public class Guardar {

    List<Paciente> guardar;

    public Guardar() {
        guardar = new ArrayList<>();
    }

    public void inserta(String n, int e, String p ,String o) {
        Paciente paciente = new Paciente(o, e, o, o);
        
        guardar.add(paciente);
            
    }

    public String motrar() {
        String salida = "";
        for (Paciente paciente : guardar) {
            salida += paciente;
        }
        return salida;
    }
}


