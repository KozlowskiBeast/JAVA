public class Engine {
    private  int power;
    private String fuelType;
    public void startEngine(){
        System.out.println("Silnik uruchomiony");
    }

    public Engine(int power, String fuelType) {
        this.power = power;
        this.fuelType = fuelType;
    }

    public void displayInfo(){
        System.out.println("Silnik o mocy: "+power+"KM, paliwo: "+ fuelType);
    }

    public int getPower() {
        return power;
    }

    public String getFuelType() {
        return fuelType;
    }
}