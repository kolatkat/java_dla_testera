package enums;

public enum Weekdays {

    PONIEDZIALEK("Poniedziałek"),
    WTOREK("Wtorek"),
    SRODA("Sroda"),
    CZWARTEK("Czwartek"),
    PIATEK("Piątek"),
    SOBOTA("Sobota"),
    NIEDZIELA("Niedziela");

    private String name;

    Weekdays(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
