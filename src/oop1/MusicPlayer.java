package oop1;

//절차 지향 코드--> 객체지향
//단계4: 클래스와 메서드
    /*요구 사항
    1. 음악 플레이어를 크고 끌 수 있어야 한다.
    2. 음악 플레이어의 볼륨을 증가, 감소 할 수 있어야 한다.
    3. 음악 플레이어의 상태를 확인 할 수 있어야 한다.
     */

/*
음악플레이어의 기능과 속성을 미리 생각해 보자.
속성 : Volume, isOn
기능 : volumeUP(), volumeDown(),on(),off(),showPlayer()
 */
public class MusicPlayer {

    //속성
    private int volume = 0;
    private boolean isOn =true;

    //기능
    void on(){
        isOn = true;
        System.out.println("플레이어를 실행시킵니다.");
    }
    void off(){
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
    void volumeUp(){
        volume ++;
        System.out.println("볼륨:"+ volume);
    }
    void volumeDown(){
        volume --;
        System.out.println("볼륨:"+ volume);
    }
    void showPlayer(){
        if (isOn){
            System.out.println("플레이어가 실행되고 있습니다.");
        }else {
            System.out.println("플레이어가 종료되었습니다.");
        }
    }
}
