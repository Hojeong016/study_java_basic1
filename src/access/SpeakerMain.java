package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.volumeUp();
        speaker.volumeUp();
        speaker.volumeDown();
        speaker.showVolume();

        //필드에 직접 접근
        System.out.println("Vloume 필드 직접 접근");
        //speaker.volume = 200;
        //volume has private access in access.Speaker 오류 (private 로 되어있어 접근을 못함)
        speaker.showVolume();
    }
}
//위 경우 볼륨이 100이 넘어가지 않게 설정을 해두었지만 필드에 직접 접근하여 원하는 값을 직접 설정하여 제한이 흐지부지,,
//Speaker 객체를 사용하는 사용자는 볼륨 필드와 메서드 모두 접근이 가능하다.
//이를 해결하기 외부접근을 막을 수 있는 장치가 필요하다ㅣ
