package static1;


public class DataCountMain1 {
    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println("count = "+data1.count);

        Data1 data2 = new Data1("B");
        System.out.println("count = "+data2.count);

        Data1 data3 = new Data1("C");
        System.out.println("count = "+data3.count);


        //<결과>
        //count = 1
        //count = 1
        //count = 1
        /* 인스턴스 1,2,3은 서로 다르게 힙 영역에 생성됨.
        따라서 카운트 연산 로직 또한 다른 인스턴스와 같이 객체 생성할 떄 새롭게 만들어지기 떄문에 카운터가 한개 증가하고 해당 메소드는 종료된다.
         인스턴스에 사용되는 멤버변수 count 값은 인스턴스 끼리 값이 공유되지 않음. */
        //그럼 count를 원하는 값으로 얻으려면??.. 객체 끼리의 변수를 서로 공유해야겠다....

    }
}
