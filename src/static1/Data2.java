package static1;

public class Data2 {

    private String userName;
    private static int totalUser;

    public void total(String userName){
        this.userName = userName;
        totalUser++;
        System.out.println("현재 누적 멤버 :"+totalUser);
    }

}
