package Poly.Car0;

import java.sql.SQLOutput;

public class Driver {
    private K3Car k3Car;
    private Model3Car model3Car; //추가

    public void setK3Car(K3Car k3Car){
        this.k3Car = k3Car;
    }

    public void setModel3Car(Model3Car model3Car){ //추가
        this.model3Car = model3Car;
    }

//    public void drive(){
//        System.out.println("자동차를 운전합니다.");
//        k3Car.startEngine();
//        k3Car.offEngine();
//    }
//
//    public void M3drive(){ //추가
//        System.out.println("자동차를 운전합니다.");
//        model3Car.startEngine();
//        model3Car.offEngine();
//    }
    public void drive(){
        if( k3Car != null){
            System.out.println("자동차를 운전합니다.");
            k3Car.startEngine();
            k3Car.offEngine();
        } else if (model3Car != null) {
            System.out.println("자동차를 운전합니다.");
            model3Car.startEngine();
            model3Car.offEngine();
        } // 나는 메서드를 분리하였는데 if 문을 사용하여 작성할 수 있다.. 이렇게 작성헸을 때 메서드를 분리하는 것과 비교하면 어떤 점이 좋을까?
    }
}
