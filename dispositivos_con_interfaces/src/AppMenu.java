import java.util.Scanner;

public class AppMenu {

    private Electrodomestico electrodomesticos[] = new Electrodomestico[5];
    private DispositivoComputo dispositivos[] = new DispositivoComputo[5];
    private int accion=67;

    public void crearObjetos(Scanner sc){
        for (int i =0; i<5;i++){
            System.out.println("\nElectrodomestico "+(i+1)+":\n");
            if (i/2==0){
                this.electrodomesticos[i]=new Lavadora(sc);
            }
            else if(i/2==1){
                this.electrodomesticos[i]=new HornoInteligente(sc);
            }
            else if(i/2==2){
                this.electrodomesticos[i]=new Refrigerador(sc);
            }
        }
        for (int i =0; i<5;i++){
            System.out.println("\nDispositivo "+(i+1)+":\n");
            if(i/2==0){
                this.dispositivos[i]=new Tablet(sc);
            }
            else if(i/2==1){
                this.dispositivos[i]=new Laptop(sc);
            }
            else if(i/2==2){
                this.dispositivos[i]=new Servidor(sc);
            }
        }
    }



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