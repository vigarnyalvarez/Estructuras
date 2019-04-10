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
public class PilaGasto {
      NodoPilaGasto top;
    public void push(NodoPilaGasto n){
        if (top==null) {
            top=n;
        }else{
            n.setAbajo(top);
            top=n;
            //n.setAbajo(null);
        }
    }
    
    public NodoPilaGasto pop(){
        NodoPilaGasto aux=null;
        if (top!=null) {
            aux=top;
            top=aux.getAbajo();
        }
        return aux;
    }

    @Override
    public String toString() {
        String s="";
        NodoPilaGasto aux=top;
        while(aux!=null){
            s+=aux+"\n";
            aux=aux.getAbajo();
            
        }
        return s;
    }
}
