import java.util.Scanner;

public class AppMenu {

    private Electrodomestico electrodomesticos[] = new Electrodomestico[5];
    private DispositivoComputo dispositivos[] = new DispositivoComputo[5];
    

    public void crearObjetos(Scanner sc){
        
        // crear electrodomesticos
        for (int i =0; i<5;i++){
            System.out.println("\nElectrodomestico "+(i+1)+":\n");
            
            // i = 0,1 crea una nueva lavadora
            if (i/2==0){
                this.electrodomesticos[i]=new Lavadora(sc);
            }

            // i = 2,3 crea un nuevo horno inteligente
            else if(i/2==1){
                this.electrodomesticos[i]=new HornoInteligente(sc);
            }

            // i = 4 crea un nuevo refrigerador
            else if(i/2==2){
                this.electrodomesticos[i]=new Refrigerador(sc);
            }
        }

        // crear dispositivos de computo
        for (int i =0; i<5;i++){
            System.out.println("\nDispositivo "+(i+1)+":\n");

            // i = 0,1 crea una nueva Tablet
            if(i/2==0){
                this.dispositivos[i]=new Tablet(sc);
            }
            // i = 2 crea una nueva Laptop
            else if(i/2==1){
                this.dispositivos[i]=new Laptop(sc);
            }

            // i = 3 crea un nuevo servidor
            else if(i/2==2){
                this.dispositivos[i]=new Servidor(sc);
            }
        }
    }



    public void ejecutar(Scanner sc){
        
        for (int i =0; i<5;i++){
            System.out.println("\nElectrodomestico "+(i+1)+":\n");
            
            // i = 0,1 crea una nueva lavadora
            if (i/2==0){
                this.electrodomesticos[i].imprimirInformacion();
                Lavadora l =(Lavadora) this.electrodomesticos[i];
                l.lavar();
            }

            // i = 2,3 crea un nuevo horno inteligente
            else if(i==2){
                this.electrodomesticos[i].imprimirInformacion();
                HornoInteligente h =(HornoInteligente) this.electrodomesticos[i];
                h.prepararElectrodomestico();
                h.calentar();
                h.conectarWifi();
                h.estadoDeConexion();
                h.desconectarWifi();
                h.estadoDeConexion();
                


            }
            // i == 3 horno inteligente 2
            else if(i==3){
                this.electrodomesticos[i].imprimirInformacion();
                HornoInteligente h =(HornoInteligente) this.electrodomesticos[i];
                h.calentar();
                h.estadoDeConexion();



            }
            
            // i = 4 crea un nuevo refrigerador
            else if(i/2==2){
                this.electrodomesticos[i].imprimirInformacion();
                Refrigerador r =(Refrigerador) this.electrodomesticos[i];
                r.encender();
                r.estado();
                r.prepararElectrodomestico();
                r.enfriar();
                r.conectarWifi();
                r.estadoDeConexion();
                r.desconectarWifi();
                r.estadoDeConexion();
                r.apagar();
                r.estado();
            }
        }

        // crear dispositivos de computo
        for (int i =0; i<5;i++){
            System.out.println("\nDispositivo "+(i+1)+":\n");

            // i = 0,1 crea una nueva Tablet
            if(i/2==0){
                Tablet t = (Tablet) this.dispositivos[i];
                t.imprimirDetallesDelEquipo();
                t.cargar();
                t.encender();
                t.estado();
                t.conectarWifi();
                t.estadoDeConexion();
                t.desconectarWifi();
                t.estadoDeConexion();
                t.apagar();
                t.estado();
            }
            // i = 2 crea una nueva Laptop
            else if(i/2==1){
                Laptop l = (Laptop) this.dispositivos[i];
                l.imprimirDetallesDelEquipo();
                l.cargar();
                l.encender();
                l.estado();
                l.apagar();
                l.estado();
            }

            // i = 3 crea un nuevo servidor
            else if(i/2==2){
                Servidor s = (Servidor)this.dispositivos[i];
                s.imprimirDetallesDelEquipo();
                s.reiniciar();
                s.conectarWifi();
                s.estadoDeConexion();
                s.desconectarWifi();
                s.estadoDeConexion();
                
            }
        }
        
    }
}