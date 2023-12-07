/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registro;

import java.util.ArrayList;

/**
 *
 * @author AA
 */
public class Paciente {
    public String Nombre;
    private int Edad;
    private String Padecimiento;
    private String Observaciones;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getPadecimiento() {
        return Padecimiento;
    }

    public void setPadecimiento(String Padecimiento) {
        this.Padecimiento = Padecimiento;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    public Paciente(String Nombre, int Edad, String Padecimiento, String Observaciones) {
        setNombre(Nombre);
        setEdad(Edad);
        setPadecimiento(Padecimiento);
        setObservaciones(Observaciones );
    }
   

    @Override
    public String toString() {
        return  "Nombre: " + getNombre()+ "\nEdad: "+ getEdad() + "\nPadecimiento: "+
            getPadecimiento() + "\nObservaciones: "+ getObservaciones()+"\n----------------------\n";
    }
    
}
