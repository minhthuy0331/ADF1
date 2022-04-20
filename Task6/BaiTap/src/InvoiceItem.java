public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(String ID, String Desc, int Qty, double UnitPrice) {
        this.id = ID;
        this.desc = Desc;
        this.qty= Qty;
        this.unitPrice = UnitPrice;
    }

    public String getId() {
        return id;
    }
    public String getDesc() {
        return desc;
    }
    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public double getTotal() {
        return unitPrice * qty;
    }
    public String toString() {
        return "InvoiceItem [id = " + id + " ,desc = " + desc + ", qty = " + qty + ",unitPrice = " + unitPrice + "]" ;
    }

    // Test InvoiceItem
    public static void main(String[] args) {
        InvoiceItem objIn = new InvoiceItem("T01", "Chocolate", 10, 6000);
        System.out.println("ID: " + objIn.getId());
        System.out.println("Description: " + objIn.getDesc());
        System.out.println("Quantity: " + objIn.qty);
        System.out.println("Unit Price: " + objIn.getUnitPrice());
        System.out.println("ToTal: " + objIn.getTotal() );
        System.out.println(objIn.toString());

        System.out.println("-----------");
        objIn.setQty(15);
        System.out.println("After setQuantity: " + objIn.getQty());
        objIn.setUnitPrice(8000);
        System.out.println("ToTal: " + objIn.getTotal() );
        System.out.println(objIn.toString());
    }
}
