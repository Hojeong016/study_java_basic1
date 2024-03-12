package Poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);
        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent){
        parent.parentMethod();

        if(parent instanceof Child){ //인스턴스에 child가 있다면 메서드를 호출
           Child child =(Child)parent;
           child.childMethod();
            //((Child)parent).childMethod();
        }
        //자바 16인 경우
        //if(parent instanceof Child child){ // 변수 선언 바로 가능하다.
        //           child.childMethod();
    }
}
