import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        AppMenu app=new AppMenu();
        app.crearObjetos(sc);
        
        



        app.ejecutar(sc);
    }
}