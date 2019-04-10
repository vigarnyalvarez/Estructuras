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
public class NodoPilaAdmin {
    private Admin dato;
    private NodoPilaAdmin abajo;

    public NodoPilaAdmin(Admin dato) {
        this.dato = dato;
    }

    public Admin getDato() {
        return dato;
    }

    public void setDato(Admin dato) {
        this.dato = dato;
    }

    public NodoPilaAdmin getAbajo() {
        return abajo;
    }

    public void setAbajo(NodoPilaAdmin abajo) {
        this.abajo = abajo;
    }
    
    
}
