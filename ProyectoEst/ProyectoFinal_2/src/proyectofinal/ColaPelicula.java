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
public class ColaPelicula {
    private NodoColaPelicula frente;
    private NodoColaPelicula ultimo;
    
    public void encolar(NodoColaPelicula dato){
        if (frente==null) {
            frente= dato;
            ultimo= dato;
        }else{
            ultimo.setAtras(dato);
            ultimo=dato;
        }
    }
    
    public NodoColaPelicula atender(){
        NodoColaPelicula n= frente;
        if (frente!=null) {
            frente=frente.getAtras();
            n.setAtras(null);
        }
        return n;    
    }
    
    public int encuentraPrecio(int x){
        int precio=0;
        NodoColaPelicula aux = this.getFrente();
        
        while(aux.getAtras()!=null){
            if(aux.getDato().getId()==x){           
                precio = aux.getDato().getPrecio();
                
            }
            aux = aux.getAtras();
        }
        if(aux.getAtras()==null){
            if(aux.getDato().getId()==x){
                precio = aux.getDato().getPrecio();
            }
        }
        return precio;
        
    }
    
    public NodoColaPelicula extraeX(int x){
        NodoColaPelicula extrae=null;
        NodoColaPelicula aux = this.getFrente();
        
        while(aux.getAtras()!=null){
            if(aux.getDato().getId()==x){           
                extrae = aux;
                
            }
            aux = aux.getAtras();
        }
        if(aux.getAtras()==null){
            if(aux.getDato().getId()==x){
                extrae = aux;
            }
        }
        return extrae;
    }

    public NodoColaPelicula getFrente() {
        return frente;
    }

    public void setFrente(NodoColaPelicula frente) {
        this.frente = frente;
    }

    public NodoColaPelicula getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoColaPelicula ultimo) {
        this.ultimo = ultimo;
    }

    @Override
    public String toString() {
        String s="";
        NodoColaPelicula aux=frente;
        while(aux!=null){
            s+=aux+"\n";
            aux=aux.getAtras();
        }
        return s;
    }
}
