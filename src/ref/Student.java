package ref;


public class StudentRef {


    public static void main(String[] args) {
        Student student1 = new Student();
        Information(student1,"호정",15,90);

        Student student2 = new Student();
        Information(student2,"희진",16,80);


        StudentInformation(student1);
        StudentInformation(student2);
    }
    // 학생의 정보를 입력하는 메서드
    public static void Information(Student student, String name, int Age, int grade){
        student.name = name;
        student.Age =Age;
        student.grade =grade;
    }
    //학생의 정보를 출력하는 메서드
    public static void StudentInformation(Student student) {
        System.out.println("이름: "+student.name + " 나이:"+student.Age+" 성적:"+student.grade);
    }
}
//처음 작성한 코드(class1)와 두번째로 작성한 코드 중 무엇이 더 상황에 맞고 효율적일까??
//1, Ref
/*
    public static void StudentInformation(Student student){
        System.out.println("이름: "+student.name + " 나이:"+student.Age+" 성적:"+student.grade);
    }
}
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name="호정";
        student1.Age=15;
        student1.grade=45;

        Student student2 = new Student();
        student2.name="오징어";
        student2.Age=30;
        student2.grade=20;

        StudentInformation(student1);
        StudentInformation(student2);
    }


//학생의 정보를 출력하는 메소드

public static void StudentInformation(Student student){
    System.out.println("이름: "+student.name + " 나이:"+student.Age+" 성적:"+student.grade);
}
} */