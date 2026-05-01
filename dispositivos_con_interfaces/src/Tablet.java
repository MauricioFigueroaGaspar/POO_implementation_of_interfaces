public class Tablet extends DispositivoComputo implements Encendible, Conectable {
    private int bateria = 0;

    public void cargar() {
        if (bateria == 100) System.out.println("La bateria de la tablet esta cargada por completo.");
        else System.out.println("La bateria paso de " + bateria + " a " + (bateria+5) + ".");
    }

    @Override
    public void encender() {
        System.out.println("Prendiendo tablet...");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando tablet...");
    }

    @Override
    public void conectarWifi() {
        System.out.println("Conectando tablet a la red...");
    }

    @Override
    public void desconectarWifi() {
        System.out.println("Desconectando tablet de WiFi...");
    }

    @Override
    public void estadoDeConexion() {
        System.out.println("Revisando estado de conexion de la tablet...");
    }

    @Override
    public void imprimirDetallesDelEquipo() {
        System.out.println("Detalles de la tablet:");
        this.imprimirProcesador();
        System.out.println("Bateria: "+this.bateria+"%");
    }   
}