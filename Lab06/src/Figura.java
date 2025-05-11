class Figura {

    //pola metody i kontruktory
    Punkt punkt;
    String kolor = "bialy";


    Figura(){
        punkt = new Punkt();
    }
    Figura(String kolor){
        this.kolor=kolor;
    }
    Figura(Punkt punkt){
        this.punkt=punkt;
    }
    String getKolor(){
        return kolor;
    }
    String opis(){
        return "Klasa Figura. Kolor obiektu: "+kolor;
    }


}