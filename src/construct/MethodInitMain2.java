package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        intMember(member1,"user1",45,70 );

        MemberInit member2 = new MemberInit();
        intMember(member2,"user2",35,66 );

        MemberInit[] members = {member1, member2};

        for (MemberInit s : members) {
            System.out.println("이름 :" + s.name + " 나이 :" + s.age + " 성적 :" + s.grade);
        }
    }

    static void intMember(MemberInit member, String name, int age, int grade){
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
//intMember 메서드를 사용하여 반복을 제거 하였다.. 하지만 MemberInit의 객체의 멤버변수를 사용한다.
//즉 기능과 데이터가 따로 분리되어있다. 따라서 속성과 기능을 한 곳에 두는 방법을 고민해보자.