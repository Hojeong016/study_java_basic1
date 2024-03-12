package Poly.car1;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver();

        //차량 선택
        K3Car k3Car = new K3Car();
        driver.set(k3Car);
        driver.drive();

    }
}
