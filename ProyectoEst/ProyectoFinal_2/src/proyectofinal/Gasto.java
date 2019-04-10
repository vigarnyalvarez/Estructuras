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
public class Gasto {
    int gasto;

    public Gasto(int gasto) {
        this.gasto = gasto;
    }

    public int getGasto() {
        return gasto;
    }

    public void setGasto(int gasto) {
        this.gasto = gasto;
    }

    @Override
    public String toString() {
        return ""  + gasto;
    }
    
    
    
    
}
