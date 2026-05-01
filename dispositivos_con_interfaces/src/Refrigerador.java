public class Refrigerador extends Electrodomestico implements Encendible, Conectable {
    private double temp = 10;

    public void enfriar() {
        if (temp == 0) System.out.println("Temperatura de 0 grados alcanzada.");
        else System.out.println("Cambiando temperatura de " + temp + " a " + (temp-2) + ".");
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo refrigerador...");
    }

    @Override
    public void apagar() {
        System.out.println("Refrigerador en estado de reposo...");
    }

    @Override
    public void conectarWifi() {
        System.out.println("Conectando refrigerador a Internet...");
    }

    @Override
    public void desconectarWifi() {
        System.out.println("Desconectando refrigerador de la red...");
    }

    @Override
    public void estadoDeConexion() {
        System.out.println("Revisando estado de conexion del refrigerador...");
    }

    @Override 
    public void prepararElectrodomestico(){
        this.encender();
        this.enfriar();
    }

}