package Poly.ex5;

import javax.crypto.spec.PSource;

public class Caw implements Animal{
    @Override
    public void sound() {
        System.out.println("음메");
    }

    @Override
    public void move() {
        System.out.println("소가 움직입니다.");
    }
}
