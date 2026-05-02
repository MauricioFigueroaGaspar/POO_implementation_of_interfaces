import java.util.Scanner;

public class HornoInteligente extends Electrodomestico implements Conectable {
    private double temp = 20;
    private boolean conexion=false;



    public HornoInteligente(Scanner sc) {
        System.out.println("Creando un Horno Inteligente...");
        super(sc);
    }

    public void calentar() {
        if (temp == 180) System.out.println("Temperatura de 180 grados alcanzada.");
        else {
            System.out.println("Cambiando temperatura de " + temp + " a " + (temp+10) + ".");
            temp+=10;
        }
    }

    @Override
    public void conectarWifi() {
        System.out.println("Conectando horno inteligente a WiFi...");
        this.conexion=true;
    }

    @Override
    public void desconectarWifi() {
        System.out.println("Desconectando horno inteligente de WiFi...");
        this.conexion=false;
    }

    @Override
    public void estadoDeConexion() {
        System.out.println("Revisando estado de conexion del horno inteligente...");

        if(this.conexion) System.out.println("El horno inteligente esta conectado a Internet.");
        else              System.out.println("El horno inteligente no esta conectado a Internet.");
    }

    @Override 
    public void prepararElectrodomestico(){
        System.out.println("Ajustando la presion del gas...");
    }


}