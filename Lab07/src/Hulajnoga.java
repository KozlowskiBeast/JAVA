public class Hulajnoga extends Pojazd {
    public Hulajnoga(String nazwa, String id) {
        super(nazwa, id);
    }

    @Override
    public double obliczKoszt(int h) {
        return 6 * h;
    }
}
