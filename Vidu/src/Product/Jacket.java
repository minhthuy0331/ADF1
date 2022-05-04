package Product;
public class Jacket extends Product {
    private String size;

    public Jacket(String id, String name, double price, int qty, String color, String size) {
        super(id, name, price, qty, color);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void getInfo() {
        super.getInfo();
        System.out.println("Size: " + size);

    }

}
