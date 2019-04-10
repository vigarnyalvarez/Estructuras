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
public class PilaAdmin {
    NodoPilaAdmin top;
    public void push(NodoPilaAdmin n){
        if (top==null) {
            top=n;
        }else{
            n.setAbajo(top);
            top=n;
            //n.setAbajo(null);
        }
    }
    
    public NodoPilaAdmin pop(){
        NodoPilaAdmin aux=null;
        if (top!=null) {
            aux=top;
            top=aux.getAbajo();
        }
        return aux;
    }
}
