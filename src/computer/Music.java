package computer;

public interface Music {

    // METODY - ZACHOWANIE

    //1. NIE MOZNA DODAWAĆ PÓL OBIEKTU
    //2. MOZNA TWORZYĆ TYLKO STAŁE - DOMYŚLNIE public static final

    String NAME = "MUSIC";

    //3. TYLKO METODY ABSTRAKCYJNE - DOMYŚLNIE public abstract

    void playMusic();
    void pauseMusic();
    void stopMusic();

    // OD JAVY 8

    //4. METODY DOMYSLNE - ZWYKŁE METODY
    default void sayHelloMusic() {
        System.out.println("Hello from default music");
    }

    //5. METODY STATYCZNE
    static String getName() {
        privateMethod();
        return NAME;
    }

    //6. PRYWATNE STATYCZNE METODY
    private static void privateMethod() {
        System.out.println("hello from private method");
    }

}
