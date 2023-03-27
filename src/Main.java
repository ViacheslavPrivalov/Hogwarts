public class Main {
    public static int getNumber() {
        return (int) (Math.random() * 100);
    }

    public static String studentDescription(Hogwarts student) {
        return student.toString();
    }

    public static void studentsCompare(Hogwarts student1, Hogwarts student2) {
        int sum1 = student1.getWitchcraftPower() + student1.getTransgression();
        int sum2 = student2.getWitchcraftPower() + student2.getTransgression();
        System.out.println((sum1 > sum2) ?
                (student1.getName() + " " + student1.getSurname() +
                " обладает бОльшей мощностью магии, чем " + student2.getName() + " " + student2.getSurname())
                : (student2.getName() + " " + student2.getSurname() +
                " обладает бОльшей мощностью магии, чем " + student1.getName() + " " + student1.getSurname()));
    }

    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Гарри", "Поттер", getNumber(), getNumber(), getNumber(), getNumber(), getNumber());
        Gryffindor hermioneGranger = new Gryffindor("Гермиона", "Грейнджер", getNumber(), getNumber(), getNumber(), getNumber(), getNumber());
        Gryffindor ronWeasley = new Gryffindor("Рон", "Уизли", getNumber(), getNumber(), getNumber(), getNumber(), getNumber());
        Slytherin drakoMalfoy = new Slytherin("Драко", "Малфой", getNumber(), getNumber(), getNumber(), getNumber(), getNumber(), getNumber(), getNumber());
        Slytherin grahamMontague = new Slytherin("Грехем", "Монтегю", getNumber(), getNumber(), getNumber(), getNumber(), getNumber(), getNumber(), getNumber());
        Slytherin gregoryGoyle = new Slytherin("Грегори", "Гойл", getNumber(), getNumber(), getNumber(), getNumber(), getNumber(), getNumber(), getNumber());
        Hufflepuff zachariasSmith = new Hufflepuff("Закария", "Смит", getNumber(), getNumber(), getNumber(), getNumber(), getNumber());
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик", "Диггори", getNumber(), getNumber(), getNumber(), getNumber(), getNumber());
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин", "Финч-Флетчли", getNumber(), getNumber(), getNumber(), getNumber(), getNumber());
        Ravenclaw choChang = new Ravenclaw("Чжоу", "Чанг", getNumber(), getNumber(), getNumber(), getNumber(), getNumber(), getNumber());
        Ravenclaw padmaPatil = new Ravenclaw("Падма", "Патил", getNumber(), getNumber(), getNumber(), getNumber(), getNumber(), getNumber());
        Ravenclaw marcusBelby = new Ravenclaw("Маркус", "Белби", getNumber(), getNumber(), getNumber(), getNumber(), getNumber(), getNumber());
        System.out.println(studentDescription(harryPotter));
        harryPotter.compareGryffindor(hermioneGranger);
        drakoMalfoy.compareSlytherin(grahamMontague);
        zachariasSmith.compareHufflepuff(cedricDiggory);
        choChang.compareRavenclaw(padmaPatil);
        studentsCompare(harryPotter, drakoMalfoy);

    }
}