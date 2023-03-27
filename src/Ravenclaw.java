public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wittiness;
    private int creativity;

    public Ravenclaw(String name, String surname, int witchcraftPower, int transgression, int intelligence, int wisdom, int wittiness, int creativity) {
        super(name, surname, witchcraftPower, transgression);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wittiness = wittiness;
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + ": " +
                "Хогвартс{" +
                "мощность колдовства=" + getWitchcraftPower() +
                ", трансгрессия=" + getTransgression() + '}' +
                ", Когтевран{" +
                "ум=" + intelligence +
                ", мудрость=" + wisdom +
                ", остроумие=" + wittiness +
                ", креативность=" + creativity +
                '}';
    }

    public void compareRavenclaw(Ravenclaw student) {
        int sum1 = this.creativity + this.wisdom + this.wittiness + this.intelligence;
        int sum2 = student.creativity + student.wisdom + student.wittiness + student.intelligence;
        System.out.println(sum1 > sum2 ?
                this.getName() + " лучший Когтевранец, чем " + student.getName()
                : student.getName() + " лучший Когтевранец, чем " + this.getName());
    }
}
