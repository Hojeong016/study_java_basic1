package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();

        System.out.println("bigdata.count ="+ bigData.count);
        System.out.println("bigdata.data ="+ bigData.data);


        //NullPointerException
        System.out.println("bigdata.data.value ="+ bigData.data.value); //?

        /* BigData bigData = new BigData(); bigdata 참조값 = x001
        System.out.println("bigdata.data.value ="+ x001.data.value);
         x001.data = null
         따라서 null.value 가 되어 버림.
         null값 즉 참조값이 없는 곳을 찾아가게 됨 =  NullPointerException 에러가 뜸.

         해결

         1 . bigData.data를 NULL로 하지 않는다 ( 참조할 곳을 주면 된다. )
         public class BigData {
         Data data = new Data(); //null
         int count; //0
         : BigData bigData = new BigData();

         bigData.data.value);에서 value로 갈 수 있는 일종의 통로가 생긴다.

         2.
        BigData bigData = new BigData();
        bigData.data = new Data();

        System.out.println("bigdata.count ="+ bigData.count);
        System.out.println("bigdata.data ="+ bigData.data);


        //NullPointerException
        System.out.println("bigdata.data.value ="+ bigData.data.value); //?


        2.

         */



    }
}
