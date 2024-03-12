package final1;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        final Data A = new Data(5);
      //  A = new Data(7);

        // A의 초기값을 5로 설정 해두어서 ,,,

        System.out.println(A.value);
        A.value = 20; // 변경 가능한 이유는 final이 붙은 것만 변경 불가능하며 final 이 붙어 있지 않은 인스턴스는 변경가능하다




    }
}
