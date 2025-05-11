public class Osoba {
    private String imie;
    private int wiek;
    private Adres adres;

    public Osoba(String imie,int wiek,Adres adres) {
        this.wiek = wiek;
        this.imie = imie;
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                ", adres=" + adres +
                '}';
    }
}