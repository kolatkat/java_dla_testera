import computer.Computer;
import computer.Laptop;
import computer.PC;

import javax.management.MBeanAttributeInfo;
import javax.xml.namespace.QName;

public class MainApp {

    public static void main(String[] args){

        Computer officeComputer = new PC("Office compuetr", "HP", 500, 128);
        Computer gamingLaptop = new Laptop("XGames", "HP GAMES", 500, 256, 50);

        System.out.println(officeComputer.volumeUp(50));
        System.out.println(officeComputer.volumeUp(40));
        System.out.println(officeComputer.volumeUp(40));

        System.out.println(officeComputer.volumeDown());
        System.out.println(officeComputer.volumeDown(50));
        System.out.println(officeComputer.volumeDown(100));

        System.out.println(gamingLaptop.volumeUp());
        System.out.println(gamingLaptop.volumeUp(-80));
        System.out.println(gamingLaptop.volumeUp(80));

        System.out.println(gamingLaptop.volumeDown(55));
        System.out.println(gamingLaptop.volumeDown(45));
        System.out.println(gamingLaptop.volumeDown());

        /*gamingLaptop.setBatteryLevel(0);

        officeComputer.switchOn();
        System.out.println(officeComputer.getState());

        officeComputer.setPowerSupply(true);
        officeComputer.switchOn();
        System.out.println(officeComputer.getState());

        gamingLaptop.switchOn();
        System.out.println(gamingLaptop.getState());*/

    }
}
