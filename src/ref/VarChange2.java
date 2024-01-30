package ref;

public class VarChange2 {
    public static void main(String[] args) {

        //참조형 대입
        //실제 사용하는 객체가 아닌 객체의 위치를 가르키는 참조값을 복사하여 대입한다.
        //인스턴스를 복사하는 것이 아닌 변수에 들어있는 참조값을 복사하여 전달한다.

        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("dataA의 참조값 = "+ dataA);
        System.out.println("dataB의 참조값 = "+ dataB);
        System.out.println("dataA.value = "+ dataA.value); //10
        System.out.println("dataB.value = "+ dataB.value); //10

        //dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value = "+ dataA.value);//20
        System.out.println("dataB.value = "+ dataB.value);//20

        //dataB 변경
        dataB.value=30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value = "+ dataA.value);//30
        System.out.println("dataB.value = "+ dataB.value);//30
    }
}
