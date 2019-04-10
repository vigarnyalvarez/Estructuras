/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import javax.swing.JOptionPane;

/**
 *
 * @author vjalvare
 */
public class CommandCenter {
 private int a= 0;
 private ColaPelicula peliCol = new ColaPelicula();
 private ColaPelicula peliPrecio = new ColaPelicula();
 private PilaGasto ganancia = new PilaGasto();
 private ListaProductos produs = new ListaProductos();
 private ListaAcceso acceso1 = new ListaAcceso();
 private ListaAcceso acceso2 = new ListaAcceso();
 private ColaOrden ordenes = new ColaOrden();
 private volatile static CommandCenter uniqueInstance;
 private  Arbol arbolGanancias = new Arbol();
 private PilaAdmin admins = new PilaAdmin();
 
 

 
 /*Informacion de Cliente*/
 private String nombre;
 private int id;
 private int edad;
 private int idPeli;
 private int cantTix;
 private int costoPeli;
 private int idProd;
 private int cantProd;
 private int costoProd;
 private int gastoCliente;
 private String peli;
 private Pelicula pelix;
 private String produx;
 private String butaca = "Asiento(s): ";
 

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

    public int getIdPeli() {
        return idPeli;
    }

    public void setIdPeli(int idPeli) {
        this.idPeli = idPeli;
    }

    public int getCantTix() {
        return cantTix;
    }

    public void setCantTix(int cantTix) {
        this.cantTix = cantTix;
    }

    public int getCostoPeli() {
        return costoPeli;
    }

    public void setCostoPeli(int costoPeli) {
        this.costoPeli = costoPeli;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public int getCantProd() {
        return cantProd;
    }

    public void setCantProd(int cantProd) {
        this.cantProd = cantProd;
    }

    public int getCostoProd() {
        return costoProd;
    }

    public void setCostoProd(int costoProd) {
        this.costoProd = costoProd;
    }

    public String getButaca() {
        return butaca;
    }

    public void setButaca(String butaca) {
        this.butaca = butaca;
    }

    public int getGastoCliente() {
        return gastoCliente;
    }

    public void setGastoCliente(int gastoCliente) {
        this.gastoCliente = gastoCliente;
    }

    public String getPeli() {
        return peli;
    }

    public void setPeli(String peli) {
        this.peli = peli;
    }

    public String getProdux() {
        return produx;
    }

    public void setProdux(String produx) {
        this.produx = produx;
    }
    
    
 
 /************************/
 
    
 
    
    
    
    
    static String [][] seats ={
            {"A1","A2","A3","A4","A5","A6","A7"},
            {"B1","B2","B3","B4","B5","B6","B7"},
            {"C1","C2","C3","C4","C5","C6","C7"},
            {"D1","D2","D3","D4","D5","D6","D7"},
            {"E1","E2","E3","E4","E5","E6","E7"},        };
    
    static String [][] seats2={
            {"A1","A2","A3","A4","A5","A6","A7"},
            {"B1","B2","B3","B4","B5","B6","B7"},
            {"C1","C2","C3","C4","C5","C6","C7"},
            {"D1","D2","D3","D4","D5","D6","D7"},
            {"E1","E2","E3","E4","E5","E6","E7"},        }; 
    public void rellenarPeli(){
       /*     
       l.insertar(new Producto(1,"Hamburguesa",3.89));
       l.insertar(new Producto(2,"Gaseosa",3.89));
       l.insertar(new Producto(3,"Palomitas",3.89));*/
       peliCol.encolar(new NodoColaPelicula(new Pelicula(1, "Star Wars", 2500, 1)));
       peliCol.encolar(new NodoColaPelicula(new Pelicula(2, "Harry Potter", 3000, 2)));
       peliPrecio.encolar(new NodoColaPelicula(new Pelicula(1, "Star Wars", 2500, 1)));
       peliPrecio.encolar(new NodoColaPelicula(new Pelicula(2, "Harry Potter", 3000, 2)));
       
        //System.out.println(peliCol.toString());
    }
    
    public void rellenarProdus(){
        produs.insertar(new Producto(1,"Hamburguesa",3900));
       produs.insertar(new Producto(2,"Gaseosa",1500));
       produs.insertar(new Producto(3,"Palomitas",3500));
    }
    
    public void rellenarAdmins(){
        admins.push(new NodoPilaAdmin(new Admin("Juan", 123)));
        admins.push(new NodoPilaAdmin(new Admin("Pedro", 345)));
        admins.push(new NodoPilaAdmin(new Admin("Manuel", 567)));
        
    }
    
    public boolean buscaAdmin(int a){
        boolean b=false;
        NodoPilaAdmin aux= admins.top;
        while(aux!=null && aux.getDato().getId()!=a){
            
            aux=aux.getAbajo();
            
            
        }
        if (aux.getDato().getId()==a) {
            b=true;
        }
        return b;
    }
    CommandCenter(){};
    
    public static CommandCenter getUniqueInstance(){
        if (uniqueInstance==null) {
            synchronized(CommandCenter.class){
                if (uniqueInstance==null) {
                   uniqueInstance = new CommandCenter(); 
                }
            }
        }
        return uniqueInstance;
    }
    
   /* public String despliegaOrden(){
        String fac="";
        fac=ordenes.encuentraX(id);
        System.out.println(fac);
        return fac;
    }*/
    
    public void ecolaOrden(){
        System.out.println("Encolando.... "+id+edad+nombre+pelix.toString()+produx+ganancia.top);
        encolarOrden(new Cliente(id,edad,nombre),pelix, produx,ganancia.top);
    }
    
    public void enlistaAcceso(){
        NodoColaOrden aux= ordenes.getFrente();
        while(aux!=null){
            if (aux.getDato().pelix.getId()==1) {
                acceso1.insertar(new Acceso(aux.getDato().cliente, aux.getDato().pelix));
                System.out.println("Acceso 1 "+aux.getDato().cliente +aux.getDato().pelix);
                aux=aux.getAtras();
            }else{
                acceso2.insertar(new Acceso(aux.getDato().cliente, aux.getDato().pelix));
                System.out.println("Acceso 2 "+aux.getDato().cliente +aux.getDato().pelix);
                aux=aux.getAtras();
            }
        }
    }
    
    public void rellenaArbol(){
        NodoPilaGasto aux= ganancia.top;
        
        while(aux!=null){
            arbolGanancias.insertar(aux.getDato().getGasto());
            System.out.println("Insertando en arbol..."+aux.getDato().gasto);
            aux=aux.getAbajo();
            System.out.println(aux);
            
        }
    }
    
    public int despliegaArbol(){
        a+=arbolGanancias.inOrden();
        return a;
    }
    
    public void acumulaDinero(){
        acumularGanancias(gastoCliente);
    }
    
    public  void acumularGanancias(int x){
        //System.out.println(x);
        ganancia.push(new NodoPilaGasto(new Gasto(x)));
        System.out.println("Top pila Ganancia: "+ganancia.top);
        System.out.println("Ganancias: "+ganancia.toString());
    }
    
    public  void encolarOrden(Cliente cx, Pelicula pel, String prd, NodoPilaGasto exp){
        //System.out.println(cx.toString());
        ordenes.encolar(new NodoColaOrden(new Orden(cx,pel,prd,exp)));
    }
    
    public  void agregarAcceso1(NodoListaAcceso m){
        acceso1.insertar(m.getDato());
    }
    
    public  void agregarAcceso2(NodoListaAcceso l){
        acceso2.insertar(l.getDato());
    }
    
//    public  NodoColaPelicula muestra(){
//        NodoColaPelicula n= peliCol.atender();
//        
//        return n;
//    }
    
   
    
    public String eliminaAsiento1(String asiento){
        String a1="";
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j].equalsIgnoreCase(asiento)) {
                    a1=seats[i][j];
                    seats[i][j] = "X";
                }
            }
        }
        return a1;
    }
    
    public void agregaAsiento(int seleccion, String seat){
        String a="";
     switch (seleccion) {
         case 1:
             butaca+=eliminaAsiento1(seat)+", ";
             peli+=" "+butaca;
             break;
         case 2:
             butaca+=eliminaAsiento2(seat)+", ";
             peli+=" "+butaca;
             break;
         default:
             JOptionPane.showMessageDialog(null, "Ingrese una opcion valida.");
             break;
     }
    }
    
    public String eliminaAsiento2(String asiento){
        System.out.println(asiento);
        String a2 = "";
        for (int i = 0; i < seats2.length; i++) {
            for (int j = 0; j < seats2[i].length; j++) {
                if (seats2[i][j].equalsIgnoreCase(asiento)) {
                    a2 = seats2[i][j];
                    seats2[i][j] = "X";
                }
            }
        }
        return a2;
    }
    
    public void copiarPelicula(int x){
        
    }

    public String[][] getSeats() {
        return seats;
    }

    public  void setSeats(String[][] seats) {
        CommandCenter.seats = seats;
    }

    public String[][] getSeats2() {
        return seats2;
    }

    public void setSeats2(String[][] seats2) {
        CommandCenter.seats2 = seats2;
    }

    public ColaPelicula getPeliCol() {
        return peliCol;
    }

    public void setPeliCol(ColaPelicula peliCol) {
        this.peliCol = peliCol;
    }

    public ColaPelicula getPeliPrecio() {
        return peliPrecio;
    }

    public void setPeliPrecio(ColaPelicula peliPrecio) {
        this.peliPrecio = peliPrecio;
    }

    public PilaGasto getGanancia() {
        return ganancia;
    }

    public void setGanancia(PilaGasto ganancia) {
        this.ganancia = ganancia;
    }

    public ListaProductos getProdus() {
        return produs;
    }

    public void setProdus(ListaProductos produs) {
        this.produs = produs;
    }

    public ListaAcceso getAcceso1() {
        return acceso1;
    }

    public void setAcceso1(ListaAcceso acceso1) {
        this.acceso1 = acceso1;
    }

    public ListaAcceso getAcceso2() {
        return acceso2;
    }

    public void setAcceso2(ListaAcceso acceso2) {
        this.acceso2 = acceso2;
    }

    public ColaOrden getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(ColaOrden ordenes) {
        this.ordenes = ordenes;
    }

    public Pelicula getPelix() {
        return pelix;
    }

    public void setPelix(Pelicula pelix) {
        this.pelix = pelix;
    }

    

   
}
