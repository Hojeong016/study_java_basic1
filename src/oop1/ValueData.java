package oop1;
//절차 지향 코드--> 객체 지향 코드
//클래스와 메서드 : 클래스에서는 멤버변수(속성), 메서드 (기능)을 모두 정의 할 수 있다.

public class ValueData {
    int value;

     void add(){ //객체는 자신의 메서드를 통해 멤버변수로 이동한다,
        value++;
        System.out.println("최종 value :" + value);
    }
}
