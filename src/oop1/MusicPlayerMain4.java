package oop1;

public class MusicPlayerMain3 {

    //절차 지향 코드--> 객체 지향 코드
    //단계3: 메서드 추출 - 재사용될 가능성이 높은 기능들을 메서드로 묶어 추출해보자
    /*요구 사항
    1. 음악 플레이어를 크고 끌 수 있어야 한다.
    2. 음악 플레이어의 볼륨을 증가, 감소 할 수 있어야 한다.
    3. 음악 플레이어의 상태를 확인 할 수 있어야 한다.
     */
    /*장점
    1.중복 되는 코드를 줄일 수 있다.
    2.변경 사항이 생겼을 때 메서드 내부의 기능만 수정해도 된다.
    3.메서드의 이름을 사용하여 기능의 역할을 직관적으로 알 수 있다.

    이럼에도 불구하고 절차지향적으로 작성되었기 때문에 기능과 데이터가 구분되어있어
    유지보수에 어려움이 있다. 같은 데이터를 사용하는 메서드의 개수가 증가할 수 록 유지,보수해야하는 것이 증가하기 떄문이다.
    이는 객체지향프로그래밍으로 개선이 가능하다.
     */
    public static void main(String[] args) {

        MusicPalyerData data= new MusicPalyerData();


        //음악플레이어 켜기
        on(data);
        //볼륨 증가
        volumeUp(data);
        //볼륨 증가
        volumeUp(data);
        //볼륨 감소
        volumeDown(data);
        //종료
        off(data);
        //상태 확인
        showPlayer(data);


    }

    static void on(MusicPalyerData data){
        data.isOn = true;
        System.out.println("플레이어를 실행시킵니다.");
    }
    static void off(MusicPalyerData data){
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
    static void volumeUp(MusicPalyerData data){
        data.volume ++;
        System.out.println("볼륨:"+  data.volume);
    }
    static void volumeDown(MusicPalyerData data){
        data.volume --;
        System.out.println("볼륨:"+  data.volume);
    }
    static void showPlayer(MusicPalyerData data){
        if ( data.isOn){
            System.out.println("플레이어가 실행되고 있습니다.");
        }else {
            System.out.println("플레이어가 종료되었습니다.");
        }
    }

}
