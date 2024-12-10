package herencia.abstraccion.ejercicio2.entities;

public abstract class Payment {
    protected Double monto;

    public Payment(Double monto){
        this.monto = monto;
    }
    public abstract void processPayment();

    public abstract void displayPaymentDetails();
}