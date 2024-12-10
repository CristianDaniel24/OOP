package Streams.GroupingBy;

public class Product {
    private String name;
    private String category;
    private double price;

    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}
