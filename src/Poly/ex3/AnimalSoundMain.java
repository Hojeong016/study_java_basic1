package Poly.ex3;

public class AnimalSoundMain {
    public static void main(String[] args) {

        Animal cat = new Cat();
        Animal caw = new Caw();
        Animal dog = new Dog();

        animalSound(cat);
        animalSound(dog);
        animalSound(caw);
    }

    private static void animalSound(Animal animal){ // cat caw dog 모두  animal을 상속 받았기 때문에 부모에는 자식을 담을 수 있다 메서드를 사용할 수 있게 되었다.
        System.out.println("동물소리 테스트를 시작합니다.");
        animal.sound();
        System.out.println("동물소리 테스트를 종료합니다.");

    }
}
