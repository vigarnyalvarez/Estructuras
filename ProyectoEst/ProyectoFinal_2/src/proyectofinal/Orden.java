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
public class Orden {
    Cliente cliente;
    Pelicula pelix;
    String prod;
    String asiento;
    NodoPilaGasto gasto;
    //int cantidadTixs;

    public NodoPilaGasto getGasto() {
        return gasto;
    }

    public void setGasto(NodoPilaGasto gasto) {
        this.gasto = gasto;
    }
     
    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pelicula getPeli() {
        return pelix;
    }

    public void setPeli(Pelicula peli) {
        this.pelix = peli;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public Orden(Cliente cliente, Pelicula peli, String prod, NodoPilaGasto gasto) {
        this.cliente = cliente;
        this.pelix = peli;
        this.prod = prod;
        //this.asiento = asiento;
        this.gasto = gasto;
    }

    @Override
    public String toString() {
        return cliente.toString() +"\n"+ "Productos"+prod+"\n"+"Pelicula:"+pelix.toString()+"\n"+"Total: "+gasto;
    }
    
    
   }
