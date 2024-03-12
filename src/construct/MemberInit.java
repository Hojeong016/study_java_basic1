package construct;
//4. 생성자
//생성자가 필요한 이유

//초기 값 설정 반복 코드 - 메서드 사용해서 회원 초기화해보기 - 반복 제거 (매개 변수 사용)
// 하지만
public class MemberInit {
    String name;
    int age;
    int grade;

    //추가
    void initMember(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

//this : 자기 자신의 참조값
// 멤버변수와 매개 변수의 이름이 같으면 어떻게 구분해야할까?
/* 매개뱐수가 우선순위를 가진다 (코드 블럭의 위치로)
//this = 인스턴스의 멤버변수로 접근
 */
//정리
//= 매개변수의 이름과 멤버변수의 이룸이 같은 경우에는 this를 사용하여 구분을 해주어야한다.
//=this는 멤버변수 자기 자신 (참조값)을 가진다.