package org.wgcodecompany.inheritance;

class MountainBike extends Bicycle{
    int setSeatHeight;

    public MountainBike(int gear, int speed, int setSeatHeight) {
        super(gear, speed);
        this.setSeatHeight = setSeatHeight;
    }

    public void setSetSeatHeight(int setNewSeatHeight) {
        setSeatHeight = setNewSeatHeight;
    }
}
