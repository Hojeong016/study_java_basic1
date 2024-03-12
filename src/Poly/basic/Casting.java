package Poly.basic;

public class Cast {
    public static void main(String[] args) {
        Parent poly = new Child();
        //poly.parentMethod();

        // 부모 클래스에 먼저 접근하게 됨 부모는 자식으로 내려갈 수 없음
        // 따라서 다운 캐스팅을 통해 poly의 참조값을 Child로 내리자

        Child child = (Child) poly;
        ((Child) poly).childMethod();

        //왜 여기에도 붙는 거야!!!!!!!!!!<,,
        //두 번 캐스팅을 하는 이유는
        // 첫 번째 캐스팅이 변수의 타입을 Child로 변경해주었지만,
        // 실제로는 런타임에서 해당 객체가 Child의 인스턴스임을 명시해주지 않기 때문입니다.
        // 따라서 메소드 호출 시에 다시 한 번 캐스팅을 통해 실제 객체의 메소드에 접근할 수 있도록 합니다.

    }
}
