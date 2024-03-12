package Poly.overriding;

public class Main {
    public static void main(String[] args) {

        //자식변수가 자식 인스턴스 참조
        Child child1= new Child();
        System.out.println("child->child");
        System.out.println("value : " + child1.value);
        child1.method();

        //부모 변수가 부모 인스턴스 참조
        Parent parent1=new Parent();
        System.out.println("parent->parent");
        System.out.println("value : " + parent1.value);
        parent1.method();

        //다형적 참조 (다운캐스팅)
        Parent poly = new Child();
        System.out.println("parent->child");
        System.out.println("value :"+poly.value); // 변수는 오버라이딩이 안된다. 출력 :parent
        poly.method(); //메서드는 오버라이딩이 된다. 출력 : child.method


        //  ((Child)poly).method();
    }
}
