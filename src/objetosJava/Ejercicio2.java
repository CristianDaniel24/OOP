package objetosJava;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {

        List<Customer> listCustomer = new ArrayList<>();

        listCustomer.add(new Customer("Juan", 300398576, "Calle 12 - 43"));
        listCustomer.add(new Customer("Ana", 320483978, "Carrera 10-23"));
        listCustomer.add(new Customer("Carlos", 350893472, "Calle 10-3b"));

        listCustomer.forEach(p ->
                System.out.println("\nName: " + p.getName() + "\nPhone: " + p.getPhone() + "\nAddress: " + p.getAddress())
        );
    }
}
