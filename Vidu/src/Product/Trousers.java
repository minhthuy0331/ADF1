package Product;
public class Trousers extends Product{
    private String origin;

    public Trousers(String id, String name, double price, int qty, String color, String origin) {
        super(id, name, price, qty, color);
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void getInfo() {
        super.getInfo();
        System.out.println("Origin: " + origin);

    }

}
