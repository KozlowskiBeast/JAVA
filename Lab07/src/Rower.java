public class Rower extends Pojazd {
    public Rower(String nazwa, String id) {
        super(nazwa, id);
    }

    @Override
    public double obliczKoszt(int h) {
        return 5 * h;
    }
}
