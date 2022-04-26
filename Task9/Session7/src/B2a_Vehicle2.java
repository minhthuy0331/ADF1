class B2a_Vehicle2 {
    protected String vehicleNo;
    protected String vehicleName;
    protected int wheels;

    public B2a_Vehicle2(String vId, String vName, int numWheels) {
        vehicleNo = vId;
        vehicleName = vName;
        wheels = numWheels;
    }
    public void accelerate(int speed) {
        System.out.println("Accelerating at: " + speed + "kmph");
    }

}
