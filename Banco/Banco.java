package Actividad_4.Banco;
import java.util.LinkedList;
import java.util.Queue;
public class Banco {
    Queue<String> unifila = new LinkedList<>();
    Queue<String> cola_cuentas = new LinkedList<>();
    Queue<String> cola_ventanilla = new LinkedList<>();
    Queue<String> cola_ejecutivo = new LinkedList<>();
    //Regresa la unifila del banco
    public Queue<String> get_unifila() {
        return unifila;
    }
    //Regresa la cola de las cuentas del banco
    public Queue<String> get_cuentas() {
        return cola_cuentas;
    }
    //Regresa la cola para ventanilla del banco
    public Queue<String> get_ventanilla() {
        return cola_ventanilla;
    }
    //Regresa la cola para ejecutivos del banco
    public Queue<String> get_ejecutivo() {
        return cola_ejecutivo;
    }
    //Regista una persona y se registra en la unifila
    public void registrar_unifila(String nombre){
        System.out.println(nombre + " registrado correctamente a la unifila");
        unifila.add(nombre);
    }
    //Este metodo solicita la cola donde se va a formar y se saca el ultimo de la unifila y se mete a la cola solicitada
    public void formar(Queue<String> fila_formar){
        if(unifila.isEmpty()){
            System.out.println("La unifila esta vacia");
            return;
        }else{
        fila_formar.add(unifila.poll());}
    }
    //Este metodo solicita la cola de donde se saca a la persona y se imprime su nombre
    public void atender(Queue<String> fila_atender){
        if(fila_atender.isEmpty()){
            System.out.println("La fila esta vacia");
            return;
        }else{
        System.out.println(fila_atender.peek() + " seras atendido ahora" );
        fila_atender.poll();}
    }

}
