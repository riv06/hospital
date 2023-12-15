
package registro;


public class ArbolMedico {
    private NodoMedico raiz;

    public ArbolMedico() {
        raiz = null;
    }

    public void insertarMedico(Medico medico) {
        raiz = insertarMedicoRec(raiz, medico);
    }

    private NodoMedico insertarMedicoRec(NodoMedico nodo, Medico medico) {
        if (nodo == null) {
            return new NodoMedico(medico);
        }

       
        if (medico.getEspecialidad().compareTo(nodo.medico.getEspecialidad()) < 0) {
            nodo.izquierdo = insertarMedicoRec(nodo.izquierdo, medico);
        } else if (medico.getEspecialidad().compareTo(nodo.medico.getEspecialidad()) > 0) {
            nodo.derecho = insertarMedicoRec(nodo.derecho, medico);
        }

        return nodo;
    }

    public void asignarPaciente(Paciente paciente) {
        if (raiz != null) {
            asignarPacienteRec(raiz, paciente);
        } else {
            System.out.println("No hay médicos disponibles para asignar al paciente.");
        }
    }

    private String asignarPacienteRec(NodoMedico nodo, Paciente paciente) {
        String mensaje = "";
        if (nodo != null) {
            if (nodo.medico.getEspecialidad().equals("Pediatría") && paciente.getEdad() >= 0 && paciente.getEdad() <= 12) {
                mensaje = ("Asignando " + paciente.getNombre() + " a " + nodo.medico.getNombre() +
                                   " (Especialidad: " + nodo.medico.getEspecialidad() + ")");
            } else if (nodo.medico.getEspecialidad().equals("Medicina Infantil") && paciente.getEdad() >= 13 && paciente.getEdad() <= 18) {
                mensaje = ("Asignando " + paciente.getNombre() + " a " + nodo.medico.getNombre() +
                                   " (Especialidad: " + nodo.medico.getEspecialidad() + ")");
            } else if (nodo.medico.getEspecialidad().equals("Medicina para Adultos") && paciente.getEdad() >= 19 && paciente.getEdad() <= 59) {
                mensaje = ("Asignando " + paciente.getNombre() + " a " + nodo.medico.getNombre() +
                                   " (Especialidad: " + nodo.medico.getEspecialidad() + ")");
            } else if (nodo.medico.getEspecialidad().equals("Geriatría") && paciente.getEdad() >= 60) {
               mensaje = ("Asignando " + paciente.getNombre() + " a " + nodo.medico.getNombre() +
                                   " (Especialidad: " + nodo.medico.getEspecialidad() + ")");
            }

            asignarPacienteRec(nodo.izquierdo, paciente);
            asignarPacienteRec(nodo.derecho, paciente);
        }
        return mensaje;
    }
}
