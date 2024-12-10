package herencia.abstraccion.ejercicio2.entities;

public class CreditCardPayment extends Payment{
    private String cardNumber;
    private String cardHolderName;

public CreditCardPayment(Double coste, String cardNumber,String cardHolderName){
    super(coste);
    this.cardNumber = cardNumber;
    this.cardHolderName = cardHolderName;
}

    public void processPayment(){
        System.out.println("Procesando Pago de la Tarjeta...");
}

    public void displayPaymentDetails(){
        System.out.println("Los datos del usuario son:"+
                "\nNombre del titular: "+this.cardHolderName+
                "\nNumero de tarjeta: "+this.cardNumber+
                "\nDinero: "+this.monto);
    }
}
