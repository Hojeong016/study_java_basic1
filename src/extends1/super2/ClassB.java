package extends1.super2;

public class ClassB extends ClassA {

//  public  ClassB(){
// System.out.println("ClassB 기본 생성자" );
//    }
    public ClassB(int a){
       //super(); // 부모 클래스에 기본 생성자가 있기 때문에 super 생략 가능
        System.out.println("ClassB 생성자 : " + a);
    }
    public ClassB(int a, int b){
        // super();
        System.out.println("ClassB 생성자 : " + a+"+"+b);
    }

}
