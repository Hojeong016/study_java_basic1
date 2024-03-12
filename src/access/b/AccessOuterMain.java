package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        data.publicField=3;
        data.publicMethod();

        //호출불가
        //data.defaultField=3;
        //data.defaultMethod();

        //   data.privateField=3;
        //   data.privateMethod();

        data.innerAccess();
    }
}
