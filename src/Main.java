public class Main {
    public static void main(String[] args) {

        Auto auto1 = new Audi("A5","automatic","medium",250,
                (byte) 4,(byte) 4,(byte)30,83,2.14,4.7,
                true,false);

        Auto auto2 = new Tesla("Model X","automatic","medium",250,
                (byte) 4,(byte) 4,(byte)20,100,1.91,3.1,
                false);

        Auto[] autos = {auto1, auto2};

        System.out.println("Let the ride begin!");
        auto1.replenishStock((byte) 60);
        auto2.replenishStock((byte) 50);
        System.out.println(" ");

        auto1.drive();
        auto2.drive();
        System.out.println(" ");

        for (Auto auto : autos) {
            if(auto instanceof Audi audi){
                audi.workWithSpeedCutter(false);
                audi.workWithClimateControl(true);
            }
            else if(auto instanceof Tesla tesla){
                tesla.workWithAutopilot(true, "Odessa");
            }
        }
    }
}