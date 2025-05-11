public class Student {
    private String imie, nazwisko, nazwaSpecjalnosci;
    private int nr_indeksu, rokStudiow;

    public Student(String imie, String nazwisko, String nazwaSpecjalnosci, int nr_indeksu, int rokStudiow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nazwaSpecjalnosci = nazwaSpecjalnosci;
        this.nr_indeksu = nr_indeksu;
        this.rokStudiow = rokStudiow;
    }


    public Student(String imie, String nazwisko, String nazwaSpecjalnosci, int nr_indeksu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nazwaSpecjalnosci = nazwaSpecjalnosci;
        this.nr_indeksu = nr_indeksu;
    }

    public Student(String nazwaSpecjalnosci, String nazwisko, String imie) {
        this.nazwaSpecjalnosci = nazwaSpecjalnosci;
        this.nazwisko = nazwisko;
        this.imie = imie;
    }

    public Student(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void pokazDane(){
        System.out.println(this.imie + " " + this.nazwisko + ", " + this.nr_indeksu + ", " + this.nazwaSpecjalnosci +  ", rok: " +  this.rokStudiow);
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getNazwaSpecjalnosci() {
        return nazwaSpecjalnosci;
    }

    public void setNazwaSpecjalnosci(String nazwaSpecjalnosci) {
        this.nazwaSpecjalnosci = nazwaSpecjalnosci;
    }

    public int getNr_indeksu() {
        return nr_indeksu;
    }

    public void setNr_indeksu(int nr_indeksu) {
        this.nr_indeksu = nr_indeksu;
    }

    public int getRokStudiow() {
        return rokStudiow;
    }

    public void setRokStudiow(int rokStudiow) {
        this.rokStudiow = rokStudiow;
    }
}