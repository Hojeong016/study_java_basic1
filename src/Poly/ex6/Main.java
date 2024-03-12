package Poly.ex6;

import Poly.Diamond.Chlid;
import Poly.ex5.Animal;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Chicken chicken = new Chicken();
        Bird bird = new Bird();

        animalSound(dog);
        animalMove(bird);
        fly(chicken);
        //fly(dog);
    }
    private static void animalSound(AdstractAnimal animal){
        System.out.println("동물 소리 테스트를 시작합니다.");
        animal.sound();
        System.out.println("동물 소리 테스트를 종료합니다.");
    }

    private  static void animalMove(AdstractAnimal animal){
        animal.move();
    }

    private  static void fly(fly animal){
        System.out.println("날기 테스트 시작");
        animal.fly();
        System.out.println("날기 테스트 종료");
    }
}

