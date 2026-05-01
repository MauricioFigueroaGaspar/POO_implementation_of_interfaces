public class Laptop extends DispositivoComputo implements Encendible {
    private int bateria = 0;

    public void cargar() {
        if (bateria == 100) System.out.println("La bateria de la laptop esta cargada por completo.");
        else System.out.println("La bateria subio de " + bateria + " a " + (bateria+5) + ".");
    }

    @Override
    public void encender() {
        System.out.println("Prendiendo laptop...");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando laptop...");
    }

    @Override
    public void imprimirDetallesDelEquipo(){
        System.out.println("Detalles de la laptop:");
        this.imprimirProcesador();
        System.out.println("Bateria: "+this.bateria+"%");
        
    }
}