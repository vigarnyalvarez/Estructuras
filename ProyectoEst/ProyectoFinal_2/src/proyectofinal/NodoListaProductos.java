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
public class NodoListaProductos {
    private Producto dato;
    private NodoListaProductos next;
    private NodoListaProductos back;
    public NodoListaProductos(Producto dato) {
        this.dato = dato;
    }

    public Producto getDato() {
        return dato;
    }

    public void setDato(Producto dato) {
        this.dato = dato;
    }

    public NodoListaProductos getNext() {
        return next;
    }

    public void setNext(NodoListaProductos next) {
        this.next = next;
    }
    
    public NodoListaProductos getBack() {
        return back;
    }

    public void setBack(NodoListaProductos back) {
        this.back = back;
    }
    

    @Override
    public String toString() {
        return dato.toString();
    }
}
