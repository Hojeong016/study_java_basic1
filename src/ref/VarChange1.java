package ref;

public class VarChange1 {
    public static void main(String[] args) {
        //대입 : 자바는 항상 변수의 값을 복사하여 대입한다.

        //기본형의 대입
        int a = 10;
        int b = a;
        System.out.println("a= "+ a); //10
        System.out.println("b= "+ b); //10

        //a 변경
        a = 20;
        System.out.println("변경 a = 20");
        System.out.println("a= "+ a); //20
        System.out.println("b= "+ b); //20 틀림 + 이유 : a의 값만 변경한 것 그림으로 보기
        // 서로 다른 것


        //b 변경
        b = 30;
        System.out.println("변경 b = 30");
        System.out.println("a= "+ a); //20
        System.out.println("b= "+ b); //30
    }
}
