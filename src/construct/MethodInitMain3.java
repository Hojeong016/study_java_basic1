package construct;

public class MethodInitMain3 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.initMember("user1",45,70 );

        MemberInit member2 = new MemberInit();
        member2.initMember ("user2",35,66 );
//객체를 생성하고 바로 초기값을 할당 해야하는 경우가 많아 -- 메서드를 매번 만들어야 한다. 그래서 대부분 객체지향 언어는 객체를 생성하는 시점에서 필요한 기능릏 더
        //편하게 수핼 할 수 있도록 생성자라는 기능을 제공 --  객체를 생겅하는 시점에서 바로 필요한 기능을 사용가능하다.
        MemberInit[] members = {member1, member2};

        for (MemberInit s : members) {
            System.out.println("이름 :" + s.name + " 나이 :" + s.age + " 성적 :" + s.grade);
        }
    }
}

