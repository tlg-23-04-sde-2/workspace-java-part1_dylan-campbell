package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;
import java.util.Arrays;

class TelevisionClientArgs {
    public static void main(String[] args) {
        // must first check for the presence of your (required) 3 arguments
        if (args.length < 3) {
            String usage = "Usage: java TelevisionClientArgs <brand> <volume> <display>";
            String example = "Example: java TelevisionClientArgs Samsung 32 PLASMA";
            String note1 = "Note: supported displays are " + Arrays.toString(DisplayType.values());
            String note2 = "Note: supported brands are " + Arrays.toString(Television.VALID_BRANDS);
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note1);
            System.out.println(note2);
            return;  // early return from main(), application exits
        }

        // STEP 1: convert the arguments into proper types
        String brand = args[0];
        int volume = Integer.parseInt(args[1]);
        DisplayType display = DisplayType.valueOf(args[2].toUpperCase());

        // STEP 2: create a Television object from these ingredients
        Television tv = new Television(brand, volume, display);

        // STEP 3: print it and congratulate them on their order
        System.out.println("Congratulations on your order, it will arrive soon.");
        System.out.println(tv);  // toString() automatically called
    }
}