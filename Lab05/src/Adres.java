public class Adres {
    String miasto;
    String ulica;
    String numer;
    String kodpocztowy;

    public String getMiasto(){return miasto;}
    public String getUlica(){return ulica;}
    public String getNumer(){return numer;}
    public String getKodpocztowy(){return kodpocztowy;}

    public Adres(String miasto, String ulica, String numer, String kod) {
        this.miasto = miasto;
        this.ulica = ulica;
        this.numer = numer;
        this.kodpocztowy = kod;
    }

    @Override
    public String toString() {
        return "Adres{" +
                "miasto='" + miasto + '\'' +
                ", ulica='" + ulica + '\'' +
                ", numer='" + numer + '\'' +
                ", kodpocztowy='" + kodpocztowy + '\'' +
                '}';
    }
}