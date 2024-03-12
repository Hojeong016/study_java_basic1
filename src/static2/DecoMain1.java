package static2;

import java.util.Scanner;

public class DecoMain1 {

    public static void main(String[] args) {
//        DecoUtil1 srt = new DecoUtil1();
//        System.out.println(srt.deco("안녕하세요"));
//        DecoUtil1.deco("안녕하세요");?
//        System.out.println( DecoUtil1.deco("안녕하세요"));

        // 인스턴스를 생성 후 메서드 접근
//        String a = "안녕하세요";
//        DecoUtil1 util = new DecoUtil1();
//        String deco = util.deco(a);
//
//        System.out.println(deco);

        //static 영역으로 바로 접근

        String a = " 안녕하세요";
        String deco= DecoUtil1.deco(a);
        System.out.println(deco);

    }

}
