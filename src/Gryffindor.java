public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;


    public Gryffindor(String name, String surname, int witchcraftPower, int transgression, int nobility, int honor, int bravery) {
        super(name, surname, witchcraftPower, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + ": " +
                "Хогвартс{" +
                "мощность колдовства=" + getWitchcraftPower() +
                ", трансгрессия=" + getTransgression() + '}' +
                ", Гриффиндор{" +
                "благородство=" + nobility +
                ", честь=" + honor +
                ", храбрость=" + bravery +
                '}';
    }

    public void compareGryffindor(Gryffindor student) {
        int sum1 = this.bravery + this.honor + this.nobility;
        int sum2 = student.bravery + student.honor + student.nobility;
        System.out.println(sum1 > sum2 ?
                this.getName() + " лучший Гриффиндорец, чем " + student.getName()
                : student.getName() + " лучший Гриффиндорец, чем " + this.getName());
    }
}
