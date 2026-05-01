import java.util.Scanner;

public abstract class Electrodomestico {
    private int consumoEnWatts;

    private String marca="";

    public void pedirInformacion(Scanner sc){
        System.out.println("Ingrese la marca del electrodomestico");
        this.marca=sc.nextLine();
        System.out.println("Ingrese el consumo en Watts");
        this.consumoEnWatts=sc.nextInt();
        sc.nextLine();
    }

    public void imprimirInformacion(){
        System.out.println("Marca: "+this.marca);
        System.out.println("Consumo en Watts: "+this.consumoEnWatts);
    }
    
    public abstract void prepararElectrodomestico();
}