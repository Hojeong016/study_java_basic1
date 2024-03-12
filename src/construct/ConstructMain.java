package construct;

public class ConstructMain {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1",54,87);
        MemberConstruct member2 = new MemberConstruct("user2",34);//생성자의 매개변수에 맞춰 인수 전달

        MemberConstruct[] memberConstructs = {member1, member2};

        for(MemberConstruct s : memberConstructs){
            System.out.println("이름 :"+ s.name + " 나이 :"+ s.age + " 성적 :" + s.grade);
        }
    }
}
/*장점
1. 메서드 중복 호출 제거
2. 객체를 생성할 때 직접 정의한 생성자가 있다면 직접 정의한 생성자를 반드시 호출해야한다는 것 (제약이 있다는 것)
생성자 사용하면서 아무런 정보가 없는 유령회원울 원천 차단 /즉 필수값 입력을 보장받을 수 있다.
-좋은 프로그햄은 무한한 자유도가 주어지는 프로그램이 아니라 적절한 제약이 있는 프로그램이다.
 */

/* 기본 생성자
생성자를 만들지 않았는 데 생성자를 사용한 적이 있다.
기본 생성자 : 매개변수가 없는 생성자를 의미한다.
- 클래스에 생성자가 없으면 자바 컴파일러는 자동으로 기본 생성자를 만들어준다.
- ""하지만 매개변수를 가진 생성자가 클래스 속에 한 개라도 있으면 자바는 기본 생성자를 만들어 주지 않는다.""-- 따라서 이경우 개발자가 따로 정의 해야한다.

기본 생성자를 왜 기본으로 만들어 줄까??
- 막약 만들지 않는다면 생성자 기능이 필요하지 않는 경우에도 개발자가 하나하나 기본 생성자를 정의해야한다.
즉 생성지 기능을 사용하지 않을 떄도 많이 있기 때문에 자바가 이러한 편의 기능을 제공한다.
 */

/* 생성자 오버로딩
시험을 치고 들어온 학생,, 시험을 안치고 들어 온 학생,,, 분류 */
