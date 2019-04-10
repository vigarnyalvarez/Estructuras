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
public class Cliente{
private int id;
private int edad;
private String nombre;
//    private String nombrePelicula;
//    private int peliculaID;
//    private ListaProductos prod;
    

    
    
//    public void asignarPelicula(String Name, int ID){
//        this.nombrePelicula = nombrePelicula;
//        this.peliculaID = peliculaID;
//    }
//    
//    public void asignarProdu(ListaProductos prod){
//        this.prod = prod;
//    }

    public Cliente(int id, int edad, String nombre) {
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "ID Cliente: " + id + " Edad: " + edad + " nombre: " + nombre;
    }
    


   
    
    
    
    
    
}
