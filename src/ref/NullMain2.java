package ref;

import java.sql.SQLOutput;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        //data.value = 10; //(dot을 통해 참조값을 찾아갔는데 null 이다. 즉 찾아갈 수 있는 참조값이 없다.)
        System.out.println("data =" +  data); // 수행되지 않음.
        //java.lang.NullPointerException: Cannot assign field "value" because "data" is null
    }
}
