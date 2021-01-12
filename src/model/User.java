package model;

public class User implements Comparable<User> {

    private String firstName;
    private String lastName;
    private String email;
    private int age;

    public User(String firstName, String lastName, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    //nadpisujemy metodę compareTo z interfejsu Comparable<object>, gdzie object to obiekt, który porównujemy
    @Override
    public int compareTo(User user) {
        int compareResult  = this.getFirstName().compareTo(user.getFirstName());
        if (compareResult == 0) {
            compareResult = this.getLastName().compareTo(user.getLastName());
        }
        return compareResult;
    }
}
