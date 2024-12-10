
class MaquinaExpendedora {
    // Attributes
    private String machineName;
    private String[] items;
    private double[] prices;

    // Constructor to initialize attributes
    public MaquinaExpendedora(String machineName, String[] items, double[] prices) {
        this.machineName = machineName;
        this.items = items;
        this.prices = prices;
    }

    // Method to display available items and prices
    public void mostrarItems() {
        System.out.println("Los items de la maquina expendedora son:");
        for (int i = 0; i < this.items.length; i++) {
            System.out.println(this.items[i] + " " + this.prices[i]);
        }
    }

    // Method to purchase an item
    public void comprarArticulo(String articuloCompra, double dinero) {
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i].equals(articuloCompra)) {
                System.out.println("Producto existente");
                if (prices[i] <= dinero) {
                    System.out.println("\nRealizando compra...");
                    double rest = dinero - prices[i];
                    System.out.println("Las vueltas son: " + rest);
                } else {
                    System.out.println("El dinero es insuficiente");
                }
                return;
            }
        }
        System.out.println("El producto "+articuloCompra+" no existe en la tienda");
        }
        // Method to display machine details
        public void detalles () {
            System.out.println("\nEl nombre de la maquina es: " + machineName);
            System.out.println("Los productos disponibles son");
            for (int i = 0; i < items.length; i++) {
                System.out.println((items[i]));
            }
        }
    }