package Class;

public class Class3 {
    //객체 사용
    /*- 객체가 지닌 멤버 변수에 접근하려면 . 키워드 사용 )
    */
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1"; //@1b28cdfa. name 학생1의 값이 보관

        //객체값 읽기
        System.out.println("이름 : " + student1.name);// - 아쉬움 ,.. 새로운 학생을 출력할 때 마다 출력 부분도 계속 추가해야한다. 해결 : 배열 사용
        System.out.println(student1);
       // System.out.println("이름 : " + @119d7047.name);
        // @119d7047에 있는 Student의 객체 student1의 멤버변수 name이 가진 학생1을 찾아 읽어 제공한다.
    }
}
