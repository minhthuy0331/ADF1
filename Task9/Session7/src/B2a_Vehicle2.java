public class B2a_Vehicle2 {
        protected String vehicleNo;
        protected String vehicleName;
        protected int wheels;  // number of wheels

    public B2a_Vehicle2(String vId, String vName, int numWheels) {
    }

    public void accelerate(int speed) {
            System.out.println("Accelerating at: " + speed + "kmph");
        }


}
