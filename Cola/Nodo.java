package Actividad_4.Cola;

public class Nodo {
    //Variable donde ser guarda el valor
    private int valor;
    //Variable para enlazar nodos
    private Nodo siguiente;

    //constructo vacio
    public Nodo(){
        this.valor=0;
        this.siguiente= null;
    }
    public Nodo(int valor){
        this.valor=valor;
        this.siguiente= null;
    }
    
    public int getValor(){
        return valor;
    }

    public void setValor(int valor){
        this.valor = valor;
    }

    public Nodo getSiguiente(){
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente){
        this.siguiente = siguiente;
    }
}
