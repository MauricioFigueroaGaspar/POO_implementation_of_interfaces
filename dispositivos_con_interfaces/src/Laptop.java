import java.util.Scanner;

public class Laptop extends DispositivoComputo implements Encendible {
    private int bateria = 0;
    private boolean encendido=false;
    

    public Laptop(Scanner sc) {
        System.out.println("Creando una Laptop...");
        super(sc);
    }

    public void cargar() {
        if (bateria == 100) System.out.println("La bateria de la laptop esta cargada por completo.");
        else System.out.println("La bateria subio de " + bateria + " a " + (bateria+5) + ".");
    }

    @Override
    public void encender() {
        System.out.println("Prendiendo laptop...");
        this.encendido=true;
    }

    @Override
    public void apagar() {
        System.out.println("Apagando laptop...");
        this.encendido=false;
    }

    @Override
    public void estado(){
        System.out.println("Revisando estado de la laptop...");
        
        if(this.encendido) System.out.println("La laptop esta encendida.");
        else              System.out.println("La laptop esta apagada.");
    }


    @Override
    public void imprimirDetallesDelEquipo(){
        System.out.println("Detalles de la laptop:");
        this.imprimirProcesador();
        System.out.println("Bateria: "+this.bateria+"%");

    }
}