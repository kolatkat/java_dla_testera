package computer;

public class PC extends Computer {

    private boolean isTurnOn;

    public PC(String name, String type, int hdd, int ram) {
        super(name, type, hdd, ram);
        isTurnOn = false;
    }

    @Override
    public void switchOn() {
        System.out.println("Checking power supply");
        if (isTurnOn) {
            super.switchOn();
        } else {
            System.out.println("Power supply missing!");
        }
    }

    public void setIsTurnOn( boolean isTurn) {
        isTurnOn = isTurn;
    }
}
