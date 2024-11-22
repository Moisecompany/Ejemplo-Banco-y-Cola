package Actividad_4.Banco;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        Banco banco = new Banco();
        boolean salir = false;
        do{
        System.out.println("Que accion se realizar: ");
        System.out.println("1.Registrar a la unifila 2.Formar para abir cuenta  3.Formar para servicios de ventanilla");
        System.out.println("4.Formar para atención de ejecutivo 5.Atender una persona de apertura de cuentas  6.Atender en ventanilla");
        System.out.println("7.Atender en ejecutivos  8.Salir");
        int accion = entrada.nextInt();
        
        switch(accion){
            case 1:
            System.out.println("Nombre a registrar:");
            String nombre = entrada.next();
            banco.registrar_unifila(nombre);
            break;
            case 2:
            if (banco.unifila.isEmpty()==false) {
                System.out.println("Formado a la cola para abrir cuenta");}
            banco.formar(banco.get_cuentas());
            break;
            case 3:
            if (banco.unifila.isEmpty()==false) {
                System.out.println("Formado a la cola para servicio de ventanilla");}
            banco.formar(banco.get_ventanilla());
            break;
            case 4:
            if (banco.unifila.isEmpty()==false) {
                System.out.println("Formado a la cola para atención de ejecutivo");}
            banco.formar(banco.get_ejecutivo());
            break;
            case 5:
            if (banco.unifila.isEmpty()==false || banco.cola_cuentas.isEmpty()==false) {
                banco.atender(banco.get_cuentas());
            System.out.println("Ve a ser atendido en apertura de cuenta");}
            break;
            case 6:
            if (banco.unifila.isEmpty()==false || banco.cola_ventanilla.isEmpty()==false) {
                banco.atender(banco.get_ventanilla());
            System.out.println("Ve a ser atendido en ventanilla");}
            break;
            case 7:
            if (banco.unifila.isEmpty()==false || banco.cola_ejecutivo.isEmpty()==false) {
                banco.atender(banco.get_ejecutivo());
            System.out.println("Ve a ser atendido en la ventana de ejecutivos");}
            break;
            case 8:
            salir=true;
            break;            
            default:
            System.out.println("Por favor seleccione una opcion valida.");
            break;
        }
      }while (salir==false);
    }
}