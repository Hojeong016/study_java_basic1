package Poly.basic;

public class Casting {
    public static void main(String[] args) {
        Parent poly = new Child();
        //poly.parentMethod();

        // 부모 클래스에 먼저 접근하게 됨 부모는 자식으로 내려갈 수 없음
        // 따라서 다운 캐스팅을 통해 poly의 참조값을 Child로 내리자

        Child child = (Child) poly;
        //child 변수에 poly를 담았다..
        child.childMethod();
    }
}
