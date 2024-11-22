package Actividad_4.Cola;

public class Cola {
    Nodo frente,fin;
    int tamaño;

    public Cola(){
        this.frente= null;
        this.fin= null;
        this.tamaño=0;
    }
    //Para saber si esta vacia la cola
    public boolean vacio(){
        return frente==null;
    }
    //Meter un dato a la fila
    public void meter_cola(int valor){
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (vacio()) {
            frente=nuevo;
            fin=nuevo;
        }else{
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
        tamaño++;
    }

    //Para eliminar un elemento de la cola
    public int sacar_cola(){
        if (vacio()) {
            System.out.println("La cola esta vacia");
            return -1;
        }
        int valor = frente.getValor();
        frente = frente.getSiguiente();
        tamaño--;
        return valor;
    }

    //Imprimir la cola
    public void imprimir(){
        Nodo nuevo = frente;
        int i = 1;
        while(nuevo!=null){
            System.out.println("Nodo " + i + ": " + nuevo.getValor());
            nuevo = nuevo.getSiguiente();
            i++;
        }
    }

    //Retorna una cola con los elementos de la segunda cola y despues elementos originales o retorna una cola con los elementos originales al inicio y los de la segunda cola después.
    public void añadir(Cola segunda_cola, int posicion){
        if(vacio() || segunda_cola.vacio()){
            System.out.println("Una o ambas colas estan vacia");
            return;
        }
        Cola cola_temporal = new Cola();
        Nodo nuevo = segunda_cola.frente;
        Nodo nuevo2 = frente;
        switch(posicion){
            case 1:
            while(nuevo != null){
                cola_temporal.meter_cola(nuevo.getValor());
                nuevo = nuevo.getSiguiente();
            }
            while(nuevo2 != null){
                cola_temporal.meter_cola(nuevo2.getValor());
                nuevo2 = nuevo2.getSiguiente();
            }
            cola_temporal.imprimir();
            break;

            case 2:
            while(nuevo2 != null){
                cola_temporal.meter_cola(nuevo2.getValor());
                nuevo2 = nuevo2.getSiguiente();
            }
            while(nuevo != null){
                cola_temporal.meter_cola(nuevo.getValor());
                nuevo = nuevo.getSiguiente();
            }
            cola_temporal.imprimir();
            break;

            default:
            System.out.println("No ingreso un numero valido para adjuntar colas");
        }
    }

    //Es la funcion de peek para mirar la cima
    public int mirar_cima(){
        if(vacio()){
            System.out.println("La cola esta vacia");
            return -1;
        }
        return frente.getValor();
    }

    //Funcion para ver el final de la cola
    public int mirar_final(){
        if(vacio()){
            System.out.println("La cola esta vacia");
            return -1;
        }
        return fin.getValor();
    }

}