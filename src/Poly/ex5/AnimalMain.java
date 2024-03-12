package Poly.ex5;

import javax.crypto.spec.PSource;

public class AnimalMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Caw caw = new Caw();
        Dog dog = new Dog();

        animalMove(cat);
        animalSound(cat);
    }

    private static void animalSound(Animal animal){
        System.out.println("동물 소리 테스트를 시작합니다.");
        animal.sound();
        System.out.println("동물 소리 테스트를 종료합니다.");
    }

    private  static void animalMove(Animal animal){
        System.out.println("동물이 움직입니다");
        animal.move();

    }
}
