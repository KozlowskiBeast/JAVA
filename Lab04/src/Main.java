public class Main {
    public static void main(String[] args) {
        Osoba janKowalski = new Osoba("Jan", "Kowalski", 34);
        Osoba cezaryPuzura = new Osoba("Cezary", "Pazura", 51);
        Osoba donaldTrump = new Osoba("Donald", "Trump", 80);
        janKowalski.pokazDane();
        cezaryPuzura.pokazDane();
        donaldTrump.pokazDane();

        Student student1 = new Student("Kamil", "Nowak", "Informatyka", 123456, 2);
        Student student2 = new Student("Artur", "Kamiński", "Matematyka", 112379, 3);
        Student student3 = new Student("Ala", "Kot", "Ekonomia", 127590, 2);
        Student student4 = new Student("Jon", "Arbuckle", "Informatyka i Ekonometria", 112042, 4);
        student1.pokazDane();
        student2.pokazDane();
        student3.pokazDane();
        student4.pokazDane();
    }
}