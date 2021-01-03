package computer;

abstract public class Computer {

    protected String name;
    protected String type;
    protected Hdd hdd;
    protected Ram ram;
    protected boolean state;
    protected int volumelevel;

    public Computer(String name, String type, Hdd hdd, Ram ram) {
        this.name = name;
        this.type = type;
        this.hdd = hdd;
        this.ram = ram;
        this.state = false;
        this.volumelevel = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public String getType() {
        return type;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public Ram getRam() {
        return ram;
    }

    public void switchOn() {
        System.out.println("SUPER - ustawiam pole state na true");
        state = true;
    }

    public void switchOff(){
        state = false;
    }

    public boolean getState() {
        return state;
    }

    public abstract int volumeUp();

    public abstract int volumeUp(int i);

    public abstract int volumeDown();

    public abstract int volumeDown(int i);
}
