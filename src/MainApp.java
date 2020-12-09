import computer.Laptop;
import computer.PC;

import javax.management.MBeanAttributeInfo;
import javax.xml.namespace.QName;

public class MainApp {

    public static void main(String[] args){

        PC officeComputer = new PC("Office compuetr", "HP", 500, 128, false );
        Laptop gamingLaptop = new Laptop("XGames", "HP GAMES", 500, 256, 50);

        gamingLaptop.setBatteryLevel(0);

        officeComputer.switchOn();
        System.out.println(officeComputer.getState());

        gamingLaptop.switchOn();
        System.out.println(gamingLaptop.getState());

    }
}
