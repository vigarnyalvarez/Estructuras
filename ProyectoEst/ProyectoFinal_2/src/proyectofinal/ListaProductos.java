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
public class ListaProductos {
        private NodoListaProductos cabeza;
    private NodoListaProductos ultimo;
    public void insertar (Producto m) {
        if (cabeza==null) {
            NodoListaProductos aux=new NodoListaProductos(m);
            cabeza=aux;
            ultimo=aux;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
        }else if (m.getId()<cabeza.getDato().getId()) {
            NodoListaProductos aux= new NodoListaProductos(m);
            aux.setNext(cabeza);
            cabeza.setBack(aux);
            cabeza=aux;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
        }else if (ultimo.getDato().getId()<=m.getId()) {
            NodoListaProductos aux= new NodoListaProductos(m);
            ultimo.setNext(aux);
            aux.setBack(ultimo);
            ultimo=aux;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
        }else{
            NodoListaProductos aux = cabeza;
            while (aux.getNext().getDato().getId() < m.getId()) {
              aux = aux.getNext();
            }
            NodoListaProductos temp = new NodoListaProductos(m);
            temp.setNext(aux.getNext());
            temp.setBack(aux);
            aux.setNext(temp);
            temp.getNext().setBack(temp);
        }
        ultimo.setNext(cabeza);
    }
    
    
    @Override
    public String toString() {
        NodoListaProductos aux = cabeza;
        String s = "";
        do{
            s+=(aux!=null)?aux+",\n":"";
            aux=(aux!=null)?aux.getNext():aux;
        }while(aux!=cabeza);
        return s;
    }
    
    public int encontrar(int x){
        int precio=0;
        if (cabeza!=null) {
            if (x>=cabeza.getDato().getId() && x<= ultimo.getDato().getId()) {
                NodoListaProductos aux= cabeza;
                    while(aux.getNext().getDato().getId()<x){
                        aux = aux.getNext();
                    }
                    if(aux.getNext().getDato().getId()==x){
                        System.out.println("Dato extraido para costo Producto: "+aux.getNext().getDato().getPrecio());
                        precio=aux.getNext().getDato().getPrecio();
                    }
            }
        }
        return precio;
    }
    
    public void modifica(Producto m){
      if (cabeza!=null) {
            if (m.getId()>=cabeza.getDato().getId() && m.getId()<= ultimo.getDato().getId()) {
                NodoListaProductos aux= cabeza;
                while(aux.getNext().getDato().getId()<m.getId()){
                    aux = aux.getNext();
                }
                if(aux.getNext().getDato().getId()==m.getId()){
                    aux.getNext().setDato(m);
                }
            }
        }
    }
    
    public void elimina(int x){
        if (cabeza!=null) {
            if (x>=cabeza.getDato().getId() && x<= ultimo.getDato().getId()) {
                if (cabeza.getDato().getId()==x) {
                    cabeza= cabeza.getNext();
                    cabeza.setBack(ultimo);
                    ultimo.setNext(cabeza);
                }else{
                    NodoListaProductos aux= cabeza;
                    while(aux.getNext().getDato().getId()<x && aux.getNext()!=ultimo){
                        aux=aux.getNext();
                    }
                    if (aux.getNext().getDato().getId()==x) {
                        if(aux.getNext()==ultimo){
                            ultimo=aux;
                        }
                        aux.setNext(aux.getNext().getNext());
                        aux.getNext().setBack(aux);
                    }
                }
            }
        }
    }
    
    public String extrae(int x){
        String p=null;
        if (cabeza!=null) {
            if (x>=cabeza.getDato().getId() && x<= ultimo.getDato().getId()) {
                if (cabeza.getDato().getId()==x) {
                    p=cabeza.getDato().toString();
                    cabeza= cabeza.getNext();
                    cabeza.setBack(ultimo);
                    ultimo.setNext(cabeza);
                    System.out.println("Aux next:"+ultimo.getNext().getDato().getId()+"\n");
                    System.out.println("Aux back:"+cabeza.getBack().getDato().getId()+"\n");
                }else{
                    NodoListaProductos aux= cabeza;
                    while(aux.getNext().getDato().getId()<x && aux.getNext()!=ultimo){
                        aux=aux.getNext();
                    }
                    if (aux.getNext().getDato().getId()==x) {
                        p=aux.getNext().getDato().toString();
                        if(aux.getNext()==ultimo){
                            ultimo=aux;
                        }
                        aux.setNext(aux.getNext().getNext());
                        System.out.println("Aux next:"+aux.getNext().getDato().getId()+"\n");
                        aux.getNext().setBack(aux);
                        System.out.println("Aux back:"+aux.getBack().getDato().getId()+"\n");
                    }
                }
            }
        }
        return p;    
    }
    
    
}
