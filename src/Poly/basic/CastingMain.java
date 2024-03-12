package Poly.basic;

public class CastingMain {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child = (Child) parent1;
        child.childMethod();
        //((Child)parent1).childMethod();

        Parent parent2 = new Parent();
        Child child1 = (Child)parent2; // 런타임 오류 : ClassCastException
        child1.childMethod(); // 호출 실패
    }
}
