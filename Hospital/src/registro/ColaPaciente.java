
package registro;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author AA
 */
public class ColaPaciente {
      Queue<Paciente> COLA;
    
    public ColaPaciente(){
        COLA = new LinkedList<>();
    }
    
    public boolean esVacia() {
        return COLA.isEmpty();
    }

    public boolean esLlena() {
        return false;
    }

    public void insertar(Paciente n) {
        COLA.add(n);
    }

    public Object quitar() {
        return COLA.poll();
    }

    public Object mostrar() {
        String salida = "";
        for(Paciente p : COLA){
            Paciente atemp = (Paciente)p;
            salida += atemp.toString() + "\n";
        }
        return salida;
    }
}

