public class Hogwarts {
    private String name;
    private String surname;
    private int witchcraftPower;
    private int transgression;

    public Hogwarts(String name, String surname, int witchcraftPower, int transgression) {
        this.name = name;
        this.surname = surname;
        this.witchcraftPower = witchcraftPower;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getWitchcraftPower() {
        return witchcraftPower;
    }

    public int getTransgression() {
        return transgression;
    }
}
