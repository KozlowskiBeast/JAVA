public class Student extends Osoba {
    String nrAlbumu;
    String kierunek;
    int rokStudiow;

    public Student(String imie, int wiek,Adres adres, String nrAlbumu, int rokStudiow, String kierunek) {
        super(imie, wiek,adres);
        this.nrAlbumu = nrAlbumu;
        this.rokStudiow = rokStudiow;
        this.kierunek = kierunek;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nStudent{" +
                "nrAlbumu='" + nrAlbumu + '\'' +
                ", kierunek='" + kierunek + '\'' +
                ", rokStudiow=" + rokStudiow +
                '}';
    }
}