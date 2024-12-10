package parte1;

class CuentaBancaria{
    private String titular;
    private int cuenta;
    private Double balance;


   public CuentaBancaria(String titular, int cuenta, Double balance){
       this.titular = titular;
       this.cuenta = cuenta;
       this.balance = balance;
   }
    public void agregarDinero(Double valorAbono){
    this.balance += valorAbono;
        System.out.println("El nuevo saldo es: "+this.balance);
    }
    public void retirarDinero(Double valorRetiro){
       this.balance -= valorRetiro;
        System.out.println("El nuevo saldo es: "+this.balance);
    }
    public void imprimir(){
        System.out.println("El titular es: "+this.titular);
        System.out.println("La cuenta es: "+this.cuenta);
        System.out.println("El saldo actual es: "+this.balance);
    }
}