package Actividad_4.Cola;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        Cola ejemplo = new Cola();
        Cola ejemplo_2 = new Cola();
        ejemplo.meter_cola(10);
        ejemplo.meter_cola(23);
        ejemplo.meter_cola(34);
        ejemplo.meter_cola(45);

        ejemplo_2.meter_cola(70);
        ejemplo_2.meter_cola(96);
        ejemplo_2.meter_cola(88);
        ejemplo_2.meter_cola(64);
            System.out.println("Cola 1:");
            ejemplo.imprimir();
            System.out.println("Cola 2:");
            ejemplo_2.imprimir();
        Boolean salir = false;
        while (salir==false) {
            
            System.out.println("Que quieres hacer 1.Meter a cola  2.Sacar de cola 3.Mirar cima de la pila 4.Mirar final 5.Fusionar listas 6.Salir");
            int opcion=entrada.nextInt();
            switch (opcion) {
                case 1:
                System.out.println("Dato:");
                int dato = entrada.nextInt();
                System.out.println("A que cola quieres meter el dato: 1.Cola 1  2.Cola 2");
                int cola_selecionada=entrada.nextInt();
                switch (cola_selecionada) {
                    case 1:
                    ejemplo.meter_cola(dato);
                        break;

                    case 2:
                    ejemplo_2.meter_cola(dato);    
                        break;
                
                    default:
                        break;
                }
                    break;
                case 2:
                System.out.println("A que cola quieres eliminar el dato de la cima: 1.Cola 1  2.Cola 2");
                cola_selecionada=entrada.nextInt();
                switch (cola_selecionada) {
                    case 1:
                    System.out.println(ejemplo.sacar_cola());
                        break;

                    case 2:
                    System.out.println(ejemplo_2.sacar_cola());    
                        break;
                
                    default:
                        break;
                }
                break;
                case 3:
                System.out.println("A que cola quieres ver la cima: 1.Cola 1  2.Cola 2");
                cola_selecionada=entrada.nextInt();
                switch (cola_selecionada) {
                    case 1:
                    System.out.println(ejemplo.mirar_cima());
                        break;

                    case 2:
                    System.out.println(ejemplo_2.mirar_cima());   
                        break;
                
                    default:
                        break;
                }
                break;
                case 4:
                System.out.println("A que cola quieres ver el final: 1.Cola 1  2.Cola 2");
                cola_selecionada=entrada.nextInt();
                switch (cola_selecionada) {
                    case 1:
                    System.out.println(ejemplo.mirar_final());
                        break;

                    case 2:
                    System.out.println(ejemplo_2.mirar_final());   
                        break;
                
                    default:
                        break;
                }
                break;
                case 5:
                System.out.println("Que posicion quieres: 1 o 2");
                cola_selecionada=entrada.nextInt();
                ejemplo.añadir(ejemplo_2, cola_selecionada);
                break;
                case 6:
                salir=true;
                break;
                default:
                    break;
            }
        }
    }
}
