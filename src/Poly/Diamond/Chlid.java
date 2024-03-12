package Poly.Diamond;

public class Chlid implements InterfaceA,InterfaceB{

    @Override
    public void methodA() {
        System.out.println("Child.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("child.MethodB");
    }

    @Override
    public void methodCommon() {
        System.out.println("child.methodCommon");
    }
}
