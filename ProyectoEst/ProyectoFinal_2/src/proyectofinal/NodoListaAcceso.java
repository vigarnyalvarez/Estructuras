/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

/**
 *
 * @author Pc
 */
public class NodoListaAcceso {
    private Acceso dato;
    private NodoListaAcceso next;

    public NodoListaAcceso(Acceso dato) {
        this.dato = dato;
    }

    public Acceso getDato() {
        return dato;
    }

    public void setDato(Acceso dato) {
        this.dato = dato;
    }

    public NodoListaAcceso getNext() {
        return next;
    }

    public void setNext(NodoListaAcceso next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return dato.toString();
    }
}
