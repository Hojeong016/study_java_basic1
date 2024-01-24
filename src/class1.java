public class class1 {
    String name;
    int age;
    int grade;
//멤버변수 / 필드 : 클래스에 소속된 멤버 변수
    // 클래스는 관대상 대문자도 시작한다. 변수는 소문자 .
    public void information(String name, int age, int grade){
        System.out.println("이름 :"+ name + " 나이: "+age+" 성적: "+ grade);
    }


    public static void main(String[] args) {
        class1 student1 = new class1();
        class1 student2 = new class1();

        student1.information("학생1",15,90);
        student2.information("학생2",16,80);
    }
}

/*package class1;

public class ClassStart1 {

    public static void main(String[] args) {
        String student1Name = "학생1";
        int student1Age = 15;
        int student1Grade = 90;

        String student2Name = "학생2";
        int student2Age = 16;
        int student2Grade = 80;

        System.out.println("이름:" + student1Name + " 나이:" + student1Age + " 성적:" + student1Grade);
        System.out.println("이름:" + student2Name + " 나이:" + student2Age + " 성적:" + student2Grade);
    }
문제: 학생이 늘어날 때 마다 변수를 추가로 선언해야하고 그에 따라 코드도 늘어난다.
해결 : 배열

내가 부족한 개념 부분 - 배열

Array --->

배열을 사용하면 참조값을 통해서 실제 배열에 접근하고 인덱스를 통해 원하는 요소를 찾는다
즉 배열 변수가 배열 그자체가 아닌
변수에는 메모리 속 배열의 참조값이 담겨있다고 생각하자

기본형: 변수에 사용할 수 있는 값을 직접 넣을 수 있는 데이터 타입
참조형 : 데이터에 접근하기 위한 참조(주소)를 저장하는 데이터 타입

그럼 왜 배열은 참조형을 사용할까?
기본형은 선언과 동시에 사이즈가 지정되어있음
하지만 배열은 사용자의 입력에 따라 동적으로 사이즈를 변경할 수 있다. (동적 메모리 할당)
참조형을 사용하므로서 동적으로 크기가 변해서 유연성을 제공할 수 있다.

기본형은 -  사용값 저장 - 더 빠르고 메모리를 효율적으로 처리한다.... 사실 큰 차이가 있진 않다고 한다,, ㅎ
참조형은 - 객체의 참조를 저장 - 더 복잡한 데이터의 구조를 만들고 관리할 수 있다.

변수명. length
= 배열의 길이를 제공하는 기능
= 조회만 가능하다
- for문에 사용할때 종료조건에 넣어 사용이 유용하다.

{}를 통해 생성을 동시에 편리하게 초기화 하는 기능을 제공한다.


}*/


