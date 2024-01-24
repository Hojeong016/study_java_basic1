package Class;

public class Class2 {
    public static void main(String[] args) {
       /* Student student1 = new Student(); //student1 객체 생성
        Student student1 = X001; // new Student()의 결과로 x001이라는 참조값을 반환
        student1 = x001; // 최종 결과
        */

        //실제 참조값 출력
        Student student1= new Student();
        Student student2= new Student();

        System.out.println(student1); //결과 : Class.Student@1b28cdfa (@ 앞자리 : 패키지 + 클래스의 정보 @ 뒤 16진수: 참조값)
        System.out.println(student2); //결과 : Class.Student@eed1f14

        //각각 다른 인스턴스이며 메모리에 2개의 객체로 저장된다.

    }

}
/* 사용자 정의 타입을 만들기 위해서는 클래스라는 설계도가 필요하다.
설계도를 기반으로 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라고 한다.
클래스를 통해 사용자가 원하는 데이터 타입을 마음껏 정의할 수 있다.
//새로운 개념을 도입하려면 클래스를 만들면 된다.
// new 로 만들면 참조값을 담아두면 그 참조값을 통해 실제 메모리의 객체의 멤버 변수에 접근하여 읽어 내면 된다 .

용어 정리
클래스는 설계도이고 이 설계도를 기반으로 만들어진 실체를 객체, 인스턴스라고 한다.

참조값을 담는다.
: new 키워드를 통해 객체를 생성하게 되면 참조값을 반환한다. 앛서 선언한 변수인 Student students1  에 생성된 참조값을 보관한다,
참조값을 변수에 보관해야하는 이유
- 객체를 생성하는 Student students1 = new Student()에는 아무런 이름이 없다. Student 클래스 기반으로 메모리에 실제 객체를 만드는 것 뿐이다. 따라서 생성된 객체에
접근할 수 있는 방법이 필요하다. 따라서 참조값을 보관함으로서  저장된 참조값을 통해 실제 메모링[ 존재하는 객체에 접근가능하다.


 */