package org.wgcodecompany.inheritance;

public class Bicycle {

    protected int gear;
    protected int speed;

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void applyBrake(int decrement){
        speed -= decrement;
    }

    public void increaseSpeed(int increment){
        speed += increment;
    }
}
