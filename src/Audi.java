public class Audi implements Auto{

    private final String version;
    private static final String brand = "Audi";
    private final int maxSpeed;
    private final double accelerationTo100;
    private boolean speedCutterOn;
    private boolean climateControlOn;

    public Audi(String a5, String automatic, String version, int i, byte b2, byte b1, byte b, int maxSpeed, double v, double accelerationTo100, boolean speedCutterOn, boolean climateControlOn) {
        this.version = version;
        this.maxSpeed = maxSpeed;
        this.accelerationTo100 = accelerationTo100;
        this.speedCutterOn = speedCutterOn;
        this.climateControlOn = climateControlOn;
    }

    public String getVersion() {
        return version;
    }

    public String getBrand() {
        return brand;
    }


    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getAccelerationTo100() {
        return accelerationTo100;
    }

    public boolean isSpeedCutterOn() {
        return speedCutterOn;
    }

    private void setSpeedCutterOn(boolean speedCutterOn) {
        this.speedCutterOn = speedCutterOn;
    }

    public boolean isClimateControlOn() {
        return climateControlOn;
    }

    private void setClimateControlOn(boolean climateControlOn) {
        this.climateControlOn = climateControlOn;
    }

    public void workWithSpeedCutter(boolean onOrOff){
        if(isSpeedCutterOn()==onOrOff){
            System.out.println("The speed limiter is already in this state.");
        }
        else{
            if(!onOrOff){
                setSpeedCutterOn(false);
                System.out.println("Speed limiter in " + getBrand() + " removed!");
            }
            else {
                setSpeedCutterOn(true);
                System.out.println("Speed limiter in " + getBrand() + " included!");
            }
        }
    }

    public void workWithClimateControl(boolean onOrOff){
        if(isClimateControlOn()==onOrOff){
            System.out.println("The climate control is already in this state.");
        }
        else{
            if(!onOrOff){
                setClimateControlOn(false);
                System.out.println("Climate control in " + getBrand() + " off!");
            }
            else {
                setClimateControlOn(true);
                System.out.println("Climate control in " + getBrand() + " is on, have a nice trip!\n");
            }
        }
    }

    @Override
    public void drive() {
        System.out.printf("\n%s %s is driving.", getBrand(), getVersion());
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
    public void openTrunk() {
        System.out.println( getBrand() + "'s trunk opened.");
    }

        }