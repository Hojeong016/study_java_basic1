package ref;

public class StudentDTO {
    //DTO의 역할을 하는 것일까?

    String name;
    int Age;
    int grade;

    public StudentDTO(String name, int age, int grade) {
        this.name = name;
        Age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}



    /*  String name;
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
}*/



