package herencia.ejercicio1.entities;

public class Bicicleta extends Vehiculo {
    private boolean pitido;

    public Bicicleta(int fecha, String modelo, boolean pitido){
         super(fecha, modelo);
         this.pitido = pitido;
    }

    public void detallesPersonalizado(){
        System.out.println("\nLa bicicleta es del " +this.getFecha()+" y su modelo es "+this.getModelo());
        System.out.println("La bicicleta " + this.obtenerTexto() + " tiene pitido");
    }

    @Override
    public void detalles() {

        super.detalles();
        System.out.println("La bicicleta " + this.obtenerTexto() + " tiene pitido");
    }
    public String obtenerTexto(){
        /*String texto;
        if (this.pitido){
            texto = "si";
        }else {
            texto = "no";
        }
        return texto;
         */
        return this.pitido?"si":"no";
    }
}