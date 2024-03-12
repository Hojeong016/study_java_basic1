package final1;

public class ConstantMain1 {

    public static void main(String[] args) {
//        System.out.println("프로그램 최대 사용자 수"+ 1000);
        System.out.println("프로그램 최대 사용자 수" + Constant.MAX_USERS);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process(int currentUserCount) {
        System.out.println("참여자 수 : " + currentUserCount);
//        if(1000 < currentUserCount){
        if (Constant.MAX_USERS < currentUserCount) {
            System.out.println("대기자로 등록합니다.");
        } else {
            System.out.println("프로그램에 참여합니다.");
        }
    }
}

//1000 숫자를 중복, 1000 숫자로 보고 다른 개발자가 어떤 의미를 가지니 숫자인지 파악하기 어려줄 수 있음