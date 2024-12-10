package TreeMap;

import java.util.*;

public class TreeMapEjercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un TreeMap
        TreeMap<Integer, Products> products = new TreeMap<>();

        int id = 0;
        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenu Products");
            System.out.println("1. Add product");
            System.out.println("2. Delete product");
            System.out.println("3. Recover price");
            System.out.println("4. Print products in alphabetical order");
            System.out.println("5. Exit");
            System.out.println("Enter the option:");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    id++;
                    add(products, id, scanner);
                    break;
                case 2:
                    delete(products, scanner);
                    break;
                case 3:
                    recover(products, id, scanner);
                    break;
                case 4:
                    details(products);
                    break;
                case 5:
                    System.out.println("Bye..");
                    exit = true;
                    break;
                default:
                    System.out.println("The option is invalid");
            }
        }
    }

    public static void add(TreeMap<Integer, Products> products, int id, Scanner scanner) {
        scanner.nextLine();
        System.out.println("Enter the name of Product:");
        String name = scanner.nextLine();
        System.out.println("Enter the price of Product:");
        Double price = scanner.nextDouble();
        products.put(id, new Products(name, price));
        System.out.println("\nThe Product add is: " + "\nName: " + name + " \nPrice: " + price + " \nId: #" + id);
    }

    public static void delete(TreeMap<Integer, Products> products, Scanner scanner) {
        if (!products.isEmpty()) {
            scanner.nextLine();
            System.out.println("Enter the name of the Product to delete:");
            String nameDelete = scanner.nextLine();
            int id = 0;
            for (Map.Entry<Integer, Products> productsEntry : products.entrySet()) {
                if (productsEntry.getValue().getName().equalsIgnoreCase(nameDelete)) {
                    id = productsEntry.getKey();
                }
            }
            if (id != 0) {
                products.remove(id);
                System.out.println("The Products are:");
                for (Products details : products.values()) {
                    System.out.printf("-Name: %s %n-Price: %s %n", details.getName(), details.getPrice());
                }
            } else
                System.out.println("Product is invalid or doesn't exist");
        } else {
            System.out.println("The Product doesn't exist =(");
        }
    }

    public static void recover(TreeMap<Integer, Products> products, int id, Scanner scanner) {
        if (!products.isEmpty()) {
            scanner.nextLine();
            System.out.println("Enter the Id to recover the price of the product:");
            int idRecover = scanner.nextInt();
            if (products.containsKey(idRecover)) {
                System.out.printf("The recovered product is %s and its price is: %s%n", products.get(idRecover).getName(), products.get(idRecover).getPrice());
            } else {
                System.out.println("The product id doesn't exist or invalid");
            }
        } else {
            System.out.println("\nNot exists Products =(");
        }
    }

    public static void details(TreeMap<Integer, Products> products) {
        if (!products.isEmpty()) {
            // Extraer los nombres de los productos
            List<String> nameProduct = new ArrayList<>();
            for (Products product : products.values()) {
                nameProduct.add(product.getName());
            }

            // Ordenar los nombres alfabéticamente
            Collections.sort(nameProduct);

            // Imprimir los nombres en orden alfabético
            System.out.println("\nThe products in alphabetical order:");
            for (String name : nameProduct) {
                System.out.println(name);
            }
        } else {
            System.out.println("\nThe list of products is empty =(");
        }
    }
}
