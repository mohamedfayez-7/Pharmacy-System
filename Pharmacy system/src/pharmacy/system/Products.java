package pharmacy.system;

public class Products {
    private String name;
    private double price;
    private int code;
    private int quantity;

    public Products(String name, double price, int code, int quantity) {
        this.name = name;
        this.price = price;
        this.code = code;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products{" + "name=" + name + ", price=" + price + ", code=" + code + ", quantity=" + quantity + '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
