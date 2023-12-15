package registro;

class NodoMedico {

    Medico medico;
    NodoMedico izquierdo, derecho;

    public NodoMedico(Medico medico) {
        this.medico = medico;
        this.izquierdo = this.derecho = null;
    }
}
