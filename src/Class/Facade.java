package Class;
import java.util.Scanner;

public class Facade {

    public void facade() {
        Metodos metodo = new Metodos();
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.println("**********INICIO JUEGO DEL SOLDADO*************");
        System.out.println(" ");
        
        System.out.println(" ");
        System.out.print("INGRESE SOLDADO :");
        String name = scanner.next();
        
        while (!name.equals("PAUSA")) {
            metodo.AgregarSoldado(name);

            System.out.println(" ");
            System.out.print("INGRESE SOLDADO  :");
            name = scanner.next();
        }
        
        Nodo aux = metodo.Inicio;
        System.out.println(" ");
        System.out.println("INDIQUE EL SALTO |n| POR EL CUAL SE ELIMINARA EL SOLDADO :");
        int n = scanner.nextInt();
        metodo.Jose(aux, n);
    
    }

}
