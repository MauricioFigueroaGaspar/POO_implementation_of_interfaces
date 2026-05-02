import java.util.Scanner;

public class Servidor extends DispositivoComputo implements Conectable {
    private int reinicios = 0;
    private boolean conexion=false;

    public Servidor(Scanner sc) {
        System.out.println("Creando un Servidor...");
        super(sc);
    }

    public void reiniciar() {
        System.out.println("Reiniciando servidor por "+ ++reinicios + " vez");
    }

    @Override
    public void conectarWifi() {
        System.out.println("Conectando servidor a Internet...");
        this.conexion=true;
    }

    @Override
    public void desconectarWifi() {
        System.out.println("Desconectando servidor...");
        this.conexion=false;
    }

    @Override
    public void estadoDeConexion() {
        System.out.println("Revisando estado de conexion del servidor...");
        
        if(this.conexion)   System.out.println("El servidor esta conectado a Internet.");
        else                System.out.println("El servidor no esta conectado a Internet.");
    }

    @Override
    public void imprimirDetallesDelEquipo(){
        System.out.println("Detalles del servidor:");
        this.imprimirProcesador();
        System.out.println("Reinicios: "+this.reinicios);
    }

}