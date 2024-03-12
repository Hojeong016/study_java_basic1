package oop1;

public class MusicPlayerMain4 {


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

    //캡슐화와 모듈화
    //장점, 기능과 상태가 하나의 클래스로 캡슐에 담겨있어 수정사항이 생길 시 캡슐 내부에서만 수정하면 되기 떄문에
    //유지 보수가 더욱 간편해졌다는 이점이 있다.
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();

        musicPlayer.on();
        musicPlayer.volumeUp();
        musicPlayer.volumeUp();
        musicPlayer.volumeDown();
        musicPlayer.showPlayer();
        musicPlayer.off();
    }
}
