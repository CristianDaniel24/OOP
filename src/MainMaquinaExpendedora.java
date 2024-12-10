
import java.util.Scanner;

public class MainMaquinaExpendedora {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Define items and prices
            String[] items = {"soda", "chips", "candy","gaseosa"};
            double[] prices = {1.50, 2.00, 1.25, 0.75};
            System.out.println("Ingresa el nombre de la maquina expendedora:");
            String machineName = scanner.nextLine();

            // Create a VendingMachine object
            MaquinaExpendedora expendedora = new MaquinaExpendedora(machineName,items,prices);
            // Display initial machine details
            expendedora.mostrarItems();
            System.out.println("\nIngresa el producto que deseas comprar");
            String articuloCompra = scanner.nextLine();
            System.out.println("Ingrese tu dinero");
            double dinero = scanner.nextDouble();
            // Purchase an item
            expendedora.comprarArticulo(articuloCompra,dinero);

            expendedora.detalles();
        }
    }
