package Poly.ex6;

public class Bird extends AdstractAnimal implements fly{
    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("새가 하늘을 날고 있습니다.");
    }
}
