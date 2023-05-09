package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

class TelevisionMuteTest {
    public static void main(String[] args) {
        Television tv = new Television("Samsung", 32);
        System.out.println(tv);

        tv.mute();
        System.out.println(tv);

        tv.mute();
        System.out.println(tv);

        tv.mute();
        System.out.println(tv);

        tv.setVolume(50);
        System.out.println(tv);

        tv.mute();
        System.out.println(tv);

        tv.setVolume(101);
        System.out.println(tv);

        tv.setVolume(100);
        System.out.println(tv);
    }
}