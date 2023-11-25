package org.wgcodecompany.inheritance;

public class InheritanceDemoForBikes {

    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(20, 10, 12);
        System.out.println("Gear on the bike is:" + mountainBike.gear);
        System.out.println("Speed on the bike is:" + mountainBike.speed);
        System.out.println("Seat Height on the bike is:" + mountainBike.setSeatHeight);

        mountainBike.applyBrake(2);
        System.out.println("Speed on the bike after using the brake is:" + mountainBike.speed);

    }
}
