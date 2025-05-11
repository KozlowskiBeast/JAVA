public class Kwadrat extends Prostokat{
    public Kwadrat(double wys, double szer) {
        super(wys, szer);
    }

    public Kwadrat(String kolor, double wys, double szer) {
        super(kolor, wys, szer);
    }
    public double getwys(){
        return wys;
    }
    public double getszer(){
        return szer;
    }
    public void setwys(){
        this.wys=wys;
    }
    public void setszer(){
        this.szer=szer;
    }

    @Override
    String opis() {
        return "Klasa kwadrat "+super.opis()+" bok: "+wys;
    }
}