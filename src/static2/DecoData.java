package static2;

public class DecoData {

    private int instanceValue; //인스턴스 변수 // 메서드 속에 객체를 생성 후 참조값을 받아 사용가능?
    private static int staticValue; //정적 변수, 클래스 변수

    //같은 클래스 속 변수, 메서드 호출
    public static void staticCall(){
        //static메서드는 static만 사용 가능하다.

       // instanceValue++; // 인스턴스 변수 접근 불가 왜 ? 참조값도 모르고 아무것도 몰라서? // 메서드 속에 객체를 생성 후 참조값을 받아 사용가능?

       // DecoData instance1 = new DecoData();
        //instance1.instanceValue=0;//

       // instanceMethod(); //인스턴스 메서드 접근 불가

        staticValue++; // 호출 가능
        staticMethod(); //호출 가능
    }

    public void instanceCall(){
        instanceValue++; //인스턴스 변수 접근 가능
        instanceMethod(); //인스턴스 메서드 접근 가능

        staticValue++; // 호출 가능
        staticMethod(); //호출 가능

        //정적 메서드,  변수는 반대로 모든 곳에서 호출할 수 있다.
    }

    public void instanceMethod(){

        System.out.println("instanceValue ="+instanceValue);
    }

    public static void staticMethod(){
        System.out.println("staticValue ="+ staticValue);
    }
}
