package Poly.ex4;

public class AnimalSoundMain3 {
    public static void main(String[] args) {
        //AbstractAnimal animal = new AbstractAnimal(); 인스턴스 생성 불가

        AbstractAnimal[] animal = {new Cat1(), new Caw1(), new Dog1()};

        for(AbstractAnimal animals : animal){
            soundMethod(animals);
            moveMethod(animals);
        }
    }
        private static void soundMethod(AbstractAnimal animal){
            System.out.println("동물 소리 테스트를 시작합니다.");
            animal.sound();
            System.out.println("동물 소리 테스트를 종료합니다.");
        }

        private static void moveMethod(AbstractAnimal animal){
            System.out.println("동물이 움직입니다.");
            animal.move();
        }
}

