public class Hufflepuff extends Hogwarts {
    private int industry;
    private int fidelity;
    private int honesty;

    public Hufflepuff(String name, String surname, int witchcraftPower, int transgression, int industry, int fidelity, int honesty) {
        super(name, surname, witchcraftPower, transgression);
        this.industry = industry;
        this.fidelity = fidelity;
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + ": " +
                "Хогвартс{" +
                "мощность колдовства=" + getWitchcraftPower() +
                ", трансгрессия=" + getTransgression() + '}' +
                ", Пуффендуй{" +
                "трудолюбие=" + industry +
                ", верность=" + fidelity +
                ", честность=" + honesty +
                '}';
    }

    public void compareHufflepuff(Hufflepuff student) {
        int sum1 = this.fidelity + this.honesty + this.industry;
        int sum2 = student.fidelity + student.honesty + student.industry;
        System.out.println(sum1 > sum2 ?
                this.getName() + " лучший Пуффендуец, чем " + student.getName()
                : student.getName() + " лучший Пуффендуец, чем " + this.getName());
    }
}
