package herencia.polimorfismo.ejercicio1.entities;

public class preparacion2 extends Pastel{
    private int galletas;

    public preparacion2(String harina, Double leche, int huevo, int galletas) {
        super(harina, leche, huevo);
        this.galletas = galletas;
    }

    public int getGalletas() {
        return galletas;
    }

    @Override
    public String detallesPastel() {
        return "Para esta ultima preparacion se necesita:" +
                "\nHarina: " + this.harina +
                "\nleche: " + this.leche +
                "\nHuevos: " + this.huevos +
                "\nGalletas: " + this.galletas;
    }
}