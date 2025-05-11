class Okrag extends Figura{
    Punkt środek;
    double promień;

    public double getPowierzchnia(){
        return 3.14*promień*promień;
    }
    public double getSrednica(){
        return 2*promień;
    }

    public void setPromień(double p) {
        promień = p;
    }

    public double getPromień() {
        return promień;
    }
    public boolean wSrodku(Punkt punkt){
        return Math.pow(środek.getX()-punkt.getX(),2)+Math.pow(środek.getY()-punkt.getY(),2)<=Math.pow(promień,2);
    }

    public Okrag() {
        środek = new Punkt(0,0);
        promień = 0;
    }

    public Okrag(Punkt środek, double promień) {
        this.środek = środek;
        this.promień = promień;
    }

    @Override
    String opis() {
        return "Klasa Okrag "+ super.opis()+ " Środek: x= "+środek.x +" y= " +środek.y +" Promień: "+promień;
    }
}