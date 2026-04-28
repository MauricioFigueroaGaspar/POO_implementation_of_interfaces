import java.util.ArrayList;
import java.util.Scanner;

public class AppMenu {

    private ArrayList<Electrodomestico> listaElectrodomesticos = new ArrayList<Electrodomestico>();
    private ArrayList<DispositivoComputo> listaDispositivoComputo = new ArrayList<DispositivoComputo>();
    private int accion=67;

    public void ejecutar(Scanner sc){
        do{
            System.out.println("Escoja una opcion");

            System.out.println(" (0) Salir");
            System.out.println(" (1) accion 1");
            System.out.println(" (2) accion 2");
            accion = sc.nextInt();
            System.out.println();


            switch (accion) {
                // salir
                case 0:
                    break;

                // ACCION 1
                case 1:
                    break;

                // ACCION 2
                case 2:
                    break;

                default:
                    System.out.println("Ingrese un numero de opcion valido.");
                    break;
            }
        }while(accion!=0);
    }
}