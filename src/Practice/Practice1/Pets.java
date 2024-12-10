package Practice.Practice1;

public class Pets {

    private String name;
    private int stock;
    private String tipe;

    public Pets(String name, int stock, String tipe) {
        this.name = name;
        this.stock = stock;
        this.tipe = tipe;
    }

    public Pets() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getTipe() {
        return this.tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }


}
