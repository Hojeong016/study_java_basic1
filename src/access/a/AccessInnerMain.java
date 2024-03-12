package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        data.publicField=3;
        data.publicMethod();

        data.defaultField=3;
        data.defaultMethod();

        data.protectedField = 4;
        data.protectedMethod();

        //data.privateField=3;
       // data.privateMethod();

        data.innerAccess();

        //innerAccess가 public으로 되어있어서 접근 가능
    }
}
