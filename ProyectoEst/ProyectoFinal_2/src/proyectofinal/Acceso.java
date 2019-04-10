package proyectofinal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pc
 */
public class Acceso {
    Cliente client;
    Pelicula pelixis;
    String asiento;

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }

    public Pelicula getPeli() {
        return pelixis;
    }

    public void setPeli(Pelicula peli) {
        this.pelixis = peli;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public Acceso(Cliente client, Pelicula peli) {
        this.client = client;
        this.pelixis = peli;
        //this.asiento = asiento;
    }

    @Override
    public String toString() {
        return  "Cliente: " + client + " Pelicula: " + pelixis + " Asiento: " + asiento;
    }
    
    
    
}
