package computer;

public class PC extends Computer {

    private boolean isTurnOn;

    public PC(String name, String type, int hdd, int ram, boolean isTurnOn) {
        super(name, type, hdd, ram);
        this.isTurnOn = isTurnOn;
    }

    @Override
    public void switchOn() {
        System.out.println("Checking power supply");
        if (isTurnOn == true) {
            super.switchOn();
        } else {
            System.out.println("Komputer wyłączony");
        }
    }

    public void setIsTurnOn( boolean isTurn) {
        isTurnOn = isTurn;
    }
}
