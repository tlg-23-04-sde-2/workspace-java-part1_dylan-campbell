/*
 *
 */
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    boolean isEven(int value) {
        return value % 2 == 0;
    }

    /*
     * Returns a random integer between 1 and 14.
     */
    int getRandomInt() {
        int result = 0; // declare return value

        double rand = (Math.random()); // stores double value [0.0, 1.0) in rand
        double scaled = (rand * 14) + 1; // expands to the range [1.0, 15.0)
        double floored = Math.floor(scaled); // now {1.0, 2.0, 3.0, ... , 14.0}

        // downcast from double to int
        // note - this will truncate the double, so Math.floor() wasn't necessary
        result = (int)floored; // result now an integer
        return result;
    }

    /*
     * Returns a random integer between 'min' and 'max' (inclusive), e.g., from 5 to 10.
     */
    int getRandomInt(int min, int max) {
        int result = 0; // return value
        int range = max - min + 1;

        result = (int)(Math.random() * range) + min;

        return result;
    }
}