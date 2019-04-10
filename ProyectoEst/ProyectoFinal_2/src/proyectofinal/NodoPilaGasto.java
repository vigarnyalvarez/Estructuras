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
public class NodoPilaGasto {
    private Gasto dato;
    private NodoPilaGasto abajo;


    public NodoPilaGasto() {
    }
    
    

    public NodoPilaGasto(Gasto dato) {
        this.dato = dato;
    }

    

    public NodoPilaGasto getAbajo() {
        return abajo;
    }

    public void setAbajo(NodoPilaGasto abajo) {
        this.abajo = abajo;
    }

    public Gasto getDato() {
        return dato;
    }

    public void setDato(Gasto dato) {
        this.dato = dato;
    }
    
    @Override
    public String toString() {
        return dato.toString();
    }
}
