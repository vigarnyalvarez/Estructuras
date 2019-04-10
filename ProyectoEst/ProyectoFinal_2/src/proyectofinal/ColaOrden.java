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
public class ColaOrden {
    private NodoColaOrden frente;
    private NodoColaOrden ultimo;
   
    public void encolar(NodoColaOrden dato){
        if (frente==null) {
            frente= dato;
            ultimo= dato;
        }else{
            ultimo.setAtras(dato);
            ultimo=dato;
        }
    }
    
    public NodoColaOrden atender(){
        NodoColaOrden n= frente;
        if (frente!=null) {
            frente=frente.getAtras();
            n.setAtras(null);
        }
        return n;    
    }

    @Override
    public String toString() {
        String s="";
        NodoColaOrden aux=frente;
        while(aux!=null){
            s+=aux+"\n";
            aux=aux.getAtras();
        }
        return s;
    }
    
    
    public NodoColaOrden getFrente() {
        return frente;
    }

    public void setFrente(NodoColaOrden frente) {
        this.frente = frente;
    }

    public NodoColaOrden getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoColaOrden ultimo) {
        this.ultimo = ultimo;
    }
   
    public String encuentraX(int x){
        String n="";
        NodoColaOrden aux = this.getFrente();
        
        while(aux.getAtras()!=null){
            if(aux.getDato().getCliente().getId()==x){           
                
                n=aux.getDato().toString();
            }
            aux = aux.getAtras();
        }
        if(aux.getAtras()==null){
            if(aux.getDato().getCliente().getId()==x){
                n=aux.getDato().toString();
            }
        }
        return n;
        
    }
}
