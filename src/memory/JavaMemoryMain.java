package memory;

public class JavaMemoryMain {

    public static void main(String[] args) {
        System.out.println("main start"); //----1
        method1(10);
        System.out.println("main end");//----6
    }

    static void method1(int m1){
        System.out.println("method1 start");//----2
        int cal = m1 * 2;
        method2(cal);
        System.out.println("method1 end");//----5
    }

    static  void method2(int m2){
        System.out.println("method2 start");//----3
        System.out.println("method2 end");//----4
    }
// 스택 구조
/* 스택 영역에 메인메서드가 쌓인다.
1번이 실행되고 메서드 1을 메인 메서드 위에 호출한다. 인수10일 메서드 1에 매개변수로 넣어 메서드 1이 실행된다. 2가 출력된다.
변수 계산이 실행된다. 나온 cal값을 메서드 2를 호출하여  인수로 넣어 메서드 2의 매개변수로 넣는다. 3번이 실행된다. 4번이 실해되고 메서드가 끝나면
스택영역에서 에서드2가 나간다. 그 다음 쌓여있던 메서드 1에서 실행됮 ㅣ낳았던 5번이 실행되고 스택영역을 나간다. 메인이 제거되면서 스택프레임도 완전히 비웠다 그럼
자바는 프로그램을 정리하고 종료한다.
 */
}
