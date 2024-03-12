package Poly.ex6;

public class Chicken extends AdstractAnimal implements fly{
    @Override
    public void sound() {
        System.out.println("꼬끼오");
    }

    @Override
    public void fly() {
        System.out.println("닭이 하늘을 날고 있습니다.");
    }
}
