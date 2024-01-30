package ref;

public class MethodChange2 {

    public static void main(String[] args) {
        Data data2 = new Data();
        data2.value = 10;
        System.out.println("메소드 호출 전 : " + data2.value); //10
        ChangeReference(data2);
        System.out.println("메소드 호출 후 : " + data2.value); //20
    }

   /*public static void ChangeReference(int x){
        x=20;
    }*/

    public static void ChangeReference(Data dataX){
        dataX.value = 20;
    }
}

//자바에서 매개변수는 항상 값에 의해 전달된다. 그러나 이 값이 실제 값이냐, 참조값이냐에 따라 동작이 달라진다.
//기본형
//참조형
