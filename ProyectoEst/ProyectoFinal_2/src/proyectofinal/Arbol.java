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
public class Arbol {
    int a=0;
    int b=0;
    private NodoArbol raiz;
    public void insertar(int d){
       if (raiz==null) {
           raiz = new NodoArbol(d);
       }else{
           insertaRec(raiz, d);
       }
    }
   
    private void insertaRec(NodoArbol n, int x){
       if (x<=n.getId()) {
           if (n.getHijoIzq()==null) {
               n.setHijoIzq(new NodoArbol(x));
           }else{
               insertaRec(n.getHijoIzq(),x);
           }
       }else{
           if (n.getHijoDer()==null) {
               n.setHijoDer(new NodoArbol(x));
           }else{
               insertaRec(n.getHijoDer(),x);
           }
       }
    }
    
    public int inOrden(){
        if (raiz!=null) {
           b+= inOrdenRec(raiz);
        }else{
            System.out.println("Arbol Vacio...");
        }
        return b;
    }
    
    private int inOrdenRec(NodoArbol n){
        if (n!=null){
            inOrdenRec(n.getHijoIzq());
            a+=n.getId();
            inOrdenRec(n.getHijoDer());
        }
        return a;
    }
    
    public void preOrden(){
        if (raiz!=null) {
            preOrdenRec(raiz);
        }else{
            System.out.println("Arbol Vacio...");
        }
    }
    
    private void preOrdenRec(NodoArbol n){
        if (n!=null){
            System.out.print(n.getId()+", ");
            preOrdenRec(n.getHijoIzq());
            preOrdenRec(n.getHijoDer());
        }
    }
    
    public void postOrden(){
        if (raiz!=null) {
            postOrdenRec(raiz);
        }else{
            System.out.println("Arbol Vacio...");
        }
    }
    
    private void postOrdenRec(NodoArbol n){
        if (n!=null){
            postOrdenRec(n.getHijoIzq());
            postOrdenRec(n.getHijoDer());
            System.out.print(n.getId()+", ");
        }
    }
}
