package Product;
public class Product {
    private String id;
    private String name;
    private double price;
    private int qty;
    private String color;

    public Product(String id, String name, double price , int qty, String color) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.color = color;

    }
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void getInfo() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Price: " + this.price);
        System.out.println("Quantity: " + this.qty);

    }
}
