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
public class Pelicula {
    private int id;
    private String nmbre;
    private int precio;
    private int sala;
    public Pelicula(int id, String nmbre, int precio, int  sala) {
        this.id = id;
        this.nmbre = nmbre;
        this.precio = precio;
        this.sala = sala;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNmbre() {
        return nmbre;
    }

    public void setNmbre(String nmbre) {
        this.nmbre = nmbre;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }
     
    
    
    @Override
    public String toString() {
        return "ID: " + id + " Pelicula: " + nmbre + " Precio: " + precio + " Sala: "+sala;
    }
    
    
    

}