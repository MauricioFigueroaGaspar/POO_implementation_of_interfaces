import java.util.Scanner;

public class Lavadora extends Electrodomestico implements Encendible {
    private int lavadas = 0;
    private boolean encendido=false;

    public Lavadora(Scanner sc) {
        System.out.println("Creando una Lavadora...");
        super(sc);
    }

    public void lavar() {
        this.encender();
        this.estado();
        this.prepararElectrodomestico();
        System.out.println("Lavando...se ha lavado ropa " + ++lavadas + " veces.");
        this.apagar();
        this.estado();
    }

    @Override
    public void encender() {
        System.out.println("Prendiendo lavadora");
        this.encendido=true;
    }

    @Override
    public void apagar() {
        System.out.println("Apagando lavadora...");
        this.encendido=false;
    }

    @Override
    public void estado(){
        System.out.println("Revisando estado de la lavadora...");

        if(this.encendido) System.out.println("La lavadora esta encendida.");
        else              System.out.println("La lavadora esta apagada.");
    }

    @Override 
    public void prepararElectrodomestico(){
        System.out.println("Limpiando tina....");
    }
    
}