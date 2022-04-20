public class Product {
    private String name;
    private float price;
    private int qty;
    private int id;

    public Product () {
       name = "Product 1" ;
       price = 100;
       qty = 5;
       id = 1;
    }
    public Product(String name, float price, int qty, int id) {
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    public int getQty() {
        return this.qty;
    }
    public int getId() {
        return this.id;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return this.price;
    }


    // Test Product
    public static void main(String[] args) {
        Product objTest = new Product();
        System.out.println("Name: " + objTest.getName());
        System.out.println("Quantity " + objTest.getQty());
        System.out.println("ID: " + objTest.id);
        objTest.setPrice(400);
        System.out.println("Price: " + objTest.getPrice());
    }
}
