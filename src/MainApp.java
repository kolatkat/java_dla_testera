import computer.Computer;
import computer.Laptop;
import computer.PC;


public class MainApp {

    public static void main(String[] args){

        Laptop laptop = new Laptop("XGames", "HP GAMES", 500, 256, 50);

        laptop.playMusic();
        laptop.pauseMusic();
        laptop.stopMusic();

        laptop.sayHelloMusic();

        laptop.playVideo();
        laptop.pauseVideo();
        laptop.stopVideo();

        laptop.sayHelloFromVideo();
    }
}
