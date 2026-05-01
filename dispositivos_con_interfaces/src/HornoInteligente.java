public class HornoInteligente extends Electrodomestico implements Conectable {
    private double temp = 0;

    public void calentar() {
        if (temp == 180) System.out.println("Temperatura de 180 grados alcanzada.");
        else System.out.println("Cambiando temperatura de " + temp + " a " + (temp+5) + ".");
    }

    @Override
    public void conectarWifi() {
        System.out.println("Conectando horno inteligente a WiFi...");
    }

    @Override
    public void desconectarWifi() {
        System.out.println("Desconectando horno inteligente de WiFi...");
    }

    @Override
    public void estadoDeConexion() {
        System.out.println("Revisando estado de conexion del horno inteligente...");
    }

    @Override 
    public void prepararElectrodomestico(){
        System.out.println("Ajustando la presion del gas...");
    }


}