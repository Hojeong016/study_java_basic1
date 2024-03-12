package Poly.ex7;

public class Child extends Parent{
    public void childMethod(){
        System.out.println("childMethod");
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.ParentMethod();
        child.childMethod();



    }
    //상속관계에서 부모방향으로 찾아 올라갈 수 있지만 자식방향으로 찾으러 내려갈 수는 없다.
}
