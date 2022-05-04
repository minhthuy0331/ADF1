package Product;
public class TestProduct {
    public static void main(String[] args) {
        Jacket j1 = new Jacket("J01", "Áo khoác boomber", 150000, 10, "White", "Freesize");
        j1.getInfo();

        System.out.println("--------------------------");
        Trousers t1 = new Trousers("T01","Quần Jogger", 100000, 15, "Black", "OEM");
        t1.getInfo();
    }
}
