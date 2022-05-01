class B1b_FourWheeler extends B1a_Vehicle {
    private boolean powerSteer; // steering information

    public  B1b_FourWheeler(String vId, String vName, int numWheels, boolean pSteer ) {
            vehicleNo = vId;
            vehicleName = vName;
            wheels = numWheels;
            powerSteer = pSteer;
        }
     public void showDetails() {
         System.out.println("Vehicle no: " + vehicleNo);
         System.out.println("Vehicle name: " + vehicleName);
         System.out.println("Number of Wheels: " + wheels);
         if(powerSteer == true)
             System.out.println("Power Steering: Yes");
         else
             System.out.println("Power Steering : No");
     }

    public static void main(String[] args) {
        B1b_FourWheeler objFour = new B1b_FourWheeler("LA-09CS-1406", "Volkswagen", 4, true);
        objFour.showDetails();
        objFour.accelerate(200);

    }
}

