package extends1.ex1;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        GasCar gasCar = new GasCar();

        electricCar.move();
        electricCar.change();
        gasCar.move();
        gasCar.fillUp();
    }
}
