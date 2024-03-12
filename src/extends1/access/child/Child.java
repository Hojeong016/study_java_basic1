package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
   public void call(){
       publicValue=1; //
       protectedValue=1; // 같은 패키지 내에서 접근 가능, 상속 관계 시 접근 가능
       //defaultValue=1;// 같은 패키지 내에서 만 접근 가능
       //privateValue=1;// 외부 호출 불가

       protectedMethod();
       publicMethod();

       printParent();
   }

    public static void main(String[] args) {
        Child child = new Child();
        child.call();
    }

    }
