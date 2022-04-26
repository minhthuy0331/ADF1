public class B5b_Bicycle {
    boolean gear;
    public B5b_Bicycle(String vId, String vName, int tyres, float price,boolean gear ) {
        super(vId, vName, tyres, price);
        this.gear = gear;
    }
    public void printDetails() {
        if(gear == true)
            System.out.println("Geared: Yes");
        else
            System.out.println("Geared: No");
    }

    public static void main(String[] args) {
        B5a_TwoWheeler obj = new B5b_Bicycle(args[0], args[1],Integer.parseInt(args[2],args[3], args[4]));
        obj.printDetails();

    }
}
