package computer;

public class PC extends Computer {

    private boolean isTurnOn;

    public PC(String name, String type, int hdd, int ram) {
        super(name, type, hdd, ram);
        isTurnOn = false;
    }

    public void setPowerSupply(boolean powerSupply) {
        isTurnOn = powerSupply;
    }

    public void showComputerName() {
        System.out.println(name);
    }

    public int volumeUp(){
        return volumelevel +=1 ;
    }

    @Override
    public int volumeUp(int newVolumeLevel) {
        if(newVolumeLevel > 0) {
            if ((volumelevel + newVolumeLevel) <= 100) {
                return volumelevel +=newVolumeLevel;
            } else {
                return volumelevel = 100;
            }
        } else {
            System.out.println("Należy wprowadzić liczbę całkowitą dodatnią");
            return volumelevel;
        }
    }

    @Override
    public int volumeDown() {
        volumelevel -= 1;
        if(volumelevel <= 0) {
            return  0;
        } else {
            return volumelevel;
        }
    }

    @Override
    public int volumeDown(int newVolumeLevel) {
        if (newVolumeLevel > 0) {
            if ((volumelevel - newVolumeLevel) > 0) {
                return volumelevel -= newVolumeLevel;
            } else {
                return volumelevel = 0;
            }
        } else {
             System.out.println("Należy wprowadzić liczbę całkowitą dodatnią");
             return volumelevel;
        }
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
}
