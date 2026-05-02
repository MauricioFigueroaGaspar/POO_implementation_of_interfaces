import java.util.Scanner;

public abstract class DispositivoComputo {
    private String procesador="";
    private long velocidadProcesador=0;


    public DispositivoComputo(Scanner sc){
        pedirProcesador(sc);
    }

    public void pedirProcesador(Scanner sc){
        System.out.println("Ingrese el modelo del procesador");
        this.procesador=sc.nextLine();
        System.out.println("Ingrese la velocidad del procesador");
        this.velocidadProcesador=sc.nextLong();
        sc.nextLine();
    }   

    public void imprimirProcesador(){
        System.out.println("Procesador: "+this.procesador);
        System.out.println("Velocidad: "+this.velocidadProcesador);
    }
    
    public abstract void imprimirDetallesDelEquipo();
}