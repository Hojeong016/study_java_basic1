package ref;

public class MethodChange1 {
//메소드 호출시 사용되는 매개변수 또한 변수의 값을 복사하여 대입한다.
    public static void main(String[] args) {

        //기본형과 메소드 호출
        int a = 10;

        System.out.println("메서드 호출 전 :" + a); // 결과 :10
        changePrimitive(a);
        System.out.println("메서드 호출 후 :" + a); // 결과 :10
        //왜 10인가...
    }

    public static void  changePrimitive(int x){
        x=20;
    }
}
