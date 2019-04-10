/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

/**
 *
 * @author vjalvare
 */
public class NodoColaPelicula {
    private Pelicula dato;
    private NodoColaPelicula atras;

    public NodoColaPelicula(Pelicula dato) {
        this.dato = dato;
    }

    public Pelicula getDato() {
        return dato;
    }

    public void setDato(Pelicula dato) {
        this.dato = dato;
    }

    public NodoColaPelicula getAtras() {
        return atras;
    }

    public void setAtras(NodoColaPelicula atras) {
        this.atras = atras;
    }
    
    @Override
    public String toString() {
        return dato.toString();
    }
}
