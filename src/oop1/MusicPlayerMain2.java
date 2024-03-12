package oop1;

public class MusicPlayerMain1 {

    //절차 지향 코드
    /*요구 사항
    1. 음악 플레이어를 크고 끌 수 있어야 한다.
    2. 음악 플레이어의 볼륨을 증가, 감소 할 수 있어야 한다.
    3. 음악 플레이어의 상태를 확인 할 수 있어야 한다.
     */

    public static void main(String[] args) {

        //음악 플레이어의 볼륨, 상태 초기값 지정
        int volume =0;
        boolean isOn = true;

        //음악플레이어 키기
        OnAndOff = true;
        System.out.println("플레이어를 실행시킵니다.");

        //볼륨 증가
        volume ++;
        System.out.println("볼륨 증가:"+ volume);
        //볼륨 증가
        volume ++;
        System.out.println("볼륨 증가:"+ volume);
        //볼륨 감소
        volume --;
        System.out.println("볼륨 감소:"+ volume);


        //상태 확인
        if (isOn){
            System.out.println("플레이어가 실행되고 있습니다.");
        }else {
            System.out.println("플레이어가 종료되었습니다.");
        }

        //종료
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");



    }
}
