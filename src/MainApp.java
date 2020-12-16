import utils.StringUtiils;
import utils.WeekUtils;

public class MainApp {

    public static void main(String[] args) {

        String bartekTest = StringUtiils.getFirmattedText("BartekTest");
        System.out.println(bartekTest);

        String bartek = StringUtiils.getFirmattedText("Bartek");

        System.out.println(WeekUtils.Monday);
    }

}
