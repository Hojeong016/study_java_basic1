package Poly.overriding;

public class Child extends Parent{
    String value = "child";

    @Override
    public void method() {
        System.out.println("child.method");
    }
}
