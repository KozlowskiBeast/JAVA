public class Main {
    public static void main(String[] args) {
        Wypozyczalnia w = new Wypozyczalnia();

        Rower r1 = new Rower("Rower Gorski", "R1");
        Hulajnoga h1 = new Hulajnoga("Hulajnoga Miejska", "H1");
        HulajnogaElektryczna he1 = new HulajnogaElektryczna("Hulajnoga Elektryczna", "HE1", 80);

        w.dodajPojazd(r1);
        w.dodajPojazd(h1);
        w.dodajPojazd(he1);

        System.out.println("Koszt wypozyczenia roweru na 2h: " + r1.obliczKoszt(2));
        System.out.println("Koszt wypozyczenia hulajnogi na 2h: " + h1.obliczKoszt(2));
        System.out.println("Koszt wypozyczenia hulajnogi elektrycznej na 2h: " + he1.obliczKoszt(2));
    }
}
