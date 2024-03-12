package access.a;
//접근제어자(필드,메서드)
public class AccessData {
    //모든 외부의 호출을 허용
    public int publicField;
    //같은 패키지 안에서 만 호출 허용
    int defaultField;
    private int privateField;

    protected int protectedField;

//모든 외부호출을 막음

    public void publicMethod(){
        System.out.println(" publicMethod 호출:"+ publicField);
    }

    void defaultMethod(){
        System.out.println(" defaultMethod 호출:"+ defaultField);
    }

    private void privateMethod(){
        System.out.println(" privateMethod 호출:"+ privateField);
    }

    protected void  protectedMethod(){
        System.out.println(" protectedMethod 호출:"+ protectedField);
    }
    public void innerAccess(){
        System.out.println("내부호출");
        publicField = 100;
        defaultField = 200;
        privateField = 300;
        protectedField = 400;
        publicMethod();
        defaultMethod();
        privateMethod();
        protectedMethod();
    }
}
