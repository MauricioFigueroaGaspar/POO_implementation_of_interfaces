public class Servidor extends DispositivoComputo implements Conectable {
    private int reinicios = 0;

    public void reiniciar() {
        System.out.println("Reiniciando servidor por "+ ++reinicios + " vez");
    }

    @Override
    public void conectarWifi() {
        System.out.println("Conectando servidor a Internet...");
    }

    @Override
    public void desconectarWifi() {
        System.out.println("Desconectando servidor...");
    }

    @Override
    public void estadoDeConexion() {
        System.out.println("Revisando estado de conexion...");
    }

    @Override
    public void imprimirDetallesDelEquipo(){
        System.out.println("Detalles del servidor:");
        this.imprimirProcesador();
        System.out.println("Reinicios: "+this.reinicios);
    }

}