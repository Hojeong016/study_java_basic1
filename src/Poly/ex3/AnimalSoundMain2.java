package Poly.ex3;

public class AnimalSoundMain2 {
    public static void main(String[] args) {

        Animal[] animals = {new Cat(), new Dog(), new Caw(),new Duck()};
        //

        for(Animal animalArr : animals){
            System.out.println("동물 울음 소리 테스트를 시작합니다.");
            animalArr.sound();
            System.out.println("동물 울음 소리 테스트를 종료합니다.");

            //새로운 동물이 추가 되었을 때 변하는 부분이 최소화 되는 코드

        }
        //위 에서 발견할 수 있는 2가지 문제
        //1,Animal 클래스를 생성할 수 있는 문제 : 개, 소, 오리와 같이 실제 존재하는 것이 아닌 다형성을 위헤 존재하는 클래스이다.
        // 하지만  Animal도 클래스이기 때문에 인스턴스를 생성하고 사용하는데 아무런 문제가 없다. 즉 작동은 하지만 제대로 된 기능을 수행하지 않는 인스턴스를 생성할 가능성이 존재하다는 것이다.

        //2 상속 받는 곳에서  sound()메서드 오버라이딩을 하지 않았을 경우
        // 부모의 sound()를 상속 받기 때문에 코드상으로는 아무런 문제가 발생하기 않지만 개발자와의 기대와 다른 값이 호출될 수 있다.

        //-- 추상 클래스와 추상 메서드로 위 문제를 해결 할 수 있다.
    }
}
