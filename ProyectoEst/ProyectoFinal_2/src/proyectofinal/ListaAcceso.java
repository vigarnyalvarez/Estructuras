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
public class ListaAcceso {
    private NodoListaAcceso cabeza;
    public void insertar (Acceso m) {
     
        if (cabeza == null) { //primer paso 
          cabeza =  new NodoListaAcceso(m);
        }else if (m.getClient().getEdad() > cabeza.getDato().getClient().getEdad()) { //segundo paso
            NodoListaAcceso aux = new NodoListaAcceso(m);
            aux.setNext(cabeza);
            cabeza = aux;
        }else if (cabeza.getNext() == null && cabeza.getDato().getClient().getEdad()> m.getClient().getEdad()) { //tercer paso
            cabeza.setNext(new NodoListaAcceso(m));
        }else { 
            //cuarto paso
            NodoListaAcceso aux = cabeza;
            while (aux.getNext() != null &&  aux.getNext().getDato().getClient().getEdad() <= m.getClient().getEdad()) {
              aux = aux.getNext();
            }
            NodoListaAcceso temp = new NodoListaAcceso(m);
            temp.setNext(aux.getNext());
            aux.setNext(temp);
        }
    }
    
    @Override
    public String toString() {
        NodoListaAcceso aux = cabeza;
        String s = "Lista \n";
        while (aux != null){
        s+= aux + "\n";
        aux = aux.getNext();
        }
        return s;
    }
}
