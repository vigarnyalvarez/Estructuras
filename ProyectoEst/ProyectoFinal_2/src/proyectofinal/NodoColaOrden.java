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
public class NodoColaOrden {
    private Orden dato;
    private NodoColaOrden atras;

    public NodoColaOrden(Orden dato) {
        this.dato = dato;
    }

    public Orden getDato() {
        return dato;
    }

    public void setDato(Orden dato) {
        this.dato = dato;
    }

    public NodoColaOrden getAtras() {
        return atras;
    }

    public void setAtras(NodoColaOrden atras) {
        this.atras = atras;
    }

    @Override
    public String toString() {
        return dato.toString();
    }
}
