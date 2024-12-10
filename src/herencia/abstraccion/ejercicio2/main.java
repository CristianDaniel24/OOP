package herencia.abstraccion.ejercicio2;

import herencia.abstraccion.ejercicio2.entities.CreditCardPayment;
import herencia.abstraccion.ejercicio2.entities.Payment;
import herencia.abstraccion.ejercicio2.entities.PaypalPayment;

public class main {
        public static void main(String[] args) {
            // Create an array of Payment objects
            Payment[] payments = {
                    new CreditCardPayment(150.00, "1234-5678-9012-3456", "John Doe"),
                    new PaypalPayment(75.50, "john.doe@example.com"),
                    new CreditCardPayment(200.00, "9876-5432-1098-7654", "Jane Smith"),
                    new PaypalPayment(50.25, "jane.smith@example.com"),
            };
            // Process each payment and display its details
            for (Payment payment : payments) {
                payment.displayPaymentDetails();
                payment.processPayment();
                System.out.println(" ");
            }
        }
}