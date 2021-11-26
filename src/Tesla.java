public class Tesla implements Auto{

    private final String version;
    private static final String brand = "Tesla";
    private final int maxSpeed;
    private final double accelerationTo100;
    private byte batteryFull;
    private final double batteryVolume;
    private double clearance;
    private boolean autopilotOn;

    public Tesla(String model_x, String automatic, String version, int volume, byte clearance1, int maxSpeed, byte batteryFull, double batteryVolume, double clearance, double accelerationTo100, boolean autopilotOn) {
        this.version = version;
        this.maxSpeed = maxSpeed;
        this.batteryFull = batteryFull;
        this.batteryVolume = batteryVolume;
        this.clearance = clearance;
        this.accelerationTo100 = accelerationTo100;
        this.autopilotOn = autopilotOn;
    }

    public String getVersion() {
        return version;
    }

    public String getBrand() {
        return brand;
    }

    public double getAccelerationTo100() {
        return accelerationTo100;
    }

    public byte getBatteryFull() {
        return batteryFull;
    }

    private void setBatteryFull(byte fuelSupply) {
        this.batteryFull = fuelSupply;
    }

    public double getBatteryVolume() {
        return batteryVolume;
    }

    public double getClearance() {
        return clearance;
    }

    public void setClearance(double clearance) {
        this.clearance = clearance;
    }

    public boolean isAutopilotOn() {
        return autopilotOn;
    }

    private void setAutopilotOn(boolean autopilotOn) {
        this.autopilotOn = autopilotOn;
    }


    public void workWithAutopilot(boolean onOrOff, String destination){
        if(isAutopilotOn()==onOrOff){
            System.out.println("The autopilot is already in this state");
        }
        else{
            if(!onOrOff){
                setAutopilotOn(false);
                System.out.println("The autopilot in " + getBrand() + " is off, the steering wheel is in your hands!");
            }
            else {
                setAutopilotOn(true);
                System.out.println("The autopilot in " + getBrand() + " is on, you can rest! " +
                        "The path to " + destination + " has been paved.");
            }
        }
    }

    @Override
    public void drive() {
        System.out.printf("\n%s %s is driving.\n", getBrand(), getVersion());
    }

    @Override
    public void brake() {
        System.out.println( getBrand() + " is braking.");
    }

    @Override
    public void turn(String direction) {
        System.out.println( getBrand() + " is turning on " + direction);
    }


    @Override
    public void replenishStock(byte percent) {
        if(percent+ getBatteryFull()>100 || percent<0){
            System.out.println("Please enter another number!");
        }
        else{
            setBatteryFull((byte) (getBatteryFull() + percent));
            System.out.printf("\nThe %s is filled with energies for %s percent. " +
                    "Total in battery %s percent.", getBrand(), percent, getBatteryFull());
        }
    }
}