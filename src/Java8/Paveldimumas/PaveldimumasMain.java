package Java8.Paveldimumas;

public class PaveldimumasMain {

    public static void main(String[] args) {
        Student studentas = new Student("Andrius", "Andriauskas", "3c");

        System.out.println(studentas);
        System.out.println("-------------------------------------");
        FifthGrader penktokas = new FifthGrader("Penktas", "Penktokas", true);
        System.out.println(penktokas);
        System.out.println("-------------------------------------");

        Human studentas2 = new Student("Antras", "Studentas", "6a");
        Human penktokas2 = new FifthGrader("Penktokelis", "Antras", false);

        Human[] masyvas = {studentas2, penktokas2, penktokas, studentas};
        Student[] studentai = {studentas, penktokas, (Student) studentas2};
        FifthGrader[] penktokai = {penktokas};
        System.out.println(studentas2);
        System.out.println(penktokas2);

        System.out.println(((Student) studentas2).getClassName());

        if (studentas2 instanceof Student) {
            System.out.println("studentas2 tikrai Studentas");
        }

        if (studentas2 instanceof FifthGrader) {
            System.out.println("studentas2 yra penktokas");
        } else {
            System.out.println("studentas2 nera penktokas");
        }

        if (penktokas2 instanceof Student) {
            System.out.println("penktokas2 yra Studentas");
        }

        if (penktokas2 instanceof FifthGrader) {
            System.out.println("penktokas2 yra FifthGrader");
        }
    }

//    public Product[] gautiProduktus() {
//    Product preke = new Plancete();
//    Product preke2 = new NesiojamasKompiuteris()
}
