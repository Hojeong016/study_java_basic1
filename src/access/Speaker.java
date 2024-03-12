package access;
//요구사항
/*- 스피커는 음량을 높이고 내리고, 현재 음량을 확인할 수 있는 단순한 기능을 제공한다.
- 음량이 100을 절대로 넘으면 안된다.*/

public class Speaker {
    //int volume =0;
//필드 막기!! private: 모든 외부 접근을 막음
    private int volume =0;
    public Speaker(int volume){
       this.volume = volume;
    }
    void volumeUp(){
        if(volume >=100){
            System.out.println("음량을 증가할 수 없습니다. 최대 음량은 100입니다.");
        }else {
            volume += 10;
            System.out.println("음량이 10 증가했습니다.");
        }
    }
    void volumeDown(){
        volume -=10;
        System.out.println("음량이 감소합니다.");
    }

    void showVolume(){
        System.out.println("현재 볼륨 : "+ volume);
    }
}
