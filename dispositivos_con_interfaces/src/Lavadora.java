public class Lavadora extends Electrodomestico implements Encendible {
    private int lavadas = 0;

    public void lavar() {
        System.out.println("Se ha lavado ropa " + ++lavadas + " veces.");
    }

    @Override
    public void encender() {
        System.out.println("Preparando lavadora...");
    }

    @Override
    public void apagar() {
        System.out.println("Intentando apagar lavadora...");
    }
}