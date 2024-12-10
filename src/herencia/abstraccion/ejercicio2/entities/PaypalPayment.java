package herencia.abstraccion.ejercicio2.entities;

public class PaypalPayment extends Payment{
    private String paypalId;

    public PaypalPayment(Double coste,String paypalId){
        super(coste);
        this.paypalId = paypalId;
    }
    public void processPayment(){
        System.out.println("Procesando Pago de Paypal...");
    }
    public void displayPaymentDetails(){
        System.out.println("Los datos del usuario son:"+
                "\nCorreo del titular: "+this.paypalId+
                "\nDinero: "+this.monto);
    }
}
