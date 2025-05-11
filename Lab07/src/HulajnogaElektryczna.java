public class HulajnogaElektryczna extends Pojazd implements Elektryczny {
    int poziom_baterii;

    public HulajnogaElektryczna(String nazwa, String id, int poziom_baterii) {
        super(nazwa, id);
        this.poziom_baterii = poziom_baterii;
    }

    @Override
    public double obliczKoszt(int h) {
        return 10 * h;
    }

    @Override
    public void laduj() {
        poziom_baterii = 100;
    }

    @Override
    public int poziom_baterii() {
        return poziom_baterii;
    }
}
