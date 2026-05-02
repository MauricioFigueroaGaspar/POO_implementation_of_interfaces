import java.util.Scanner;

public class Refrigerador extends Electrodomestico implements Encendible, Conectable {
    private double temp = 10;
    private boolean conexion=false;
    private boolean encendido=false;


    public Refrigerador(Scanner sc) {
        System.out.println("Creando un Refrigerador...");
        super(sc);
    }

    public void enfriar() {
        if (temp == 0) System.out.println("Temperatura de 0 grados alcanzada.");
        else System.out.println("Cambiando temperatura de " + temp + " a " + (temp-2) + ".");
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo refrigerador...");
        this.encendido=true;
    }

    @Override
    public void apagar() {
        System.out.println("Refrigerador en estado de reposo...");
        this.encendido=false;
    }

    @Override
    public void estado(){
        System.out.println("Revisando estado del refrigerador...");

        if(this.encendido) System.out.println("El refrigerador esta encendido.");
        else               System.out.println("El refrigerador esta apagado.");
    }

    @Override
    public void conectarWifi() {
        System.out.println("Conectando refrigerador a Internet...");
        this.conexion=true;
    }

    @Override
    public void desconectarWifi() {
        System.out.println("Desconectando refrigerador de la red...");
        this.conexion=false;
    }

    @Override
    public void estadoDeConexion() {
        System.out.println("Revisando estado de conexion del refrigerador...");
        
        if(this.conexion) System.out.println("El refrigerador esta conectado a Internet.");
        else         System.out.println("El refrigerador no esta conectado a Internet.");
    }

    @Override 
    public void prepararElectrodomestico(){
        System.out.println("Limpiando compresor...");
    }

}