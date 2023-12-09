/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registro;

/**
 *
 * @author juan_
 */
public class Nodo {
    Medico medico;
    Nodo izquierdo, derecho;

    public Nodo(Medico medico) {
        this.medico = medico;
        this.izquierdo = this.derecho = null;
    }
}
