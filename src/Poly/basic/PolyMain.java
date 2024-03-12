package Poly.basic;

public class PolyMain {
    public static void main(String[] args) {

        //부모가 부모 참조
        System.out.println("parent->parent");
        Parent parent = new Parent();
        parent.parentMethod();

        //자식 변수가 자식 인스턴스 참조
        System.out.println("child -> child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        //부모변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("parent -> child");
        Parent poly = new Child();
        poly.parentMethod();
        //부모는 자식을 담을 수 있다.
        //자식의 기능은 호출할 수 없다.. 왜 ,,,?
        //poly.childMethod(); // 난 호출이 가능하다고 생각을 했는걸,,,
        //<다운캐스팅 poly의 타입이 Chlid로 바뀌는 것은 아니며 그저 참조값이  Child타입으로 가는 것이다>


        System.out.println("Child -> Parent");
       // Child child1 = new Parent();// 컴파일 오류 . 자식은 부모를 담을 수 없다,
    }
}
