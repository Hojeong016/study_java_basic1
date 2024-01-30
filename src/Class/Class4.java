package Class;

public class Class4 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.Age = 15;
        student1.grade = 90;

        Student student2= new Student();
        student2.name = "학생2";
        student2.Age = 16;
        student2.grade = 80;

        Student student3= new Student();
        student3.name = "학생3";
        student3.Age = 18;
        student3.grade = 70;

        Student[] students= {student1,student2,student3};

       /* for(int i = 0; i < students.length; i++){
            System.out.println("이름 :" + students[i].name + " 나이 :"+ students[i].Age + " 성적 :"+ students[i].grade);
        }

        //for 문 최적화??
        //방법 1 : 반복 요소를 변수에 담아 처리하기*/
        /*for(int i = 0; i < students.length; i++){
            Student s = students[i];
            System.out.println("이름 :" + s.name + " 나이 :"+ s.Age + " 성적 :"+ s.grade);
        }
        //방법 2 : 향상된 for 문( for each ) 사용하기
       for(Student s : students){
           System.out.println("이름 :" + s.name + " 나이 :"+ s.Age + " 성적 :"+ s.grade);
       }*/
       //단축키 : iter
       //for each 문은 따로 반복 횟수를 명시적으로 주는 것이 불가능하고, 한 단계씩 순차적으로 반복할 때만 사용이 가능하다는 제약이 있다.
        }
    }

