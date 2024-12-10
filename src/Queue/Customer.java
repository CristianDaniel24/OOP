package Queue;

public class Customer {
    private String name;
    private String order;

    public Customer(String name, String order) {
        this.name = name;
        this.order = order;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrder() {
        return this.order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
