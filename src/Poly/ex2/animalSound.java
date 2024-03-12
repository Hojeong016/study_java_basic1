package Poly.ex2;

public class animalSound {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Caw caw = new Caw();
        Caw caw1 = new Caw();

        System.out.println("동물 소리 테스트 시작");
        cat.catSound();
        System.out.println("동물 소리 테스트 시작");

        System.out.println("동물 소리 테스트 시작");
        dog.dogSound();
        System.out.println("동물 소리 테스트 시작");

        /*System.out.println("동물 소리 테스트 시작");
        caw.cawSound();
        System.out.println("동물 소리 테스트 시작");*/

        //중복 코드, 새로운 동물을 추가하고 싶을 때 또 하나의 클래스를 만들어야한다는 문데 이러한 문제
        //중복된 코드를 해결하기 위한 문제는 for문이나 메서드를 활용하여 해결할 수 있을 수도 있다

        cawSound(caw);
        cawSound(caw1);
        //하지만 cat을 널으면 타입이 다르기 때문에 컴파일 오류가 생긴다. cat의 메서드를 만들면 되지만 우리가 원래 목표했던
        // 새로운 동물을 추가할 때마다 늘어나는 코드를 줄이는 것을 해결하는 것을 아니다

        // for문 사용해보기
        Caw[] caws = {caw,caw1};
        // for문도 마찬가지로 타입이 다른 cat dog를 넣을 순 없다.

        // 즉 메서드, for문제서 우리가 가지는 문제의 핵심은 같은 타입의 인수, 타입 클래스 만 적용할 수 있다는 것이니
        //다형적 참조와 메서드 오버라이딩을 통해 이를 해결해 볼 수 있다.
    }

    private static void cawSound(Caw caw){
        System.out.println("동물 소리 테스트 시작");
        caw.cawSound();
        System.out.println("동물 소리 테스트 시작");
    }
}
