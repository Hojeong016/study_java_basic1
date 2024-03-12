package Poly.car1;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class K3Car implements Car{
    @Override
    public void startEngine() {
        System.out.println("k3car.startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("k3car.offEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("k3car. pressAccelerator");
    }
}
