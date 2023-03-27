public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefullness;
    private int powerHunger;

    public Slytherin(String name, String surname, int witchcraftPower, int transgression, int cunning, int determination, int ambition, int resourcefullness, int powerHunger) {
        super(name, surname, witchcraftPower, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefullness = resourcefullness;
        this.powerHunger = powerHunger;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + ": " +
                "Хогвартс{" +
                "мощность колдовства=" + getWitchcraftPower() +
                ", трансгрессия=" + getTransgression() + '}' +
                ", Слизерин{" +
                "хитрость=" + cunning +
                ", решительность=" + determination +
                ", амбициозность=" + ambition +
                ", находчивость=" + resourcefullness +
                ", жажда власти=" + powerHunger +
                '}';
    }

    public void compareSlytherin(Slytherin student) {
        int sum1 = this.ambition + this.cunning + this.determination + this.powerHunger + this.resourcefullness;
        int sum2 = student.ambition + student.cunning + student.determination + student.powerHunger + student.resourcefullness;
        System.out.println(sum1 > sum2 ?
                this.getName() + " лучший Слизеринец, чем " + student.getName()
                : student.getName() + " лучший Слизеринец, чем " + this.getName());
    }
}
