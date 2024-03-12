package construct;

public class MethodInitMain1 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.name ="user1";
        member1.age =45;
        member1.grade = 60;

        MemberInit member2 = new MemberInit();
        member2.name ="user2";
        member2.age =35;
        member2.grade = 70;

        MemberInit[] members = {member1,member2};

        for( MemberInit s : members){
            System.out.println("이름 :"+ s.name + " 나이 :"+ s.age + " 성적 :" + s.grade);
        }
    //__> 메서드 사용하여 반복 코드 줄이기.

    }
}
