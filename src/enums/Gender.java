package enums;

public enum Gender {

    FEMALE("K"),
    MALE("M");

    private String name;

    Gender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
