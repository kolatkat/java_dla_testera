package computer;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer)) return false;
        Computer computer = (Computer) o;
        return state == computer.state &&
                volumelevel == computer.volumelevel &&
                Objects.equals(name, computer.name) &&
                Objects.equals(type, computer.type) &&
                Objects.equals(hdd, computer.hdd) &&
                Objects.equals(ram, computer.ram);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", hdd=" + hdd +
                ", ram=" + ram +
                ", state=" + state +
                ", volumelevel=" + volumelevel +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, hdd, ram, state, volumelevel);
    }
}
