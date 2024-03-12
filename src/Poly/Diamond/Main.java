package Poly.Diamond;

public class Main {
    public static void main(String[] args) {
        Chlid a = new Chlid();
        a.methodA();
        a.methodCommon();
        a.methodB();

        InterfaceA b = new Chlid();
        b.methodA();
        b.methodCommon();

        InterfaceB c = new Chlid();
        c.methodB();
        c.methodCommon();
    }
}
