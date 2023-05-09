package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

class TelevisionValidationTest {

    public static void main(String[] args) {
        Television tv = new Television();

        // test brand constraint
        tv.setBrand("Samsung");
        System.out.println(tv);

        tv.setBrand("LG");
        System.out.println(tv);

        tv.setBrand("Sony");
        System.out.println(tv);

        tv.setBrand("Toshiba");
        System.out.println(tv);

        tv.setBrand("INVALID");
        System.out.println(tv);

        // test volume constraint
        tv.setVolume(0);                                  // should stick
        System.out.println("volume: " + tv.getVolume());  // should be 0

        tv.setVolume(100);                                // should stick
        System.out.println("volume: " + tv.getVolume());  // should be 100

        tv.setVolume(-1);                                 // error message, volume not set
        tv.setVolume(101);                                // error message, volume not set
        System.out.println("volume: " + tv.getVolume());  // should still be 100, from before
    }
}