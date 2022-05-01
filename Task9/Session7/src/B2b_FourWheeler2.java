class B2b_FourWheeler2 extends B2a_Vehicle2 {
    private boolean powerSteer;
    public B2b_FourWheeler2(String vId, String vName, int numWheels, boolean pSteer ) {
        super(vId, vName, numWheels );
        powerSteer = pSteer;
    }
    public void showDetails() {
        System.out.println("Vehicle no: " + vehicleNo);
        System.out.println("Vehicle name: " + vehicleName);
        System.out.println("Number of Wheels: " + wheels);
        if(powerSteer == true)
            System.out.println("PowerSteering: Yes");
        else
            System.out.println("Power Steering: No");
    }

    public void accelerate(int speed) {
        super.accelerate(speed);
        System.out.println("Maximum acceleration: " + speed + "kmph" );
    }

    public static void main(String[] args) {
        B2b_FourWheeler2 objFour = new B2b_FourWheeler2("LA-09CS-1406", "Volkswagen", 4, true);
        objFour.showDetails();
        objFour.accelerate(300);
    }

    static class B2a_Vehicle2 {
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
}

