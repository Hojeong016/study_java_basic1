package ref;

import java.sql.SQLOutput;

public class InitMain {
    public static void main(String[] args) {
        InitData a = new InitData();

        System.out.println("초기값 지정 : " + a.value1); // 10
        System.out.println("조기값 지정 안함 : "+ a.value2); // 0 이유 클래스 안에 선언되는 멤버 변수인 인스턴스 변수의 경우 자동으로 초기값이 지정된다.

        /*int c;
        int c2 =10;

        System.out.println("초기값 지정 :  " +c); // 10
        System.out.println("조기값 지정 안함 : "+c2); // 0 이유 클래스 안에 선언되는 멤버 변수인 인스턴스 변수의 경우 자동으로 초기값이 지정된다.*/

    }
}
