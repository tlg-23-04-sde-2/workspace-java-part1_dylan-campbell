package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

/*
 * Client-side main-class to create a few instances of Television
 * and give them a basic test-drive.
 */
class TelevisionClient {

    public static void main(String[] args) {
        System.out.println(Television.getInstanceCount() + " instances.");

        Television tv1 = new Television();
        tv1.setBrand("Samsung");
        tv1.setVolume(32);
        tv1.setDisplay(DisplayType.OLED);

        Television tv2 = new Television("Sony", Television.MIN_VOLUME);
        tv2.setDisplay(DisplayType.LED);

        Television tv3 = new Television("LG");
        tv3.setVolume(Television.MAX_VOLUME);
        tv2.setDisplay(DisplayType.PLASMA);

        System.out.println();
        tv1.turnOn();
        tv2.turnOn();
        tv3.turnOn();

        System.out.println();
        System.out.println(tv1);
        System.out.println(tv2);
        System.out.println(tv3);

        System.out.println();
        tv1.turnOff();
        tv2.turnOff();
        tv3.turnOff();

        System.out.println();
        System.out.println(Television.getInstanceCount() + " instances.");
    }
}