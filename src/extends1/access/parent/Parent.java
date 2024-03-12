package extends1.access.parent;

public class Parent {
    public int publicValue;
    protected int protectedValue;
    int defaultValue;
    private int privateValue;

    public void publicMethod(){
        System.out.println("parent.publicMethod");
    }
    private void privateMethode(){
        System.out.println("patent.privateMethod");
    }
    protected void protectedMethod(){
        System.out.println("parent.protected");
    }
    void defaultMethode(){
        System.out.println("parent.defaultMethode");
    }

    public void printParent(){
        System.out.println("==parent 메서드 안==");
        System.out.println("publicValue"+publicValue);
        System.out.println("protectedValue = " + protectedValue);
        System.out.println("defaultValue = " + defaultValue);
        System.out.println("privateValue = " + privateValue);

        //
        defaultMethode();
        privateMethode();
    }
}
