public abstract class Pojazd {
    String nazwa;
    boolean wypo;
    String id;

    public Pojazd(String nazwa, String id) {
        this.nazwa = nazwa;
        this.id = id;
        this.wypo = false;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setWypo(boolean wypo) {
        this.wypo = wypo;
    }

    public boolean isWypo() {
        return wypo;
    }

    public void wypozycz() {
        this.wypo = true;
    }

    public void zwroc() {
        this.wypo = false;
    }

    public abstract double obliczKoszt(int h);

    public String getId() {
        return id;
    }
}
