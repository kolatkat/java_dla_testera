package computer;

public class Laptop extends Computer implements Music, Video {

    private int batteryLevel;

    public Laptop(String name, String type, int hdd, int ram, int batteryLevel) {
        super(name, type, hdd, ram);
        this.batteryLevel = batteryLevel;

    }

    public int volumeUp() {
        return volumelevel += 5;
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
        volumelevel -= 2;
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
        System.out.println("Checking battery level");
        if (batteryLevel > 0) {
            super.switchOn();
        } else {
            System.out.println("Battery level to low!");
        }

    }

    public void setBatteryLevel(int i) {
        batteryLevel = i;
    }

    @Override
    public void playMusic() {
        System.out.println("PLAY MUSIC");
    }

    @Override
    public void pauseMusic() {
        System.out.println("PAUSE MUSIC");

    }

    @Override
    public void stopMusic() {
        System.out.println("STOP MUSIC");
    }


    @Override
    public void playVideo() {
        System.out.println("PLAY VIDEO");
    }

    @Override
    public void pauseVideo() {
        System.out.println("PAUSE VIDEO");
    }

    @Override
    public void stopVideo() {
        System.out.println("STOP VIDEO");
    }
}
