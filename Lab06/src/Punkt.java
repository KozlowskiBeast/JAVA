public class Punkt {
    public float x;
    public float y;

    public Punkt()
    {
        x = 0;
        y = 0;
    }

    public Punkt(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void zeruj(){
        this.x=0;
        this.y=0;
    }
    public void opis(){
        System.out.println("punkt znajduje się na współrzędnych: x= "+x+" y= "+y);
    }
    public void przesun(float px,float py){
        this.x=x+px;
        this.y=y+py;
    }
}
