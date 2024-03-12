package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    /*   MemberConstruct(String name, int age){
           this.name = name;
           this.age = age;
           this. grade =70; // grade가 없는 유저는 70을 기본값으로 지정함
       }*/
    //this()를 사용하면 생성자 내부에서 생성자를 호출하여 중복코드를 제거할 수있다
    MemberConstruct(String name, int age) {
        this(name,age,70); //규칙 : this()는 무조건 첫 줄에 위치
        //

    }


    //클래스의 이름과 같은 생성자 호출//리턴타입이 없음
    MemberConstruct(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

