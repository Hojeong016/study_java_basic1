package extends1.ex4;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        GasCar gasCar = new GasCar();
        HydrogenCar hydrogenCar = new HydrogenCar();
        electricCar.move();
        electricCar.change();
        electricCar.openDoor();
        hydrogenCar.fillHydrogen();
        hydrogenCar.move();
    }


}
