import java.util.Scanner;

public class Tablet extends DispositivoComputo implements Encendible, Conectable {
    private int bateria = 30;
    private boolean conexion=false;
    private boolean encendido=false;


    public Tablet(Scanner sc) {
        System.out.println("Creando una Tablet...");
        super(sc);
    }

    public void cargar() {
        if (bateria == 100) System.out.println("La bateria de la tablet esta cargada por completo.");
        else System.out.println("La bateria paso de " + bateria + " a " + (bateria+5) + ".");
    }

    @Override
    public void encender() {
        System.out.println("Prendiendo tablet...");
        this.encendido=true;
    }

    @Override
    public void apagar() {
        System.out.println("Apagando tablet...");
        this.encendido=false;
    }

    @Override
    public void estado(){
        System.out.println("Revisando estado de la tablet...");

        if(this.encendido) System.out.println("La tablet esta encendida.");
        else               System.out.println("La tablet esta apagada.");
    }

    @Override
    public void conectarWifi() {
        System.out.println("Conectando tablet a la red...");
        this.conexion=true;
    }

    @Override
    public void desconectarWifi() {
        System.out.println("Desconectando tablet de WiFi...");
        this.conexion=false;
    }

    @Override
    public void estadoDeConexion() {
        System.out.println("Revisando estado de conexion de la tablet...");

        if(this.conexion) System.out.println("La tablet esta conectada a Internet.");
        else              System.out.println("La tablet no esta conectada a Internet.");
    }

    @Override
    public void imprimirDetallesDelEquipo() {
        System.out.println("Detalles de la tablet:");
        this.imprimirProcesador();
        System.out.println("Bateria: "+this.bateria+"%");
    }   
}